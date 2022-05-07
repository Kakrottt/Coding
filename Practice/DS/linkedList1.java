package DS;


public class linkedList1 {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
        return;
    }

    public Node noder(int pre_num){
        Node temp = head, pre = null;

        while(temp != null && temp.data != pre_num){
            pre = temp;
            temp = temp.next;
        }
        return temp;
    }


    public void addAfter(Node pre_node, int new_data){
        if(pre_node == null){
            System.out.println("Error!!");
            return;
        }
        
        Node new_node = new Node(new_data);

        new_node.next = pre_node.next;

        pre_node.next = new_node;
    }

    public void addEnd(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    public void printList(){
        Node tnode = head;

        while(tnode != null){
            System.out.print(tnode.data + " >> " );
            tnode = tnode.next;
        }        
    }

    public void revPrintList(int x){
        if(head==null)
            return;
        revPrintList(x-1);

    }

    // public static void main(String[] args) {
    //     linkedList1 lList1 = new linkedList1();
        
    //     char yno = 'Y';

    //     Scanner sch = new Scanner(System.in);     

    //     do{   
    //         System.out.println("\nWhere you want to add number : ");
    //         System.out.println("1. At Starting");
    //         System.out.println("2. After the Number");
    //         System.out.println("3. At the End");
    //         System.out.print("\nEnter Choice from 1, 2, 3 : ");
    //         int choice = sch.nextInt();

    //         switch (choice) {
    //         case 1:
    //             System.out.print("\nEnter Number : ");
    //             int data = sch.nextInt();
    //             lList1.push(data);
    //             break;

    //         case 2:
    //             System.out.print("\nPrevious Number : ");
    //             int pren = sch.nextInt();
    //             System.out.print("\nEnter Number : ");
    //             int data1 = sch.nextInt();
                
    //             Node pre_num = lList1.noder(pren);
    //             lList1.addAfter(pre_num, data1);
    //             break;

    //         case 3:
    //             System.out.print("\nEnter Number : ");
    //             int data2 = sch.nextInt();
    //             lList1.addEnd(data2);
    //             break;
        
    //         default:
    //             System.out.println("Error");
    //             break;
    //         }

    //     lList1.printList();
    //     System.out.print("\n\nAdd Another Number :");
    //     yno = sch.next().charAt(0);

    //     }while(yno != 'n' || yno == 'N');

    //     System.out.print("Final List is : ");
    //     lList1.printList();
    
    // }


}
