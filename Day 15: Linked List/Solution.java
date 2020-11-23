
import java.io.*;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    // 4 2 3 4 1
    public static Node insert(Node head, int data) {
        // Create a new Node
        Node node = new Node(data);

        // If head is null, then the initial list is empty.
        if (head == null) {
            return node;
        } else { // If the list is not empty
            // Create a throwaway Node to iterate through the list
            Node tempNode = head;
            
            // When a Node with next data field that is null is found, set next 
            // to node
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
            
            // Return head
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
