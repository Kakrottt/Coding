import java.util.Scanner;

/** Starter code for the Kick Start 2022 problem "GBus count". */
public class GBusCountSolution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Read the number of test cases.
    int t = scanner.nextInt();
    for (int caseIndex = 1; caseIndex <= t; caseIndex++) {
      // Read the GBus specifications.
      int n = scanner.nextInt();
      GBus[] gBuses = new GBus[n];
      for (int i = 0; i < n; i++) {
        gBuses[i] = new GBus(scanner.nextInt(), scanner.nextInt());
      }
      // Read the city set P.
      int p = scanner.nextInt();
      int[] cities = new int[p];
      for (int i = 0; i < p; i++) {
        cities[i] = scanner.nextInt();
      }
      // Solve the test case.
      int[] counts = countBuses(gBuses, cities);
      // Format the output.
      StringBuffer countStringBuffer = new StringBuffer();
      for (int count : counts) {
        countStringBuffer.append(" " + count);
      }
      System.out.println("Case #" + caseIndex + ":" + countStringBuffer);
    }
  }

  /** Calculates how many GBuses serve each city. */
  static int[] countBuses(GBus[] gBuses, int[] cities) {
    // TODO(you): Implement this method to return an array of the number of buses serving each city.
    return new int[cities.length];
  }

  /** Specifies the endpoints of a GBus route: the GBus serves cities A through B. */
  private static class GBus {
    /** Represents city A. */
    int a;
    /** Represents city B. */
    int b;

    GBus(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
