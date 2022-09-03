package Kickstart;
//import java.io.*;
import java.util.*;

public class wiggleWalk {
  static int[][] mat;

  private static int[] endPosition(int N, int R, int C, int Sr, int Sc, String instructions) {
    
    mat = new int[R+1][C+1];
    // int[] ans = new int[2];
    // ans[0] = Sr;
    // ans[1] = Sc;
    mat[Sr][Sc] = 1;

    for (int i = 0; i < instructions.length(); i++) {
      if(instructions.charAt(i) == 'N')
        {
          Sr = moveUp(Sr, Sc);
          mat[Sr][Sc] = 1;
        }

      if(instructions.charAt(i) == 'S')
        {
          Sr = moveDown(Sr, Sc);
          mat[Sr][Sc] = 1;
        }

      if(instructions.charAt(i) == 'E')
        {
          Sc = moveRight(Sr, Sc);
          mat[Sr][Sc] = 1;
        }

      if(instructions.charAt(i) == 'W')
        {
          Sc = moveLeft(Sr, Sc);
          mat[Sr][Sc] = 1;
        }
    }
    // finishes.
    return new int[] {Sr+1, Sc+1};
  }

  static int moveUp(int Sr, int Sc){
    Sr -= 1;
    while(mat[Sr][Sc] == 1)
      Sr--;
    return Sr;
  }

  static int moveDown(int Sr, int Sc){
    Sr += 1;
    while(mat[Sr][Sc] == 1)
      Sr++;
    return Sr;
  }

  static int moveRight(int Sr, int Sc){
    Sc += 1;
    while(mat[Sr][Sc] == 1)
      Sc++;
    return Sc;
  }

  static int moveLeft(int Sr, int Sc){
    Sc -= 1;
    while(mat[Sr][Sc] == 1)
      Sc--;
    return Sc;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int t = 1; t <= T; ++t) {
      int N = in.nextInt();
      int R = in.nextInt();
      int C = in.nextInt();
      int Sr = in.nextInt();
      int Sc = in.nextInt();
      String instructions = in.next();
      int[] ans = endPosition(N, R, C, Sr-1, Sc-1, instructions);
      System.out.println("Case #" + t + ": " + ans[0] + " " + ans[1]);
    }
    in.close();
  }
}
