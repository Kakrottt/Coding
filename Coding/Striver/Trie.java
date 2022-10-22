package Striver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Node{
    Node[] links;
    boolean flag;

    public Node(){
        flag = false;
        links = new Node[26];       
    }

    boolean containsKey(char ch){
        return (links[ch - 'a'] != null);
    }

    Node get(char ch){
        return (links[ch - 'a']);
    }

    void putChar(char ch, Node node){
        links[ch - 'a'] = node;
    }

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

public class Trie {
    private static Node root = new Node();

    // Trie(){
    //     root = new Node();
    // }

    static void insert(String word){
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i)))
                node.putChar(word.charAt(i), new Node());
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    static boolean search(String word){
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i)))
                return false;
            node = node.get(word.charAt(i));
        }

        if(node.isEnd())
            return true;
        return false;
    }

    static boolean startsWith(String prefix){
        Node node = root;
        for(int i = 0; i < prefix.length(); i++){
            if(!node.containsKey(prefix.charAt(i)))
                return false;
            node = node.get(prefix.charAt(i));
        }
        return true;
    }




    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in1 = br.readLine().trim().split(" ");
        String[] in2 = br.readLine().trim().split(" ");
        for(int i = 0; i < in1.length; i++){
            if(Integer.parseInt(in1[i]) == 1)
                insert(in2[i]);

            if(Integer.parseInt(in1[i]) == 2)
                System.out.println(search(in2[i]));

            if(Integer.parseInt(in1[i]) == 3)
                System.out.println(startsWith(in2[i]));
        }
        br.close();
    }
}
