package Trie;

class Node {
    Node[] links = new Node[26];
    boolean flag = false;

    public Node() {

    }

    boolean containsKey(char c){
        return (links[c - 'a'] != null);
    }

    Node get(char c){
        return links[c - 'a'];
    }

    void put(char c, Node node){
        links[c - 'a'] = node;
    }

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}
