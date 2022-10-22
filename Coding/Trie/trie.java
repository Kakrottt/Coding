package Trie;

public class trie {
    
    private static Node root;

    trie() {
        root = new Node();
    }

    void insert(String word){
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new Node());
            }
            node.get(word.charAt(i));
        }
        node.setEnd();
    }

    boolean search(String word){
        
        return false;
    }

    boolean startsWith(String word){

        return false;
    }
}
