package javaLab.javaLabMST;


public class nullPointrExcp {
        public static void main(String[] args) {
            
            try {
                String str = null;
                System.out.println(str.length());
                
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("\n NUll pointer Exception\n ");
            }
           
        }
}
