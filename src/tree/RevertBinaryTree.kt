/*


import kotlin.math.abs
import kotlin.math.max

class RevertBinaryTree {
    fun invertTree(root: TreeNode1?): Int {

        if (root == null) return 0;

        val queue = ArrayDeque<TreeNode1>()
        queue.add(root)
        var count = 1

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()

            node.left?.let { queue.add(it) }
            node.right?.let { queue.add(it) }
        }
        print("fdsjfh" + queue.toList())

        return count

    }

    fun isSubtree(root: TreeNode1?, subRoot: TreeNode1?): Boolean {
        if (root == null) return false
        if (root.`val` == subRoot?.`val`)
            return isSameTree(root, subRoot)
        else
            return isSubtree(root.left, subRoot)

    }

    fun isSameTree(p: TreeNode1?, q: TreeNode1?): Boolean {
        val queue = ArrayDeque<TreeNode1>()
        val treeRight = ArrayDeque<TreeNode1>()
        if (p == null && q == null) {
            return false
        } else if (p?.`val` == q?.`val`) {
            if (p != null) {
                queue.add(p)
            }
            if (q != null) {
                treeRight.add(q)
            }
        } else return false

        while (queue.isNotEmpty() && treeRight.isNotEmpty()) {
            val node1 = queue.removeFirst()
            val node2 = treeRight.removeFirst()

            if (node1.`val` != node2.`val` || node1.left?.`val` != node2.left?.`val` || node1.right?.`val` != node2.right?.`val`) {
                return false
            }
            node1.left?.let { (queue.add(it)) }
            node1.right?.let { queue.add(it) }
            node2.left?.let { treeRight.add(it) }
            node2.right?.let { (treeRight.add(it)) }
        }

        return true

    }

    fun lowestCommonAncestor(root: TreeNode1?, p: TreeNode1?, q: TreeNode1?): TreeNode1? {
        var current = root
        while (current != null)
            if (p?.`val`!! > current.`val` && q?.`val`!! > current.`val`) {
                current = current.right
            } else if (p?.`val`!! < current.`val` && q?.`val`!! < current.`val`) {
                current = current.left
            } else {
                return current
            }

        return current
    }

    fun isBalanced(root: TreeNode1?): Boolean {
        val leftCount = maxDepth(root?.left)
        val rightCount = maxDepth(root?.right)

        print(leftCount)
        print(rightCount)
        return leftCount == rightCount || abs(leftCount - rightCount) <= 1


    }

    var res = 0
    fun diameterOfBinaryTree(root: TreeNode1?): Int {
        if(root == null) return 0
        val leftNode = longestDiameter(root.left)
        val rightNode = longestDiameter(root.right)



        return res
    }

    fun longestDiameter(root: TreeNode1?): Int {
        if (root == null) return 0

        var left = longestDiameter(root.left)
        var right = longestDiameter(root.right)
        res = max(res , left+right)
        return 1 + max(left, right)

    }

    fun dfs(root: TreeNode1?): Pair<Boolean, Int> {
        if (root == null)
            return Pair(true, 0)

        val left = dfs(root.left)
        val right = dfs(root.right)

        val balance = left.first && right.first && abs(left.second - right.second) <= 1

        return Pair(balance, 1 + max(left.second, right.second))
    }

    fun maxDepth(root: TreeNode1?): Int {
        if (root == null) return 0;

        val queue = ArrayDeque<TreeNode1>()
        queue.add(root)
        var count = 0

        while (queue.isNotEmpty()) {
            val size = queue.size  // number of nodes at this level

            // Process all nodes of this level
            repeat(size) {
                val node = queue.removeFirst()

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            count++
        }

        return count
    }

    class TreeNode1(var `val`: Int) {
        var left: TreeNode1? = null
        var right: TreeNode1? = null
    }

    fun buildTree(arr: Array<Int?>): TreeNode1? {
        if (arr.isEmpty() || arr[0] == null) return null

        val root = TreeNode1(arr[0]!!)
        val queue: ArrayDeque<TreeNode1> = ArrayDeque()
        queue.add(root)
        var i = 1

        while (i < arr.size) {
            val node = queue.removeFirst()

            if (i < arr.size && arr[i] != null) {
                node.left = TreeNode1(arr[i]!!)
                queue.add(node.left!!)
            }
            i++

            if (i < arr.size && arr[i] != null) {
                node.right = TreeNode1(arr[i]!!)
                queue.add(node.right!!)
            }
            i++
        }

        return root
    }
}

fun main() {
    val d = RevertBinaryTree()
    val root = d.buildTree(arrayOf(4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2))
    val root2 = d.buildTree(arrayOf(1))
    val ans = d.diameterOfBinaryTree(root)
    print(ans)
}*/
