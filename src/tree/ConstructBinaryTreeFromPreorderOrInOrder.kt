package tree

class ConstructBinaryTreeFromPreorderOrInOrder {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val hashMap = hashMapOf<Int,Int>()
        for(i in inorder.indices) {
            hashMap.put(inorder[i] , i)
        }

        return buildTree1(preorder , 0 , preorder.size, inorder , 0 ,inorder.size ,hashMap)
    }

    fun buildTree1(preorder: IntArray , preStart : Int , preEnd : Int , inorder: IntArray , inStart : Int , inEnd : Int , inMap : HashMap<Int,Int>) : TreeNode? {
        if(preStart > preEnd || inStart > inEnd) return null

         val root = TreeNode(preorder[preStart])

        val inRoot = inMap[root.`val`]!!
        val numleft = inRoot - inStart

        root.left = buildTree1(preorder , preStart+1,preStart + numleft , inorder , inStart , inRoot-1,inMap )
        root.right = buildTree1(preorder , preStart+1+numleft , preEnd , inorder ,inRoot+1 , inEnd ,inMap )

        return root
    }

    class TreeNode(val `val` : Int) {
        var left : TreeNode ?= null
        var right : TreeNode ?= null
    }
}


fun main() {
    val obj = ConstructBinaryTreeFromPreorderOrInOrder()
    val root = obj.buildTree(intArrayOf(3,9,20,15,7), intArrayOf(9,3,15,20,7))
    print(root)


}