package aditi.Trees;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Top_View_of_Binary_Tree.BinaryTree tree = new Top_View_of_Binary_Tree.BinaryTree();
        tree.root = new Top_View_of_Binary_Tree.Node(1);
        tree.root.left = new Top_View_of_Binary_Tree.Node(2);
        tree.root.right = new Top_View_of_Binary_Tree.Node(3);
        tree.root.left.right = new Top_View_of_Binary_Tree.Node(4);
        tree.root.left.right.right = new Top_View_of_Binary_Tree.Node(5);
        tree.root.left.right.right.right = new Top_View_of_Binary_Tree.Node(6);
        tree.TopView(tree.root);
//        BottomViewOfBinaryTree.BinaryTree tree = new BottomViewOfBinaryTree.BinaryTree();
//        tree.root = new BottomViewOfBinaryTree.Node(1);
//        tree.root.left = new BottomViewOfBinaryTree.Node(2);
//        tree.root.right = new BottomViewOfBinaryTree.Node(3);
//        tree.root.left.right = new BottomViewOfBinaryTree.Node(4);
//        tree.root.left.right.right = new BottomViewOfBinaryTree.Node(5);
//        tree.root.left.right.right.right = new BottomViewOfBinaryTree.Node(6);
//        tree.BottomView(tree.root);
        }
    }
