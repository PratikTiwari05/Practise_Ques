//  class pattern {
//      public static void main(String[] args) {
//         for(int i=0;i<4;i++){
//             for(int j=0;j<5;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//      }
// }



//  class pattern {
//      public static void main(String[] args) {
//         for(int i=0;i<4;i++){
//             for(int j=0;j<5;j++){
//               if(i==0 || i==3 || j==0 || j==4){
//                 System.out.print("*");
//               }
//               else{
//                 System.out.print(" ");
//               }
//             }
//             System.out.print("\n");
//         }
//      }
// }


//  class pattern {
//      public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//         for(int j=0;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//      }
// }



//  class pattern {
//      public static void main(String[] args) {
//      for(int i=1;i<=4;i++){
//         //Space Print
//         for(int k=1;k<=4-i;k++){
//             System.out.print(" ");
//         }
//         //star print
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }
//      }



//  class pattern {
//      public static void main(String[] args) {
//        for(int i=4;i>0;i--){
//         for(int j=0;j<=i;j++){
//             System.out.print(j+1);
//         }
//         System.out.println();
//        }
//      }
// }


//  class pattern {
//      public static void main(String[] args) {
//       int val=1;
//        for(int i=0;i<5;i++){
//         for(int j=0;j<=i;j++){
//           System.out.print(val+" ");
//           val++;
//         }
//         System.out.println();
//        }
//      }
// }


//  class pattern {
//      public static void main(String[] args) {
//       for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//           int sum=i+j;
//           if(sum%2==0) System.out.print("0 ");
//           else System.out.print("1 ");
//         }
//         System.out.println();
//       }
//      }
// }



//Solid Rohmbus
//  class pattern {
//      public static void main(String[] args) {
//      for(int i=5;i>=1;i--){
//       //Space print
//       for(int j=1;j<=i;j++){
//         System.out.print(" ");
//       }
//       //print stars
//       for(int k=1;k<=5;k++){
//         System.out.print("* ");
//       }
//       System.out.println();
//      }
//      }
// }


//  class pattern {
//      public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//         //Space print
//         for(int j=1;j<=5-i;j++){
//           System.out.print(" ");
//         }
//         //Print
//         for(int k=1;k<=i;k++){
//           System.out.print(i+" ");
//         }
//         System.out.println();
//        }
//      }
// }




//  class pattern {
//      public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//        //Print spaces
//        for(int k=1;k<=5-i;k++){
//         System.out.print(" ");
//        }

//         //print digitsd
//       for(int j=i;j>=1;j--){
//         System.out.print(j);
//       }
//       if(i>=2){
//         for(int j=2;j<=i;j++){
//           System.out.print(j);
//         }
//       }

//       System.out.println();
//        }
//      }
// }


//  class pattern {
//      public static void main(String[] args) {
//      for(int i=1;i<=4;i++){
//       //Star
//       for(int j=1;j<=i;j++){
//          System.out.print(" * ");
//       }
//       //Space
//       for(int k=1;k<=2*(4-i);k++){
//          System.out.print("   "); 
//       }
//       //star
//       for(int l=1;l<=i;l++){
//         System.out.print(" * ");
//       }
//       System.out.println();
//      }
//      //REVERSE OF ABOVE

//       for(int i=4;i>=1;i--){
//       //Star
//       for(int j=1;j<=i;j++){
//          System.out.print(" * ");
//       }
//       //Space
//       for(int k=1;k<=2*(4-i);k++){
//          System.out.print("   "); 
//       }
//       //star
//       for(int l=1;l<=i;l++){
//         System.out.print(" * ");
//       }
//       System.out.println();
//      }
//      }
// }


// class pattern{
//   public static void main(String[] args) {
    
//     for(int i=1;i<=4;i++){
//       //Spaces
//       for(int j=1;j<=4-i;j++){
//         System.out.print(" ");
//       }
//       //stars
//       for(int k=1;k<=2*i-1;k++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     for(int i=4;i>=1;i--){
//       //Spaces
//       for(int j=4-i;j>=1;j--){
//         System.out.print(" ");
//       }
//       //stars
//       for(int k=1;k<=2*i-1;k++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


//Hollow Rohmbus
// import java.util.Scanner;
// public class pattern {

//   public static void main(String[] args) {
//      Scanner sc= new Scanner(System.in);
//   int n = sc.nextInt();
//   // System.out.println(n);
//     for(int i=1;i<=n;i++){
//       //Print spaces
//       for(int j=1;j<=n-i;j++){
//      System.out.print("   ");
//       }
//       //print star
//       for(int k=n;k>=1;k--){

//         if (i == 1 || i == n || k == 1 || k == n){
//          System.out.print(" * ");
//         }
//         else{
//           System.out.print("   ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }

// import java.util.Scanner;

// public class pattern {

//   public static void main(String[] args) {
//   //   int count=1;
//   //  for(int i=4;i>=1;i--){
//   //  //print space
//   //  for(int )

//   //   for(int j=1;j<=i;j++){
//   //     System.out.print(count);
//   //   }
//   //   count++;
//   //   System.out.println();
//   //  }
//   Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();
//   System.out.println(n);
//   }
// }



// import java.util.Scanner;

// public class pattern {

//   public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=0;i<n;i++){
//       System.out.println("Hello World");
//     }
//   }
// }

// import java.util.*;
// public class pattern {

//   public static void main(String[] args) {
//     int count=1;
//    for(int i=5;i>=1;i--){
//    //Space
//    for(int k=1;i<=5-k;k++){
//     System.out.print("  ");
//    }

//     for(int j=1;j<=i;j++){
//       System.out.print(" "+count+" ");
//     }
//     count++;
//     System.out.println();
//    }
//   }
// }

// public class pattern {

//   public static void main(String[] args) {
//     for(int i=1;i<=5;i++){
//      //space 
//      for(int k=1;k<=5-i;k++){
//       System.out.print(" ");
//      }

//       for(int j=1;j<=i;j++){
//         System.out.print(j+" ");
//       }
//       System.out.println();
//     }
//   }
// }