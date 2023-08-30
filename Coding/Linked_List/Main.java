package Linked_List;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Node{
    int val;
    Node next;
    Node prev;
    
    public Node(){

    }
    public Node(int n){
        this.val = n;
        this.next = null;
        this.prev = null;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in = br.readLine().trim().split(" ");
        int n = in.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        // int x = Integer.parseInt(br.readLine().trim());
        singleLinkedList ll = new singleLinkedList();
        Node root = null;
        root = ll.createLList(arr, n);
        // ll.printList(root);
        // root = ll.deleteLast(root);
        // root = ll.insertPos(root, 1, 4);
        // ll.printList(root);
        // root = ll.reverseList(root);
        // ll.printList(root);

        // int res = ll.middle(root);
        // System.out.println(res);

        root = ll.reverseListK_rec(root, 3);
        ll.printList(root);
        root = ll.reverseListK(root, 3);
        ll.printList(root);

        // root = ll.removeDuplicate(root);
        // ll.printList(root);
        // System.out.println(ll.searchNode(root, 1));

        // doubleLinkedList dll = new doubleLinkedList();
        // root = dll.createDList(arr, n);
        // dll.printList(root);
        // root = dll.insertEnd(root, 5);
        // root = dll.insertEnd(root, 3);
        // root = dll.reverse(root);
        // dll.printList(root);

        // circularLinkedList cll = new circularLinkedList();
        // root = cll.createList(arr);
        // cll.printList(root);
        // root = cll.insertBegin(root, 4);
        // cll.printList(root);
        // root = cll.insertEnd(root, 10000);
        // cll.printList(root);
        // root = cll.deleteHead(root);
        // cll.printList(root);

        br.close();
    }
}
