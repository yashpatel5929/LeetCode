package tree

import kotlin.math.max

class RightSideOfTree {

    val result  = mutableListOf<Int>()
    fun rightSideView(root: TreeNode?): List<Int> {

        if(root == null) return result

        val dequeue = ArrayDeque<TreeNode>()

        dequeue.add(root)


        while (dequeue.isNotEmpty()) {
            val size  = dequeue.size
            var rightSide : TreeNode? = null
            repeat(size) {
                val node = dequeue.removeFirst()
                if(node != null) {
                    rightSide = node
                    node.left?.let { dequeue.add(it) }
                    node.right?.let { dequeue.add(it) }
                }


            }
            rightSide?.`val`?.let { result.add(it) }

        }
        print(result)

        return result

    }



    fun goodNodes(root: TreeNode?): Int {
       /* val goodNode = mutableListOf<Int>()
        if(root == null) return 0

        val queue = ArrayDeque<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()

            if(goodNode.isEmpty()) goodNode.add(node.`val`)
            else if (node.`val` >= goodNode.) goodNode.add(node.`val`)
            node.left?.let { queue.add(it) }
            node.right?.let {queue.add(it)}

        }

        print(goodNode)*/

        return goodNodeRec(root,-1)
    }

    var res = -1
    fun goodNodeRec(root : TreeNode? , maxValue: Int) :Int{
        if(root == null) return 0
        res = if (root.`val` >= maxValue) 1 else   0
        val maxi = max(root.`val` , maxValue)
        res+=goodNodeRec(root.left , maxi)
        res +=goodNodeRec(root.right, maxValue)
return res
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
    val obj = RightSideOfTree()
    val root = obj.buildTree(arrayOf(2,null,4,10,8,null,null,4))
   print( obj.goodNodes(root))
}