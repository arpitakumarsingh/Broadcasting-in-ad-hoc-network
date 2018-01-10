# Broadcasting-in-ad-hoc-network
Reliable broadcasting in mobile ad-hoc networks

A reliable broadcasting algorithm for mobile ad-hoc networks will guarantee to deliver messages from different sources to all the nodes of the network.

The nodes are mobile and can move from one place to another. The solution does not require the nodes to know the network size, its diameter and number of nodes in the network. The only information a node has is its identity(IP Address) and its position.

On average, only a subset of nodes transmit and they transmit only once to achieve reliable broadcasting. The algorithm will calculate the relative position of the nodes with respect to the broadcasting source node.

The nodes that are farthest from the source node will rebroadcast and this will minimize the number of rebroadcasts made by the intermediate nodes and will reduce the delay latency.

The proposed algorithm will adapt itself dynamically to the number of concurrent broadcasts and will give the least finish time for any particular broadcast. It will be contention free, energy efficient and collision free.
