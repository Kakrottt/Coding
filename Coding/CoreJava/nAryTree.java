package CoreJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class nAryTree {
    static class Node{
        int val;
        List<Node> children = new LinkedList<>();

        public Node() {}

        public Node(int val){
            this.val = val;
        }

        public Node(int val, List<Node> child){
            this.val = val;
            this.children = child;
        }


    }

    static void constructNAryTree(List<Integer> parent, List<Integer> child){
        for(int i = 1; i < parent.size(); i++){
            // List<Integer> ds = new ArrayList<>();

        }
    }

    static void nTree(int idx, List<Integer> parent, List<Integer> child, Node root){
        if(idx == parent.size())
            return;
        if(parent.get(idx) == parent.get(idx-1))
            root.children.add(new Node(child.get(idx)));
            
        
    }

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] inputLine = br.readLine().trim().split(" ");
        List<Integer> parent = new ArrayList<>();
        List<Integer> child = new ArrayList<>();
        for(int i = 0; i < inputLine.length; i++){
            parent.add(Integer.parseInt(inputLine[i]));
        }
        inputLine = br.readLine().trim().split(" ");
        for(int i = 0; i < inputLine.length; i++){
            child.add(Integer.parseInt(inputLine[i]));
        }

        constructNAryTree(parent, child);
        br.close();
    }
}
