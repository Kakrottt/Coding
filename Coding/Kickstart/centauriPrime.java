// package Kickstart;
// import java.util.*;

// public class centauriPrime {

//   private static String getRuler(String kingdom) {
//     String ruler = "nobody";
//     if(kingdom.charAt(kingdom.length()-1)=='y' || (kingdom.charAt(kingdom.length()-1))=='Y')
//       return ruler;
//     switch (kingdom.charAt(kingdom.length()-1)) {
//       case 'a': ruler = "Alice";     
//         break;
//       case 'A': ruler = "Alice";     
//         break;
//       case 'e': ruler = "Alice";     
//         break;
//       case 'E': ruler = "Alice";     
//         break;
//       case 'i': ruler = "Alice";     
//         break;
//       case 'I': ruler = "Alice";     
//         break;
//       case 'o': ruler = "Alice";     
//         break;
//       case 'O': ruler = "Alice";     
//         break;
//       case 'u': ruler = "Alice";     
//         break;
//       case 'U': ruler = "Alice";     
//         break;
    
//       default: ruler = "Bob";  
//         break;
//     }
//     return ruler;
//   }

//   public static void main(String[] args) {
//     try (Scanner in = new Scanner(System.in)) {
//       int T = in.nextInt();

//       for (int t = 1; t <= T; ++t) {
//         String kingdom = in.next();
//         System.out.println(
//             "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
//       }
//     }
//   }
// }
