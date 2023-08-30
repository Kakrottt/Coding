package Striver.LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Node{
    int val;
    Node next;
    Node prev;

    public Node(int n){
        this.val = n;
        this.next = null;
        this.prev = null;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in = br.readLine().trim().split(" ");
        int n = in.length;
        ArrayList<Integer> arrl = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arrl.add(Integer.parseInt(in[i]));
        }

        //Object Single Linked List
        SingleLinkedList sll = new SingleLinkedList();
        Node root = sll.genLinkedList(arrl, n);
        sll.printList(root);

        System.out.println(arrl);

        br.close();

    }
}
