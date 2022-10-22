package Linked_List;

public class doubleLinkedList extends singleLinkedList{
    Node createDList(int[] arr, int n){
        Node root = n == 0 ? null : new Node(arr[0]);
        Node curr = root;
        for(int i = 1; i < n; i++){
            Node temp = new Node(arr[i]);
            curr.next = temp;
            temp.prev = curr;
            curr = curr.next;
        }
        return root;
    }

    Node insertEnd(Node root, int val){
        Node temp = new Node(val);
        if(root == null)
            return temp;
        Node curr = root;
        while(curr.next != null)
            curr = curr.next;
        curr.next = temp;
        temp.prev = curr;
        return root;
    }

    Node insertBegin(Node root, int val){
        Node temp = new Node(val);
        temp.next = root;
        if(root != null)
            root.prev = temp;
        return temp;
    }

    Node reverse(Node root){
        if(root == null || root.next == null)
            return root;
        
        Node prev = null;
        Node curr = root;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }

        return prev.prev;
    }
}
