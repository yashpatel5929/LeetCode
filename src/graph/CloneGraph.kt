package graph

class CloneGraph {

    fun cloneGraph(node: Node?): Node? {
        if(node == null) return null

        val hashMap = HashMap<Node , Node>()
        fun dfs(node:Node) : Node {
            if(node in hashMap) return hashMap[node]!!

            val copy = Node(node.`val`)
            hashMap[node] = copy
            for (nei in node.neighbors){
                nei?.let { copy.neighbors.add(dfs(it)) }
            }
            return copy

        }

        return dfs(node)
    }

    class Node(var `val`: Int) {
           var neighbors: ArrayList<Node?> = ArrayList<Node?>()
    }

}


