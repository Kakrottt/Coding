package Tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Tree{
    int val;
    List<Node> next;
    
    public Tree(){
        this.next = new ArrayList<>();
    }
    public Tree(int val){
        this.val = val;
        this.next = new ArrayList<>();
    }
};

class Node{
    int val; 
    List<Node> next;

    public Node(int val){
        this.val = val;
        this.next = new ArrayList<>();
    }
}

public class buildTree {

    static void treeStructure(int[] arr1, int[] arr2, int n){

    }

    static Tree constructTree(Map<Integer, Set<Integer>> map, int curr, Node parent){
        Tree res = new Tree(curr);
        for(int x : map.getOrDefault(curr, new HashSet<>())){
            Node currNode = new Node(x);
            if(parent == null)
                res.next.add(currNode);
            else
                parent.next.add(currNode);
            constructTree(map, x, currNode);
        }
        return res;
    }

    static void printLevelOrder(Tree node){
        System.out.println(node.val);
        Queue<Node> q = new LinkedList<>();
        q.addAll(node.next);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node cur = q.poll();
                System.out.print(cur.val + " ");
                if(cur.next.size() > 0)
                    q.addAll(cur.next);
            }
            System.out.println();
        }
    }

    static void printPreOrder(Tree node){
        if(node == null)
            return;
        System.out.println(node.val);
        
    }



    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] in1 = br.readLine().trim().split(" ");
        String[] in2 = br.readLine().trim().split(" ");
        int n = in1.length;
        int root = -1;
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int from = Integer.parseInt(in1[i]);
            int to = Integer.parseInt(in2[i]);

            if(Integer.parseInt(in1[i]) == -1){
                root = to;
                continue;
            }
            
            map.putIfAbsent(from, new HashSet<>());
            map.get(from).add(to);
        }

        for(Map.Entry<Integer, Set<Integer>> e : map.entrySet()){
            System.out.println(e);
        }

        Tree tree = constructTree(map, root, null);
        printLevelOrder(tree);

        //treeStructure(arr1, arr2, n);

        br.close();
    }
}
