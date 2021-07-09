//Write a program to reverse the entered linked list of 4 nodes and display reversed list. The output values should be space separated values like n1 n2 n3...
//
//For example, input list = 1,2,3,4, output would be 4 3 2 1
//
//User Input Description:
//Space-separated 4 node values

//1 2 3 4
//4 3 2 1

//1 3 3 4
//4 3 3 1

//1 2 2 4
//4 2 2 1

package myPerfectice.Level2;

import java.util.Scanner;

public class Q35 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
        //write your code here
        Node p = null;
        Node c = node;
        Node n = null;
        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        node = p;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q35 list = new Q35();
        Scanner sc = new Scanner(System.in);
        list.head = new Node(sc.nextInt());
        list.head.next = new Node(sc.nextInt());
        list.head.next.next = new Node(sc.nextInt());
        list.head.next.next.next = new Node(sc.nextInt());
        head = list.reverse(head);
        list.printList(head);
    }
}
