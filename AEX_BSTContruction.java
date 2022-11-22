public class AEX_BSTContruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            insertHelper(this, value);
            return this;

        }

        public BST insertHelper(BST node, int value) {


            if (node == null) return new BST(value);
            if (node.value > value) node.left = insertHelper(node.left, value);
            else node.right = insertHelper(node.right, value);
            return node;
        }

        public boolean contains(int value) {
            return containHelper(this, value);
        }

        public boolean containHelper(BST node, int value) {

            if (node == null) return false;
            if (node.value == value) return true;
            else if (node.value > value) return containHelper(node.left, value);
            else return containHelper(node.right, value);
        }

        public BST remove(int value) {
            removeHelper(this, value);
            return this;
        }


        public BST removeHelper(BST binaryTree, int value) {
            if (binaryTree == null) {
                return binaryTree;
            }


            if (value < binaryTree.value) {
                binaryTree.left = removeHelper(binaryTree.left, value);
            } else if (value > binaryTree.value) {
                binaryTree.right = removeHelper(binaryTree.right, value);
            } else {
//if it has no children => delete
                if (binaryTree.left == null && binaryTree.right == null) {
                    return null;
                }
//if it has only one child =>replace it with the child
                if (binaryTree.left != null && binaryTree.right == null) {
                    binaryTree.value = binaryTree.left.value;
                    binaryTree.right = binaryTree.left.right;
                    binaryTree.left = binaryTree.left.left;
                    return binaryTree;
                }
                if (binaryTree.left == null && binaryTree.right != null) {
                    binaryTree.value = binaryTree.right.value;
                    binaryTree.left = binaryTree.right.left;
                    binaryTree.right = binaryTree.right.right;
                    return binaryTree;
                }


//if it has two children => replace with the smallest value in the right side of the tree
                if (binaryTree.left != null && binaryTree.right != null) {
                    int smallest = smallestValue(binaryTree.right);
                    binaryTree.value = smallest;
                    binaryTree.right = removeHelper(binaryTree.right, smallest);
                    return binaryTree;
                }
            }
            return binaryTree;
        }

        public int smallestValue(BST binaryTree) {
            return binaryTree.left == null ? binaryTree.value : smallestValue(binaryTree.left);
        }
    }


}
