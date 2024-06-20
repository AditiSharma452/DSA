package aditi.Trees;
import java.util.*;
public class BottomViewOfBinaryTree {

    // class to create a node
    public static class Node {
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    // class of binary tree
    public static class BinaryTree {
        Node root;

        public BinaryTree() { root = null; }

        // function should print the topView of
        // the binary tree
        void BottomView(Node root)
        {
            class QueueObj {
                Node node;
                int hd;//hd is horizontal distance, -1, 0, 1, 2 etc from the previous root

                QueueObj(Node node, int hd)
                {
                    this.node = node;
                    this.hd = hd;
                }
            }
            Queue<QueueObj> q = new LinkedList<QueueObj>();
            Map<Integer, Node> bottomViewMap
                    = new TreeMap<Integer, Node>();

            if (root == null) {
                return;
            }
            else {
                q.add(new QueueObj(root, 0));
            }
            System.out.println(
                    "The bottom view of the tree is : ");

            // count function returns 1 if the container
            // contains an element whose key is equivalent
            // to hd, or returns zero otherwise.
            while (!q.isEmpty()) {
                QueueObj tmpNode = q.poll();//dequeue that element from queue.

                bottomViewMap.put(tmpNode.hd, tmpNode.node);//add that dequeued element in Map.
                                                            //with horizontal distance and node itself.
                                                            //this doesn't check if the same hd is previously noted as in case of top view.
                                                            //it updates the new node with same hd. at last we get bottom view.
                if (tmpNode.node.left != null) {
                    q.add(new QueueObj(tmpNode.node.left,
                            tmpNode.hd - 1));
                }
                if (tmpNode.node.right != null) {
                    q.add(new QueueObj(tmpNode.node.right,
                            tmpNode.hd + 1));
                }
            }
            for (Map.Entry<Integer, Node> entry :
                    bottomViewMap.entrySet()) {
                System.out.print(entry.getValue().data + " ");
            }
        }
    }
}

