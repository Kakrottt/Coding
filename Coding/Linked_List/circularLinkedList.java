package Linked_List;

public class circularLinkedList {
    public Node createList(int[] arr){
        Node root = arr.length == 0 ? null : new Node(arr[0]);
        Node curr = root;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = curr.next;
        }
        curr.next = root;
        return root;
    }

    void printList(Node root){
        if(root == null)
            return;
        Node curr = root;
        do {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        } while(curr.next.next!=root);
        System.out.println(curr.next.val);
    }

    Node insertBegin(Node root, int val){
        Node temp = new Node(val);
        if(root == null){
            temp.next = temp;
            return temp;
        }
        temp.next = root.next;
        root.next = temp;

        int t = temp.val;
        temp.val = root.val;
        root.val = t;

        return root;
    }

    Node insertEnd(Node root, int val){
        Node temp = new Node(val);
        if(root== null){
            temp.next = temp;
            return temp;
        }

        temp.next = root.next;
        root.next = temp;

        int t = temp.val;
        temp.val = root.val;
        root.val = t;

        return temp;
    }

    Node deleteHeadNaive(Node root){
        if(root ==  null || root.next == root)
            return null;

        Node curr = root;
        while(curr.next != root){
            curr = curr.next;
        }

        curr.next = root.next;

        return curr.next;
    }

    Node deleteHead(Node root){
        if(root == null || root.next == root)
            return null;
        
        root.val = root.next.val;
        root.next = root.next.next;
        
        return root;
    }
}
