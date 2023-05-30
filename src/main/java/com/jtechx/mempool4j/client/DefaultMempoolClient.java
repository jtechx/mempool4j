package com.jtechx.mempool4j.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


import static com.jtechx.mempool4j.client.Endpoints.*;

public class DefaultMempoolClient implements MempoolClient {
    private static final String MEMPOOL_DEFAULT_URL = "https://mempool.space";
    private final String mempoolUrl;
    private final ObjectMapper mapper;

    private DefaultMempoolClient(String mempoolUrl) {
        this.mempoolUrl = mempoolUrl;
        this.mapper = new ObjectMapper()
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public static DefaultMempoolClient create() {
        return new DefaultMempoolClient(MEMPOOL_DEFAULT_URL);
    }

    public static DefaultMempoolClient create(String mempoolUrl) {
        return new DefaultMempoolClient(mempoolUrl);
    }

    @Override
    public DifficultyAdjustment getDifficultyAdjustment() throws IOException {
        return mapper.readValue(execute(getFullUrl(DIFFICULTY_ADJUSTMENT), HttpMethod.GET).getBody(), DifficultyAdjustment.class);
    }

    @Override
    public Address getAddress(String address) throws IOException {
        return mapper.readValue(execute(getFullUrl(ADDRESS, address), HttpMethod.GET).getBody(), Address.class);
    }

    @Override
    public List<Transaction> getAddressTransactions(String address) throws IOException {
        return mapper.readValue(execute(getFullUrl(ADDRESS_TXS, address), HttpMethod.GET).getBody(),
                new TypeReference<List<Transaction>>() {
                });
    }

    @Override
    public List<Transaction> getAddressTransactionsChain(String address) throws IOException {
        return mapper.readValue(execute(getFullUrl(ADDRESS_TXS_CHAIN, address), HttpMethod.GET).getBody(),
                new TypeReference<List<Transaction>>() {
                });
    }

    @Override
    public List<Transaction> getAddressTransactionsMempool(String address) throws IOException {
        return mapper.readValue(execute(getFullUrl(ADDRESS_TXS_MEMPOOL, address), HttpMethod.GET).getBody(),
                new TypeReference<List<Transaction>>() {
                });
    }

    @Override
    public List<UTXO> getAddressUTXO(String address) throws IOException {
        return mapper.readValue(execute(getFullUrl(ADDRESS_UTXO, address), HttpMethod.GET).getBody(),
                new TypeReference<List<UTXO>>() {
                });
    }

    @Override
    public Block getBlock(String hash) throws IOException {
        return mapper.readValue(execute(getFullUrl(BLOCK, hash), HttpMethod.GET).getBody(), Block.class);
    }

    @Override
    public String getBlockHeader(String hash) throws IOException {
        return new String(execute(getFullUrl(BLOCK_HEADER, hash), HttpMethod.GET).getBody());
    }

    @Override
    public String getBlockHeight(int height) throws IOException {
        return new String(execute(getFullUrl(BLOCK_HEIGHT, height), HttpMethod.GET).getBody());
    }

    @Override
    public byte[] getBlockRaw(String hash) throws IOException {
        return execute(getFullUrl(BLOCK_RAW, hash), HttpMethod.GET).getBody();
    }

    @Override
    public BlockStatus getBlockStatus(String hash) throws IOException {
        return mapper.readValue(execute(getFullUrl(BLOCK_STATUS, hash), HttpMethod.GET).getBody(), BlockStatus.class);
    }

    @Override
    public int getBlockTipHeight() throws IOException {
        return Integer.parseInt(new String(execute(getFullUrl(BLOCK_TIP_HEIGHT), HttpMethod.GET).getBody()));
    }

    @Override
    public String getBlockTipHash() throws IOException {
        return new String(execute(getFullUrl(BLOCK_TIP_HASH), HttpMethod.GET).getBody());
    }

    @Override
    public String getBlockTransactionId(String hash, int index) throws IOException {
        return new String(execute(getFullUrl(BLOCK_TRANSACTION_ID, hash, index), HttpMethod.GET).getBody());
    }

    @Override
    public List<String> getBlockTransactionIds(String hash) throws IOException {
        return mapper.readValue(execute(getFullUrl(BLOCK_TRANSACTION_IDS, hash), HttpMethod.GET).getBody(),
                new TypeReference<List<String>>() {
                });
    }

    @Override
    public List<Transaction> getBlockTransactions(String hash, Optional<Integer> startIndex) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(BLOCK_TRANSACTIONS, hash, startIndex.map(Object::toString).orElse("")), HttpMethod.GET).getBody(),
                new TypeReference<List<Transaction>>() {
                });
    }

//    @Override
//    public List<Transaction> getAllBlockTransactions(String hash) throws IOException {
//        int txCount = getBlock(hash).getTxCount();
//        return IntStream.rangeClosed(0, (txCount % 25 == 0 ? txCount / 25 - 1 : txCount / 25))
//                .map(index -> index * 25)
//                .parallel()
//                .mapToObj(index -> {
//                    try {
//                        return getBlockTransactions(hash, Optional.of(index));
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//    }

    @Override
    public List<Block> getBlocks(Optional<Integer> startHeight) throws IOException {
        return mapper.readValue(execute(getFullUrl(BLOCKS, startHeight.map(Object::toString).orElse("")), HttpMethod.GET).getBody(),
                new TypeReference<List<Block>>() {
                });
    }

    @Override
    public List<Block> getBlocksBulk(int minHeight, Optional<Integer> maxHeight) throws IOException {
        return mapper.readValue(execute(getFullUrl(BLOCKS_BULK, minHeight, maxHeight.map(Object::toString).orElse("")),
                        HttpMethod.GET).getBody(),
                new TypeReference<List<Block>>() {
                });
    }

    @Override
    public MiningPools getMiningPools(TimePeriod period) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(MINING_POOLS, period.getPeriod()), HttpMethod.GET).getBody(),
                MiningPools.class);
    }

    @Override
    public MiningPoolDetails getMiningPool(String slug) throws IOException {
        return mapper.readValue(execute(getFullUrl(MINING_POOL, slug), HttpMethod.GET).getBody(), MiningPoolDetails.class);
    }

    @Override
    public HashrateDetails getMiningPoolHashrates(Optional<TimePeriod> period) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(MINING_POOL_HASHRATES, period.map(TimePeriod::getPeriod).orElse("")), HttpMethod.GET).getBody(),
                HashrateDetails.class);
    }

    @Override
    public List<MiningPoolHashrate> getMiningPoolHashrate(String slug) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(MINING_POOL_HASHRATE, slug), HttpMethod.GET).getBody(),
                new TypeReference<List<MiningPoolHashrate>>() {
                });
    }

    @Override
    public List<Block> getMiningPoolBlocks(String slug, Optional<Integer> blockHeight) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(MINING_POOL_BLOCKS, slug, blockHeight.map(Object::toString).orElse("")),
                        HttpMethod.GET).getBody(),
                new TypeReference<List<Block>>() {
                });
    }

    @Override
    public HashrateDetails getHashrate(TimePeriod period) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(HASHRATE, period.getPeriod()), HttpMethod.GET).getBody(),
                HashrateDetails.class);
    }

    @Override
    public RewardStats getRewardStats(int blockCount) throws IOException {
        return mapper.readValue(execute(getFullUrl(REWARD_STATS, blockCount), HttpMethod.GET).getBody(), RewardStats.class);
    }

    @Override
    public List<BlockFee> getBlockFees(TimePeriod period) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(BLOCK_FEES, period.getPeriod()),
                        HttpMethod.GET).getBody(),
                new TypeReference<List<BlockFee>>() {
                });
    }

    @Override
    public List<BlockReward> getBlockRewards(TimePeriod period) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(BLOCK_REWARDS, period.getPeriod()),
                        HttpMethod.GET).getBody(),
                new TypeReference<List<BlockReward>>() {
                });
    }

    @Override
    public List<BlockFeeRate> getBlockFeeRates(TimePeriod period) throws IOException {
        return mapper.readValue(
                execute(getFullUrl(BLOCK_FEE_RATES, period.getPeriod()),
                        HttpMethod.GET).getBody(),
                new TypeReference<List<BlockFeeRate>>() {
                });
    }

    @Override
    public BlockSizesAndWeights getBlockSizesAndWeights(TimePeriod period) throws IOException {
        return mapper.readValue(execute(getFullUrl(BLOCK_SIZES_AND_WEIGHTS, period.getPeriod()), HttpMethod.GET).getBody(),
                BlockSizesAndWeights.class);
    }

    @Override
    public List<MempoolBlocksFees> getMempoolBlockFees() throws IOException {
        return mapper.readValue(
                execute(getFullUrl(MEMPOOL_BLOCK_FEES),
                        HttpMethod.GET).getBody(),
                new TypeReference<List<MempoolBlocksFees>>() {
                });
    }

    @Override
    public RecommendedFees getRecommendedFees() throws IOException {
        return mapper.readValue(execute(getFullUrl(RECOMMENDED_FEES), HttpMethod.GET).getBody(), RecommendedFees.class);
    }

    @Override
    public Mempool getMempool() throws IOException {
        return mapper.readValue(execute(getFullUrl(MEMPOOL), HttpMethod.GET).getBody(), Mempool.class);
    }

    @Override
    public List<String> getMempoolTransactionIds() throws IOException {
        return mapper.readValue(
                execute(getFullUrl(MEMPOOL_TXIDS), HttpMethod.GET).getBody(),
                new TypeReference<List<String>>() {
                });
    }

    @Override
    public List<MempoolRecent> getMempoolRecent() throws IOException {
        return mapper.readValue(execute(getFullUrl(MEMPOOL_RECENT), HttpMethod.GET).getBody(),
                new TypeReference<List<MempoolRecent>>() {
                });
    }

    @Override
    public ChildrenPayForParent getChildrenPayForParent(String transactionId) throws IOException {
        return mapper.readValue(execute(getFullUrl(CHILDREN_PAY_FOR_PARENT, transactionId), HttpMethod.GET).getBody(),
                ChildrenPayForParent.class);
    }

    @Override
    public Transaction getTransaction(String transactionId) throws IOException {
        return mapper.readValue(execute(getFullUrl(TRANSACTION, transactionId), HttpMethod.GET).getBody(),
                Transaction.class);
    }

    @Override
    public String getTransactionHex(String transactionId) throws IOException {
        return new String(execute(getFullUrl(TRANSACTION_HEX, transactionId), HttpMethod.GET).getBody());
    }

    @Override
    public String getTransactionMerkleblockProof(String transactionId) throws IOException {
        return new String(execute(getFullUrl(TRANSACTION_MERKLEBLOCK_PROOF, transactionId), HttpMethod.GET).getBody());
    }

    @Override
    public TransactionMerkleProof getTransactionMerkleProof(String transactionId) throws IOException {
        return mapper.readValue(execute(getFullUrl(TRANSACTION_MERKLE_PROOF, transactionId), HttpMethod.GET).getBody(),
                TransactionMerkleProof.class);
    }

    @Override
    public TransactionOutspend getTransactionOutspend(String transactionId, int vout) throws IOException {
        return mapper.readValue(execute(getFullUrl(TRANSACTION_OUTSPEND, transactionId, vout), HttpMethod.GET).getBody(),
                TransactionOutspend.class);
    }

    @Override
    public List<TransactionOutspend> getTransactionOutspends(String transactionId) throws IOException {
        return mapper.readValue(execute(getFullUrl(TRANSACTION_OUTSPENDS, transactionId), HttpMethod.GET).getBody(),
                new TypeReference<List<TransactionOutspend>>() {
                });
    }

    @Override
    public byte[] getTransactionRaw(String transactionId) throws IOException {
        return execute(getFullUrl(TRANSACTION_RAW, transactionId), HttpMethod.GET).getBody();
    }

    @Override
    public TransactionStatus getTransactionStatus(String transactionId) throws IOException {
        return mapper.readValue(execute(getFullUrl(TRANSACTION_STATUS, transactionId), HttpMethod.GET).getBody(), TransactionStatus.class);
    }

    @Override
    public NetworkStats getNetworkStats(TimePeriod interval) throws IOException {
        return mapper.readValue(execute(getFullUrl(NETWORK_STATS, interval.getPeriod()), HttpMethod.GET).getBody(), NetworkStats.class);
    }

    @Override
    public NodesChannelsSearchResult getNodesChannels(String query) throws IOException {
        return mapper.readValue(execute(getFullUrl(NODES_CHANNELS, query), HttpMethod.GET).getBody(), NodesChannelsSearchResult.class);
    }

    @Override
    public NodesInCountry getNodesInCountry(String country) throws IOException {
        return mapper.readValue(execute(getFullUrl(NODES_IN_COUNTRY, country), HttpMethod.GET).getBody(), NodesInCountry.class);
    }

    @Override
    public List<NodeStats> getNodeStatsPerCountry() throws IOException {
        return mapper.readValue(execute(getFullUrl(NODES_STATS_PER_COUNTRY), HttpMethod.GET).getBody(),
                new TypeReference<List<NodeStats>>() {
                });
    }

    @Override
    public ISPNodes getISPNodes(int isp) throws IOException {
        return mapper.readValue(execute(getFullUrl(ISP_NODES, isp), HttpMethod.GET).getBody(), ISPNodes.class);
    }

    @Override
    public NodeStatsPerISP getNodeStatsPerISP() throws IOException {
        return mapper.readValue(execute(getFullUrl(NODE_STATS_PER_ISP), HttpMethod.GET).getBody(), NodeStatsPerISP.class);
    }

    @Override
    public TopNodes getTop100Nodes() throws IOException {
        return mapper.readValue(execute(getFullUrl(TOP_100_NODES), HttpMethod.GET).getBody(), TopNodes.class);
    }

    @Override
    public List<LightningNode> getTop100_NodesByLiquidity() throws IOException {
        return mapper.readValue(execute(getFullUrl(TOP_100_NODES_LIQUIDITY), HttpMethod.GET).getBody(),
                new TypeReference<List<LightningNode>>() {
                });
    }

    @Override
    public List<LightningNode> getTop100_NodesByConnectivity() throws IOException {
        return mapper.readValue(execute(getFullUrl(TOP_100_NODES_CONNECTIVITY), HttpMethod.GET).getBody(),
                new TypeReference<List<LightningNode>>() {
                });
    }

    @Override
    public List<LightningNode> getTop100_OldestNodes() throws IOException {
        return mapper.readValue(execute(getFullUrl(TOP_100_NODES_AGE), HttpMethod.GET).getBody(),
                new TypeReference<List<LightningNode>>() {
                });
    }

    @Override
    public LightningNode getNodeStats(String pubKey) throws IOException {
        return mapper.readValue(execute(getFullUrl(NODE_STATS, pubKey), HttpMethod.GET).getBody(), LightningNode.class);
    }

    @Override
    public List<NodeHistoryStats> getHistoricalNodeStats(String pubKey) throws IOException {
        return mapper.readValue(execute(getFullUrl(HISTORICAL_NODE_STATS, pubKey), HttpMethod.GET).getBody(),
                new TypeReference<List<NodeHistoryStats>>() {
                });
    }

    @Override
    public LightningChannel getChannel(String channelId) throws IOException {
        return mapper.readValue(execute(getFullUrl(CHANNEL, channelId), HttpMethod.GET).getBody(), LightningChannel.class);
    }

    @Override
    public ChannelsFromTXID getChannelsFromTXID(List<String> txIds) throws IOException {
        //TODO: fix url params
        return mapper.readValue(execute(getFullUrl(CHANNEL, txIds), HttpMethod.GET).getBody(), ChannelsFromTXID.class);
    }

    @Override
    public List<LightningChannel> getChannelsFromNodePubKey(String pubKey, ChannelStatus status, Optional<Integer> index)
            throws IOException {
        //TODO: fix status and index url
        return mapper.readValue(execute(getFullUrl(CHANNELS_FROM_NODE_PUBKEY, pubKey, status, index), HttpMethod.GET).getBody(),
                new TypeReference<List<LightningChannel>>() {
                });
    }

    @Override
    public List<ChannelGeodata> getChannelGeodata() throws IOException {
        return mapper.readValue(execute(getFullUrl(CHANNEL_GEODATA), HttpMethod.GET).getBody(),
                new TypeReference<List<ChannelGeodata>>() {
                });
    }

    @Override
    public List<ChannelGeodata> getChannelGeodataForNode(String pubKey) throws IOException {
        return mapper.readValue(execute(getFullUrl(CHANNEL_GEODATA_FOR_NODE, pubKey), HttpMethod.GET).getBody(),
                new TypeReference<List<ChannelGeodata>>() {
                });
    }

    private String getFullUrl(String endpoint, Object... args) {
        return String.format("%s%s", mempoolUrl, String.format(endpoint, args));
    }

    private Response execute(String url, HttpMethod method) throws IOException {
        HttpURLConnection httpUrlConnection = null;

        try {
            httpUrlConnection = (HttpURLConnection) new URL(url).openConnection();
            httpUrlConnection.setUseCaches(false);
            httpUrlConnection.setRequestMethod(method.name());

            // Allow subclasses to customize the connection if they'd like to - set
            // their own headers, timeouts, etc.
            customizeConnection(httpUrlConnection);

            httpUrlConnection.connect();

            return fetchResponse(httpUrlConnection);
        } finally {
            if (httpUrlConnection != null) {
                httpUrlConnection.disconnect();
            }
        }
    }

    protected void customizeConnection(HttpURLConnection httpUrlConnection) {
    }

    private Response fetchResponse(HttpURLConnection httpUrlConnection) throws IOException {
        try (InputStream inputStream = httpUrlConnection.getResponseCode() != HttpURLConnection.HTTP_OK ? httpUrlConnection.getErrorStream()
                : httpUrlConnection.getInputStream()) {

            return new Response(httpUrlConnection.getResponseCode(), toByteArray(Objects.requireNonNull(inputStream)));
        }
    }

    private byte[] toByteArray(InputStream inputStream) throws IOException {
        try (ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
            int bytesRead;
            byte[] data = new byte[1024];

            while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, bytesRead);
            }

            buffer.flush();

            return buffer.toByteArray();
        }
    }
}
