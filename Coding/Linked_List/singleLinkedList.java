package Linked_List;

public class singleLinkedList {
    Node createLList(int[] arr, int n){
        Node root = n == 0 ? null : new Node(arr[0]);
        Node curr = root;
        for(int i = 1; i < n; i++){
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = curr.next;
        }
        return root;
    }

    Node insertBegin(Node root, int val){
        Node temp = new Node(val);
        temp.next = root;
        return temp;
    }

    Node insertEnd(Node root, int val){
        Node temp = new Node(val);
        if(root == null)
            return temp;
        Node curr = root;
        while(curr.next != null)
            curr = curr.next;
        curr.next = temp;
        return root;
    }

    Node insertPos(Node root,int pos, int val){
        Node temp = new Node(val);
        if(pos == 1){
            temp.next = root;
            return temp;
        }
        Node curr = root;
        for(int i = 1; i <= pos-2 && curr != null; i++){
            curr = curr.next;
        }
        if(curr == null){
            return root;
        }
        temp.next = curr.next;
        curr.next = temp;
        return root;
    }

    Node deleteHead(Node root){
        if(root == null) return null;
        root = root.next;
        return root;
    }

    Node deleteLast(Node root){
        if(root == null) return null;
        if(root.next == null) return null;
        Node curr = root;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return root;
    }

    int searchNode(Node root, int key){
        if(root == null)
            return -1;
        if(root.val == key)
            return 1;
        int res = searchNode(root.next, key);
        if(res == -1)
            return -1;
        else
            return 1 + res;
    }

    public void printList(Node root){
        Node curr = root;
        while(curr.next != null){
            System.out.print(curr.val + " --> " );
            curr = curr.next;
        }
        System.out.println(curr.val);
    }

    public Node reverseList(Node root){
        if(root == null)
            return null;
        if(root.next == null)
            return root;
        
        Node curr = root;
        Node prev = null;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        return prev;
    }
    public Node reverseList_rec(Node curr, Node prev){
        if(curr == null)
            return prev;
        
        Node next = curr.next;
        curr.next = prev;
        return reverseList_rec(next, curr);
    }

    Node reverseListK_rec(Node root, int K){
        Node curr = root;
        Node prev = null;
        Node next = null;
        int count = 0;
        while(curr != null && count < K){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            Node rest = reverseListK_rec(next, K);
            root.next = rest;
        }

        return prev;
    }

    Node reverseListK(Node root, int K){
        Node curr = root;
        Node prevFirst = null;
        boolean isFirstPass = true;
        
        while(curr != null){
            Node first = curr;
            Node prev = null;
            int count = 0;
            while(curr != null && count < K){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(isFirstPass){
                isFirstPass = false;
                root = prev;
            }
            else{
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return root;
    }

    Node removeDuplicate(Node root){
        if(root == null)
            return null;

        Node curr = root;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else 
                curr = curr.next;
        }
        return root;
    }

    int middle(Node root){
        if(root == null)
            return -1;

        if(root.next == null || root.next.next == null)
        return root.val;

        Node slow = root;
        Node fast = root.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
