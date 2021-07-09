//Write a program to rotate (circular shift) a given list by entered number of rotation and display values after rotation. The output values should be space separated values like n1 n2 n3.....
//
//List=10,20,30,40,50,60
//
//For example, if rotation is 1 for given list, the output would be 20 30 40 50 60 10
//
//Note: The rotation should be counter clockwise like <-10<-20<-30<-40<-50<-60
//
//User Input Description:
//An integer value as a number of rotation

//4
//50 60 10 20 30 40

//3
//40 50 60 10 20 30

//5
//60 10 20 30 40 50

//1
//20 30 40 50 60 10

package myPerfectice;

import java.util.Scanner;

public class Q34 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void rotate(int k) {
        if (k == 0) return;
        Node current = head;
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        if (current == null)
            return;
        Node kthNode = current;
        while (current.next != null)
            current = current.next;
        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Q34 llist = new Q34();
        Scanner input = new Scanner(System.in);
        int rot = input.nextInt();
        for (int i = 60; i >= 10; i -= 10)
            llist.push(i);
        llist.rotate(rot);
        llist.printList();
    }

}
