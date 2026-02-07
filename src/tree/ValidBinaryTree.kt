/*
package tree

class ValidBinaryTree {

    fun isValidBST(root: TreeNode?): Boolean {
        if(root == null) return true
        return isValidBFS(root , Int.MIN_VALUE , Int.MAX_VALUE)
    }

*/
/*    private fun dfs(root:TreeNode?) : Boolean {
        if(root == null) return false

        if(isLeftRightSubTreeBalaced(root)) {
            dfs(root.left)
            dfs(root.right)
        }else return false

        return true


    }*//*


    fun isValidBFS(root: TreeNode , left : Int , right : Int) : Boolean {
        if(root == null) return true

        if(root.`val` < right && root.`val` > left)
            return false

        return isValidBFS(root.left!! , left , root.`val`) && isValidBFS(root.right!! , root.`val` , right)
    }

 */
/*   private fun isLeftRightSubTreeBalaced(root : TreeNode) : Boolean {
        if(root.left == null && root.right == null) return true

        if(root.left == null){
            if(root.right!!.`val` > root.`val` && root.right!!.`val` > rootMax ){
                return true
            }else return false
        }else if(root.right == null) {
            if(root.left!!.`val` < root.`val` && root.left!!.`val` < rootMax){
                return true
            }else return false
        }else if (root.left!!.`val` < root.`val` && root.right!!.`val` > root.`val` && root.right!!.`val` > rootMax &&root.left!!.`val` < rootMax) {
            return true
        }else  return false
        *//*
*/
/* if(root.left!!.`val` < root.`val` && root.right!!.`val` > root.`val`)
             return true
         else return false*//*
*/
/*


    }*//*


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
    val d = ValidBinaryTree()
    val root = d.buildTree(arrayOf(5,4,6,null,null,3,7))
    val ans = d.isValidBST(root)
    print(ans)
}*/
