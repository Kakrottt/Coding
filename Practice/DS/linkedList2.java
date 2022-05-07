package DS;

public class linkedList2 extends linkedList1{
    public void deleteKey(int key){
        Node temp = head, pre = null;

        if(temp != null && temp.data != key){
            head = head.next;
            return;
        }

        while(temp != null && temp.data != key){
            pre = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("\n Not Found");
            return;
        }

        pre.next = temp.next;



    
    }

}
