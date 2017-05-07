/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    private static ArrayList<Integer> bstTreeDataStore = new ArrayList<>();
    private boolean isValid = true;

    public void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        if (bstTreeDataStore.size() != 0) {
            bstTreeDataStore.add(node.data);
            int i = bstTreeDataStore.size() - 1;
            if (bstTreeDataStore.get(i - 1) >= bstTreeDataStore.get(i)) { isValid = false; }
        } else { bstTreeDataStore.add(node.data); }
        inOrderTraversal(node.right);
    }

    public boolean checkBST(Node root) {
        inOrderTraversal(root);
        return isValid;
    }
