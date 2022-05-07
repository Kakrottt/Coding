package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class secondLargest {

        public int secLar(ArrayList<Integer> arr){
            int res = -1, largest = 0;
            for (int i = 0; i < arr.size(); i++) {
                // Condition 1 : greater than largest
                if(arr.get(i)>largest){
                    res = largest;
                    largest = arr.get(i);
                }

                // Codition 2: not equal to largest
                else if(arr.get(i)!=largest){
                
                    // Codition 3: greater than second largest
                    if(res == -1 || arr.get(i)>res)
                        res = arr.get(i);
                }

            }

            return res;
        }

        public static void main(String[] args) {
            secondLargest sl = new secondLargest(); //object creation
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> arr = new ArrayList<Integer>(); //integer list

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr.add(x);
            }

            int res = sl.secLar(arr);

            System.out.println(res);

            sc.close();
        }
}
