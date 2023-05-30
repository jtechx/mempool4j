package com.jtechx.mempool4j.client;

import com.jtechx.mempool4j.model.address.Address;
import com.jtechx.mempool4j.model.address.UTXO;
import com.jtechx.mempool4j.model.block.Block;
import com.jtechx.mempool4j.model.block.BlockStatus;
import com.jtechx.mempool4j.model.fee.MempoolBlocksFees;
import com.jtechx.mempool4j.model.fee.RecommendedFees;
import com.jtechx.mempool4j.model.general.DifficultyAdjustment;
import com.jtechx.mempool4j.model.lightning.ChannelGeodata;
import com.jtechx.mempool4j.model.lightning.ChannelStatus;
import com.jtechx.mempool4j.model.lightning.ChannelsFromTXID;
import com.jtechx.mempool4j.model.lightning.ISPNodes;
import com.jtechx.mempool4j.model.lightning.LightningChannel;
import com.jtechx.mempool4j.model.lightning.LightningNode;
import com.jtechx.mempool4j.model.lightning.NetworkStats;
import com.jtechx.mempool4j.model.lightning.NodeHistoryStats;
import com.jtechx.mempool4j.model.lightning.NodeStats;
import com.jtechx.mempool4j.model.lightning.NodeStatsPerISP;
import com.jtechx.mempool4j.model.lightning.NodesChannelsSearchResult;
import com.jtechx.mempool4j.model.lightning.NodesInCountry;
import com.jtechx.mempool4j.model.lightning.TopNodes;
import com.jtechx.mempool4j.model.mempool.Mempool;
import com.jtechx.mempool4j.model.mempool.MempoolRecent;
import com.jtechx.mempool4j.model.mining.BlockFee;
import com.jtechx.mempool4j.model.mining.BlockFeeRate;
import com.jtechx.mempool4j.model.mining.BlockReward;
import com.jtechx.mempool4j.model.mining.BlockSizesAndWeights;
import com.jtechx.mempool4j.model.mining.HashrateDetails;
import com.jtechx.mempool4j.model.mining.MiningPoolDetails;
import com.jtechx.mempool4j.model.mining.MiningPoolHashrate;
import com.jtechx.mempool4j.model.mining.MiningPools;
import com.jtechx.mempool4j.model.mining.RewardStats;
import com.jtechx.mempool4j.model.mining.TimePeriod;
import com.jtechx.mempool4j.model.transaction.ChildrenPayForParent;
import com.jtechx.mempool4j.model.transaction.Transaction;
import com.jtechx.mempool4j.model.transaction.TransactionMerkleProof;
import com.jtechx.mempool4j.model.transaction.TransactionOutspend;
import com.jtechx.mempool4j.model.transaction.TransactionStatus;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface MempoolClient {

    // General

    /**
     *  Returns details about difficulty adjustment.
     */
    DifficultyAdjustment getDifficultyAdjustment() throws IOException;

    // Addresses

    /**
     * Returns details about an address. Available fields: address, chain_stats, and mempool_stats. chain_stats and mempool_stats each contain an object with tx_count, funded_txo_count, funded_txo_sum, spent_txo_count, and spent_txo_sum.
     * */
    Address getAddress(String address) throws IOException;

    /**
     * Get transaction history for the specified address/scripthash, sorted with newest first. Returns up to 50 mempool transactions plus the first 25 confirmed transactions. You can request more confirmed transactions using :last_seen_txid
     * */
    List<Transaction> getAddressTransactions(String address) throws IOException;

    /**
     * Get confirmed transaction history for the specified address/scripthash, sorted with newest first. Returns 25 transactions per page. More can be requested by specifying the last txid seen by the previous query.
     * */
    List<Transaction> getAddressTransactionsChain(String address) throws IOException;

    /**
     * Get unconfirmed transaction history for the specified address/scripthash. Returns up to 50 transactions (no paging).
     * */
    List<Transaction> getAddressTransactionsMempool(String address) throws IOException;

    /**
     * Get the list of unspent transaction outputs associated with the address/scripthash. Available fields: txid, vout, value, and status (with the status of the funding tx).
     */
    List<UTXO> getAddressUTXO(String address) throws IOException;

    // Block

    /**
     * Returns details about a block.
     * */
    Block getBlock(String hash) throws IOException;

    /***
     * Returns the hex-encoded block header.
     */
    String getBlockHeader(String hash) throws IOException;

    /***
     * Returns the hash of the block currently at :height.
     */
    String getBlockHeight(int height) throws IOException;

    /***
     * Returns the raw block representation in binary.
     */
    byte[] getBlockRaw(String hash) throws IOException;

    /***
     * Returns the confirmation status of a block. Available fields: in_best_chain (boolean, false for orphaned blocks), next_best (the hash of the next block, only available for blocks in the best chain).
     */
    BlockStatus getBlockStatus(String hash) throws IOException;

    /***
     * Returns the height of the last block.
     */
    int getBlockTipHeight() throws IOException;

    /***
     * Returns the hash of the last block.
     */
    String getBlockTipHash() throws IOException;

    /***
     * Returns the transaction at index :index within the specified block.
     */
    String getBlockTransactionId(String hash, int index) throws IOException;

    /***
     * Returns a list of all txids in the block.
     */
    List<String> getBlockTransactionIds(String hash) throws IOException;

    /***
     * Returns a list of transactions in the block (up to 25 transactions beginning at start_index). Transactions returned here do not have the status field, since all the transactions share the same block and confirmation status.
     */
    List<Transaction> getBlockTransactions(String hash, Optional<Integer> startIndex) throws IOException;

//    List<Transaction> getAllBlockTransactions(String hash) throws IOException;

    /***
     * Returns details on the past 15 blocks with fee and mining details in an extras field. If :startHeight is specified, the past 15 blocks before (and including) :startHeight are returned.
     */
    List<Block> getBlocks(Optional<Integer> startHeight) throws IOException;

    /**
     * Returns details on the range of blocks between :minHeight and :maxHeight, inclusive, up to 10 blocks. If :maxHeight is not specified, it defaults to the current tip.
     * */
    List<Block> getBlocksBulk(int minHeight, Optional<Integer> maxHeight) throws IOException;

    // Mining

    /**
     * Returns a list of all known mining pools ordered by blocks found over the specified trailing :timePeriod
     * */
    MiningPools getMiningPools(TimePeriod period) throws IOException;

    /**
     * Returns details about the mining pool specified by :slug
     * */
    MiningPoolDetails getMiningPool(String slug) throws IOException;

    /**
     * Returns average hashrates (and share of total hashrate) of mining pools active in the specified trailing :timePeriod, in descending order of hashrate
     * */
    HashrateDetails getMiningPoolHashrates(Optional<TimePeriod> period) throws IOException;

    /**
     * Returns all known hashrate data for the mining pool specified by :slug. Hashrate values are weekly averages
     * */
    List<MiningPoolHashrate> getMiningPoolHashrate(String slug) throws IOException;

    /**
     * Returns past 10 blocks mined by the specified mining pool (:slug) before the specified :blockHeight. If no :blockHeight is specified, the mining pool's 10 most recent blocks are returned.
     * */
    List<Block> getMiningPoolBlocks(String slug, Optional<Integer> blockHeight) throws IOException;

    /**
     * Returns network-wide hashrate and difficulty figures over the specified trailing :timePeriod:
     *  - Current (real-time) hashrate
     *  - Current (real-time) difficulty
     *  - Historical daily average hashrates
     *  - Historical difficulty
     * Valid values for :timePeriod are 1m, 3m, 6m, 1y, 2y, 3y. If no time interval is specified, all available data is returned.
     *
     * Be sure that INDEXING_BLOCKS_AMOUNT is set properly in your backend config so that enough blocks are indexed to properly serve your request.
     * */
    HashrateDetails getHashrate(TimePeriod period) throws IOException;

    /**
     * Returns block reward and total transactions confirmed for the past :blockCount blocks.
     * */
    RewardStats getRewardStats(int blockCount) throws IOException;

    /**
     * Returns average total fees for blocks in the specified :timePeriod, ordered oldest to newest. :timePeriod can be any of the following: 24h, 3d, 1w, 1m, 3m, 6m, 1y, 2y, 3y.
     *
     * For 24h and 3d time periods, every block is included and fee amounts are exact (not averages).
     * For the 1w time period, fees may be averages depending on how fast blocks were found around a particular timestamp. For other time periods, fees are averages.
     * */
    List<BlockFee> getBlockFees(TimePeriod period) throws IOException;

    /**
     * Returns average block rewards for blocks in the specified :timePeriod, ordered oldest to newest. :timePeriod can be any of the following: 24h, 3d, 1w, 1m, 3m, 6m, 1y, 2y, 3y.
     *
     * For 24h and 3d time periods, every block is included and block rewards are exact (not averages).
     * For the 1w time period, block rewards may be averages depending on how fast blocks were found around a particular timestamp. For other time periods, block rewards are averages.
     * */
    List<BlockReward> getBlockRewards(TimePeriod period) throws IOException;

    /**
     * Returns average feerate percentiles for blocks in the specified :timePeriod, ordered oldest to newest. :timePeriod can be any of the following: 24h, 3d, 1w, 1m, 3m, 6m, 1y, 2y, 3y.
     * For 24h and 3d time periods, every block is included and percentiles are exact (not averages).
     * For the 1w time period, percentiles may be averages depending on how fast blocks were found around a particular timestamp. For other time periods, percentiles are averages.
     * */
    List<BlockFeeRate> getBlockFeeRates(TimePeriod period) throws IOException;

    /**
     * Returns average size (bytes) and average weight (weight units) for blocks in the specified :timePeriod, ordered oldest to newest. :timePeriod can be any of the following: 24h, 3d, 1w, 1m, 3m, 6m, 1y, 2y, 3y.
     *
     * For 24h and 3d time periods, every block is included and figures are exact (not averages).
     * For the 1w time period, figures may be averages depending on how fast blocks were found around a particular timestamp. For other time periods, figures are averages.
     * */
    BlockSizesAndWeights getBlockSizesAndWeights(TimePeriod period) throws IOException;

    /**
     * Returns current mempool as projected blocks
     * */
    List<MempoolBlocksFees> getMempoolBlockFees() throws IOException;

    /**
     * Returns our currently suggested fees for new transactions
     * */
    RecommendedFees getRecommendedFees() throws IOException;

    /**
     * Returns current mempool backlog statistics
     * */
    Mempool getMempool() throws IOException;

    /**
     * Get the full list of txids in the mempool as an array. The order of the txids is arbitrary and does not match bitcoind.
     * */
    List<String> getMempoolTransactionIds() throws IOException;

    /**
     * Get a list of the last 10 transactions to enter the mempool. Each transaction object contains simplified overview data, with the following fields: txid, fee, vsize, and value.
     * */
    List<MempoolRecent> getMempoolRecent() throws IOException;

    // Transactions

    ChildrenPayForParent getChildrenPayForParent(String transactionId) throws IOException;

    Transaction getTransaction(String transactionId) throws IOException;

    String getTransactionHex(String transactionId) throws IOException;

    String getTransactionMerkleblockProof(String transactionId) throws IOException;

    TransactionMerkleProof getTransactionMerkleProof(String transactionId) throws IOException;

    TransactionOutspend getTransactionOutspend(String transactionId, int vout) throws IOException;

    List<TransactionOutspend> getTransactionOutspends(String transactionId) throws IOException;

    byte[] getTransactionRaw(String transactionId) throws IOException;

    TransactionStatus getTransactionStatus(String transactionId) throws IOException;

    // Lightning

    NetworkStats getNetworkStats(TimePeriod interval) throws IOException;

    NodesChannelsSearchResult getNodesChannels(String query) throws IOException;

    NodesInCountry getNodesInCountry(String country) throws IOException;

    List<NodeStats> getNodeStatsPerCountry() throws IOException;

    ISPNodes getISPNodes(int isp) throws IOException;

    NodeStatsPerISP getNodeStatsPerISP() throws IOException;

    TopNodes getTop100Nodes() throws IOException;

    List<LightningNode> getTop100_NodesByLiquidity() throws IOException;

    List<LightningNode> getTop100_NodesByConnectivity() throws IOException;

    List<LightningNode> getTop100_OldestNodes() throws IOException;

    LightningNode getNodeStats(String pubKey) throws IOException;

    List<NodeHistoryStats> getHistoricalNodeStats(String pubKey) throws IOException;

    LightningChannel getChannel(String channelId) throws IOException;

    ChannelsFromTXID getChannelsFromTXID(List<String> txIds) throws IOException;

    List<LightningChannel> getChannelsFromNodePubKey(String pubKey, ChannelStatus status, Optional<Integer> index) throws IOException;

    List<ChannelGeodata> getChannelGeodata() throws IOException;

    List<ChannelGeodata> getChannelGeodataForNode(String pubKey) throws IOException;
}
