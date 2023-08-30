package Striver.LinkedList;

import java.util.ArrayList;

public class SingleLinkedList {
    
    Node genLinkedList(ArrayList<Integer> arr, int n){
        Node root = n == 0 ? null : new Node(arr.get(0));
        Node curr = root;

        for(int i = 1; i < n; i++){
            Node temp = new Node(arr.get(i));
            curr.next = temp;
            curr = curr.next;
        }
        return root;
    }

    void printList(Node root){
        Node curr = root;
        while(curr.next != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println(curr.val);
        return;
    }

    Node insertPos(Node root, int val, int pos){
        Node temp = new Node(val);
        if(pos == 1){
            temp.next = root;
            return temp;
        }

        Node curr = root;
        for(int i = 1; i < pos-2 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null)
            return root;

        temp.next = curr.next;
        curr.next = temp;
        return root;
    }
}
