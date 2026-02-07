package tree

class FindKthSmallestElement {



    var result = mutableListOf<Int>()
    fun kthSmallest(root: TreeNode?, k: Int): Int {

        dfs(root)
        return if(result.isNotEmpty()) result[k-1] else 0
    }

    fun dfs(root : TreeNode?)  {
        if(root == null) return
        dfs(root.left)
        print(root.`val`)
        result.add(root.`val`)
        dfs(root.right)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun buildTree(arr: Array<Int?>): TreeNode? {
        if (arr.isEmpty() || arr[0] == null) return null

        val root = TreeNode(arr[0]!!)
        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.add(root)
        var i = 1

        while (i < arr.size) {
            val node = queue.removeFirst()

            if (i < arr.size && arr[i] != null) {
                node.left = TreeNode(arr[i]!!)
                queue.add(node.left!!)
            }
            i++

            if (i < arr.size && arr[i] != null) {
                node.right = TreeNode(arr[i]!!)
                queue.add(node.right!!)
            }
            i++
        }

        return root
    }

}




fun main() {
    val obj = FindKthSmallestElement()
    val tree = obj.buildTree(arrayOf(3,1,4,null,2))
    val result = obj.kthSmallest(tree , 1)
    print(result)


}