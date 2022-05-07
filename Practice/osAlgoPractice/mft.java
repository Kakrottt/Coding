package osAlgoPractice;
import java.util.Scanner;

public class mft {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);

        System.out.print("Enter the total available memory : ");
        int m = si.nextInt();

        System.out.print("Enter the number of process : ");
        int p = si.nextInt();
        int proc[] = new int[p];
		int frag[] = new int[p];

		for (int i = 0; i < p; i++) {
			int blok = 300;
            System.out.println("Enter memory required for Process " + i + " : ");
            proc[i] = si.nextInt();
			// System.out.print("\nEnter the Block Size : ");
        	// int blok = si.nextInt();
			frag[i] = blok- proc[i];
		}

		System.out.println("Memory Req | Fragmentation ");
		for (int i = 0; i < p; i++) {
			System.out.println(proc[i] + "        |     " + frag[i]);			
		}

	}
}
