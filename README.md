## Simple java client for a [mempool](https://github.com/mempool/mempool) instance  

# Example usage (default mempool instance)

```
MempoolClient client = DefaultMempoolClient.create(); 
Block block = client.getBlock("000000000000000015dc777b3ff2611091336355d3f0ee9766a2cf3be8e4b1ce");
```

# Example usage (your mempool instance)

```
MempoolClient client = DefaultMempoolClient.create("http://your-mempool-instance.com"); 
Block block = client.getBlock("000000000000000015dc777b3ff2611091336355d3f0ee9766a2cf3be8e4b1ce");
```
