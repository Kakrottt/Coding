package DS;

import java.util.Scanner;

public class linkedListsmst1 {

    static Node head;

    static class Node{
        int data;
        String name;
        String deptt;
        Node next = null;
        Node(int d, String n, String dt){
            data = d;
            name = n;
            deptt = dt;
        }
    }

    public void add_node(int d, String n, String dt){
        Node new_node = new Node(d, n, dt);

        if(head == null){
            head = new Node(d, n, dt);
            return;
        }

        new_node.next = null;

        Node last = head;
        while(last.next != null){
            last=last.next;
        }

        last.next = new_node;
        return;

    }

    public void delete_node(int d){
        Node temp = head, prev = null;
 
        
        if (temp != null && temp.data == d) {
            head = temp.next;
            return;
        }
        
        while (temp != null && temp.data != d) {
            prev = temp;
            temp = temp.next;
        }
         
        if (temp == null)
            return;
 
        
        prev.next = temp.next;
    }

        public void printList()	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.println("| " + tnode.data+"\t\t | " + tnode.name + "\t\t | " + tnode.deptt + "\t\t | " );
			tnode = tnode.next;
		}
	}

    public static void main(String[] args) {
        
        linkedListsmst1 llist = new linkedListsmst1();
        boolean flag = true;
        Scanner sci = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        
        do{
            System.out.print("Enter Name : ");
            String n = sc.nextLine();

            System.out.print("Enter Id No. : ");
            int data = sci.nextInt();

            System.out.print("Enter Deptt : ");
            String deptt = sca.nextLine();

            llist.add_node(data, n, deptt);

            System.out.println();
            System.out.print("Want to Add another field ? : ");
            char c = sci.next().charAt(0);

            if(c == ('n'|'N')){
                flag = false;
            }
        } while(flag==true);
            

        // llist.add_node(001, "name1", "ccdpt");
        // llist.add_node(002, "name2", "ccdpt");
        // llist.add_node(003, "name3", "ccdpt");
        // llist.add_node(004, "name4", "ccdpt");
        // llist.delete_node(002);

        System.out.println("| Id No.  \t| Name \t\t| Department \t\t");
        llist.printList();

        System.out.print("Delete Element : ");
        char yd = sci.next().charAt(0);

        if(yd == ('y'|'Y')){
            System.out.print("Enter Id no. : ");
            int del = sci.nextInt();

            llist.delete_node(del);
        }

        System.out.println("| Id No.  \t| Name \t\t| Department \t\t");
        llist.printList();


        
    }

    
}
