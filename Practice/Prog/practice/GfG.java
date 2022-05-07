import java.util.Scanner;

class GfG
{
    public static void print(int arr[], int n)
    {
        // your code here
        System.out.print(arr[0] + " ");
        for(int i=1; i<n; i++){
            if(i%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        for(int i=0; i<10; i++){
            int input = sc.nextInt();
            arr[i] = input;
        }
    print(arr, 10);
    }
}