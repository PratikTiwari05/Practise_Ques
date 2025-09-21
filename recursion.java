// public class recursion {
//     public static void print(int n) {
//         if(n==-0) return;
//         System.out.println(n);
//         print(n-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         print(n);
//     }
// }



// public class recursion {

//     public static void print(int n,int count){
//         if(count==n+1) return;
//         System.out.println(count);
//         print(n, count+1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int count=1;
//         print(n,count);
//     }
// }

// public class recursion {

//     public static int total(int n,int value){
//         if(n==0) return value;
//         value+=n;
//          return total(n-1, value);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int value=0;
//         int ttl=total(n, value);
//         System.out.println(ttl);
//     }
// }


// public class recursion {

//     public static int factorial(int n){
//         if(n==0|| n==1) return 1;
//         return n*factorial(n-1);
//     }
//     public static void main(String[] args) {
//         int n=5;
//         int value=factorial(n);
//         System.out.println(value);
//     }
// }