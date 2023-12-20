package com.sai.datastructures;

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        // Constructor to create a new node with given data
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class Tree {
        private TreeNode root;

        // Constructor to initialize an empty tree
        public Tree() {
            this.root = null;
        }

        // Method to insert a new node into the tree
        public void insert(int data) {
            root = insertRec(root, data);
        }

        // Recursive method to insert a new node
        private TreeNode insertRec(TreeNode root, int data) {
            // If the tree is empty, create a new node
            if (root == null) {
                root = new TreeNode(data);
                return root;
            }

            // Otherwise, recursively insert into the left or right subtree
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            // Return the modified root
            return root;
        }

        // Method to perform an in-order traversal of the tree
        public void inOrderTraversal() {
            inOrderTraversalRec(root);
        }
       // The inorder traversal of the tree uses the left root right policy. It first traverses
        // the left subtree, then moves to the root, and finally to the right subtree.
        // The inorder traversal of a binary search tree gives a sorted and non-decreasing
        // ordered sequence of the key values.


        // Recursive method for in-order traversal
        private void inOrderTraversalRec(TreeNode root) {
            if (root != null) {
                inOrderTraversalRec(root.left);
                System.out.print(root.data + " ");
                inOrderTraversalRec(root.right);
            }
        }

        public static void main(String[] args) {
            // Creating a binary tree
            Tree binaryTree = new Tree();

            // Inserting elements into the tree
            binaryTree.insert(50);
            binaryTree.insert(30);
            binaryTree.insert(70);
            binaryTree.insert(20);
            binaryTree.insert(40);
            binaryTree.insert(60);
            binaryTree.insert(80);

            // Performing an in-order traversal
            System.out.println("In-order traversal:");
            binaryTree.inOrderTraversal();
        }
    }


