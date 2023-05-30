package com.jtechx.mempool4j.client;

public class Endpoints {

    /**
     * General
     * */
    public static final String DIFFICULTY_ADJUSTMENT = "/api/v1/difficulty-adjustment";

    /**
     * Addresses
     * */
    public static final String ADDRESS = "/api/address/%s";
    public static final String ADDRESS_TXS = "/api/address/%s/txs";
    public static final String ADDRESS_TXS_CHAIN = "/api/address/%s/txs/chain";
    public static final String ADDRESS_TXS_MEMPOOL = "/api/address/%s/txs/mempool";
    public static final String ADDRESS_UTXO = "/api/address/%s/utxo";

    /**
     * Blocks
     * */
    public static final String BLOCK = "/api/block/%s";
    public static final String BLOCK_HEADER = "/api/block/%s/header";
    public static final String BLOCK_HEIGHT = "/api/block-height/%s";
    public static final String BLOCK_RAW = "/api/block/%s/raw";
    public static final String BLOCK_STATUS = "/api/block/%s/status";
    public static final String BLOCK_TIP_HEIGHT = "/api/blocks/tip/height";
    public static final String BLOCK_TIP_HASH = "/api/blocks/tip/hash";
    public static final String BLOCK_TRANSACTION_ID = "/api/block/%s/txid/%s";
    public static final String BLOCK_TRANSACTION_IDS = "/api/block/%s/txids";
    public static final String BLOCK_TRANSACTIONS = "/api/block/%s/txs/%s";
    public static final String BLOCKS = "/api/v1/blocks/%s";
    public static final String BLOCKS_BULK = "/api/v1/blocks-bulk/%s/%s";

    /**
     * Mining
     * */
    public static final String MINING_POOLS = "/api/v1/mining/pools/%s";
    public static final String MINING_POOL = "/api/v1/mining/pool/%s";
    public static final String MINING_POOL_HASHRATES = "/api/v1/mining/hashrate/pools/%s";
    public static final String MINING_POOL_HASHRATE = "/api/v1/mining/pool/%s/hashrate";
    public static final String MINING_POOL_BLOCKS = "/api/v1/mining/pool/%s/blocks/%s";
    public static final String HASHRATE = "/api/v1/mining/hashrate/%s";
    public static final String REWARD_STATS = "/api/v1/mining/reward-stats/%s";
    public static final String BLOCK_FEES = "/api/v1/mining/blocks/fees/%s";
    public static final String BLOCK_REWARDS = "/api/v1/mining/blocks/rewards/%s";
    public static final String BLOCK_FEE_RATES = "/api/v1/mining/blocks/fee-rates/%s";
    public static final String BLOCK_SIZES_AND_WEIGHTS = "/api/v1/mining/blocks/sizes-weights/%s";

    /**
     * Fees
     * */
    public static final String MEMPOOL_BLOCK_FEES = "/api/v1/fees/mempool-blocks";
    public static final String RECOMMENDED_FEES = "/api/v1/fees/recommended";

    /**
     * Mempool
     * */
    public static final String MEMPOOL = "/api/mempool";
    public static final String MEMPOOL_TXIDS = "/api/mempool/txids";
    public static final String MEMPOOL_RECENT = "/api/mempool/recent";

    /**
     * Transactions
     * */
    public static final String CHILDREN_PAY_FOR_PARENT = "/api/v1/cpfp/%s";
    public static final String TRANSACTION = "/api/tx/%s";
    public static final String TRANSACTION_HEX = "/api/tx/%s/hex";
    public static final String TRANSACTION_MERKLEBLOCK_PROOF = "/api/tx/%s/merkleblock-proof";
    public static final String TRANSACTION_MERKLE_PROOF = "/api/tx/%s/merkle-proof";
    public static final String TRANSACTION_OUTSPEND = "/api/tx/%s/outspend/%s";
    public static final String TRANSACTION_OUTSPENDS = "/api/tx/%s/outspends";
    public static final String TRANSACTION_RAW = "/api/tx/%s/raw";
    public static final String TRANSACTION_STATUS = "/api/tx/%s/status";

    /**
     * Lightning
     * */
    public static final String NETWORK_STATS = "/api/v1/lightning/statistics/%s";
    public static final String NODES_CHANNELS = "/api/v1/lightning/search";
    public static final String NODES_IN_COUNTRY = "/api/v1/lightning/nodes/country/%s";
    public static final String NODES_STATS_PER_COUNTRY = "/api/v1/lightning/nodes/countries";
    public static final String ISP_NODES = "/api/v1/lightning/nodes/isp/%s";
    public static final String NODE_STATS_PER_ISP = "/api/v1/lightning/nodes/isp-ranking";
    public static final String TOP_100_NODES = "/api/v1/lightning/nodes/rankings";
    public static final String TOP_100_NODES_LIQUIDITY = "/api/v1/lightning/nodes/rankings/liquidity";
    public static final String TOP_100_NODES_CONNECTIVITY = "/api/v1/lightning/nodes/rankings/connectivity";
    public static final String TOP_100_NODES_AGE = "/api/v1/lightning/nodes/rankings/age";
    public static final String NODE_STATS = "/api/v1/lightning/nodes/%s";
    public static final String HISTORICAL_NODE_STATS = "/api/v1/lightning/nodes/%s/statistics";
    public static final String CHANNEL = "/api/v1/lightning/channels/%s";
    public static final String CHANNELS_FROM_TXID = "/api/v1/lightning/channels/txids";
    public static final String CHANNELS_FROM_NODE_PUBKEY = "/api/v1/lightning/channels";
    public static final String CHANNEL_GEODATA = "/api/v1/lightning/channels-geo";
    public static final String CHANNEL_GEODATA_FOR_NODE = "/api/v1/lightning/channels-geo/%s";
}

