package com.company;

public class Main {

    public static void main(String[] args) {
	    Node n1 = new Node(5);
        Node n2 = new Node(100);
        Node n3 = new Node(500);
        Node n4 = new Node(250);
        Node n5 = new Node(215);
        Node n6 = new Node(350);
        Node n7 = new Node(400);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        n5.left = n6;
        n5.right = n7;
    }

    public static int max(Node node){
        int max = node.value;
        if(node.left != null){
            int maxLeft = max(node.left);
            if(maxLeft > max)
                max = maxLeft;
        }
        if(node.right != null){
            int maxRight = max(node.right);
            if(maxRight > max)
                max = maxRight;
        }
        return max;
    }

    public static int sum(Node node){
        int sum = node.value;
            if (node.left != null) {
                sum += sum(node.left);
            }
            if (node.right != null) {
                sum += sum(node.right);
            }
        return sum;
    }

    public static boolean compare(Node node1, Node node2){
        if(node1.right == node2.right && node1.left == node2.left){
            return true;
        }else{
            return false;
        }

    }
}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public int max(){
        int max = value;
        if(left != null){
            int maxLeft = left.max();
            if(maxLeft > max)
                max = maxLeft;
        }
        if(right != null){
            int maxRight = right.max();
            if(maxRight > max)
                max = maxRight;
        }
        return max;
    }

    public int sum(){
        int sum = value;
        if(left != null)
            sum += left.sum();
        if(right != null)
            sum += right.sum();
        return sum;
    }


}
