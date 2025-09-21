//Print the factorial of a given number
// import java.util.Scanner;

// public class Csolution {
//     public static int factorial(int n){
//      if(n==0|| n==1){
//         return 1;
//      }
//      return n*factorial(n-1);
//     }

//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          int val=sc.nextInt();
//         System.out.println(factorial(val));
//     }
// }

//Find the area of the circle when the diameter is given
// public class Csolution {

//     public static void main(String[] args) {
//         float pi=3.14f;
//         float diameter=3.0f;
//         float radius=diameter/2;
//         //Below is used to round upto 2 decimal places
//         float area= Math.round(pi*radius*radius*100.0f)/100.0f;
//         System.out.println(area);

//     }
// }

//Finding Gcd of any two numbers
//Logic Euclidiena algorithim
// public class Csolution {
//    public static int gcd(int a ,int b){
//     if(a==0) return b;
//     if(b==0) return a;
//     if(a==b) return a;
//     if(a>b){
//         return gcd(a-b,b);
//     }
// return gcd(a,b-a);
//    }
//     public static void main(String[] args) {
//         int a=12;
//         int b=18;
//         int answer=gcd(a,b);
//         System.out.println(answer);
//     }
// }

//Check a number is a prime number or not if its a prime print its square upto
//2 decimal places

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0;
//         for(int i=1;i*i<=n;i++){
//                if(n%i==0){
//                 count++;
//                 if(n/i!=i) count++;
//                }
//         }
//         if(count==2){
//             System.out.println("Prime Number");
//             float value= (float)Math.sqrt(n);
//             float ans=Math.round(value*100.0f)/100.0f;
//             System.out.println(ans);
//         }
//         else{
//             System.out.println("Not a Prime number");
//         }
//     }
// }

//Ques: Print all the prime number starting from a to b

// import java.util.Scanner;

// public class Csolution {
//     public static boolean isPrime(int n){
//         if(n<=1){
//             return true;
//         }
//         int count=0;
//         for(int i=1;i*i<=n;i++){
//              if(n%i==0){
//                 count++;
//                 if(n/i!=i) count++;
//              }
//         }
//         return count==2?true:false;
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=0;
//         for(int i=a;i<=b;i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//                 sum+=i;
//             }
//         }
//         System.out.println();
//       System.out.println(sum);
//     }
// }

//Q:When a enter a date in the form of dd-mm-yyyy, Find out the no of days in that months
//Note: Just amke sure that there is no concept of leap year

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the date in dd-mm-yyyy format:");
//         String str= sc.next();
//         System.out.println(str);
//        //Break the string into parts that is dd,mm,yyyy
//        String s[]= str.split("-");
//        int month= Integer.parseInt(s[1]);
//        //s[0]=dd;
//        //s[1]=mm;
//        //s[2]=yyyy;
//      int day=0;
//       if(month==1||month==3||month==5||month==7||month==8||month==10|| month==12){
//         day=31;
//       }
//       else if(month==2){
//         day=28;
//       }
//       else{
//         day=30;
//       }
//       System.out.println("The no days in the "+month+" is equal to: "+day);
//     }
//}

//Program to find whether a number is perfect square or not

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int value=(int)Math.sqrt(n);
//         if(value*value==n){
//             System.out.println("Its a perfect square");
//         }
//         else{
//             System.out.println("Not a perfect square");
//         }
//     }
// }

//Program to find sum of all the digits in a number

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         //To convert string to int
//         //1.String Conactenation str+" "
//         //2.Integer.toString(n)
//         //3.String.valueOf(n)
//         String str= Integer.toString(n);
//         int sum=0;
//         for(int i=0;i<str.length();i++){
//          int val=str.charAt(i)-'0';
//          sum+=val;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class Csolution {

//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the qty of diesel in ltr");
//         int fluid= sc.nextInt();
//         System.out.println("Ltr of dieseil is: "+fluid);
//         if(fluid<=0){
//             System.out.println("Inavlid Input");
//             return;
//         }
//         System.out.println("Enter the distance covered by tank");
//         int dist= sc.nextInt();
//         System.out.println("The distance covered here is: "+dist);
//         if(dist<=0){
//             System.out.println("Invalid Input");
//             return;
//         }
//         //convert distnace to miles
//          double distance=dist*0.6214;
//         //convert fuel in ltr to gallons
//         double fuel=fluid*0.2642;
//         //Lets first find inEuropena style
//       double ans = fluid *100.0 / dist ;
//     System.out.println(Math.round(ans * 100f) / 100f);
//         //Lets find in US style
//         double ans2=distance/fuel;
//         System.out.println(Math.round(ans2*100f)/100f);
//     }
// }

// import java.util.Scanner;

// public class Csolution{

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of Pizza");
//         int pizza=sc.nextInt();
//         System.out.println(pizza);
//         System.out.println("Enter the no of puff");
//         int puff=sc.nextInt();
//         System.out.println(puff);
//         System.out.println("Enter the no of colddrink");
//         int colddrink=sc.nextInt();
//         System.out.println(colddrink);

//         System.out.println("Bill Details");
//         System.out.println("No of pizzas: "+pizza);
//         System.out.println("No of puffs: "+puff);
//         System.out.println("No of Colddrinks: "+colddrink);
//         int ans=pizza*100+puff*20+colddrink*10;
//         System.out.println("Total: "+ans);

//     }
//}

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String args[]){
//         System.out.println("Enter the digits");
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int d=sc.nextInt();
//         System.out.println(a+"-"+(char)a);
//         System.out.println(b+"-"+(char)b);
//         System.out.println(c+"-"+(char)c);
//         System.out.println(d+"-"+(char)d);
//     }
// }

// import java.util.Scanner;

// public class Csolution{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the no of tickets");
//         double total=0;
//         int n=sc.nextInt();
//         if(n<5 || n>40){
//             System.out.println("Minimum of 5 and Maximum 40 tickets");
//             return;
//         }
//         sc.nextLine();
//         System.out.println("Do you want refereshment");
//         String ans=sc.nextLine();
//         System.out.println("Do you have a Coupon?");
//         String ans2= sc.nextLine();
//         System.out.println("Enter the circle  k or q");
//         String ans3=sc.next();
//         if(ans3.equalsIgnoreCase("k")){
//             total+=n*75;
//         }
//         else if(ans3.equalsIgnoreCase("q")){
//             total+=n*150;
//         }
//         else{
//             System.out.println("Invalid Circle");
//             return;
//         }
//          if(n>20){
//             total*=0.90;
//         }
//         if(ans2.equalsIgnoreCase("y")){
//             total*=0.98;
//         }
//         if(ans.equalsIgnoreCase("y")){
//             total+=n*50;
//         }
//         double finalVal=Math.round(total*100.0)/100.0;
//        System.out.println("Ticket Cost is: "+ finalVal);
//     }
// }

// import java.util.*;
// public class Csolution{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         switch (n) {
//            case 1:
//            case 2:
//            case 12:
//            System.out.println("Winter");
//            break;
//            case 3:
//            case 4:
//            case 5:
//            System.out.println("Spring");
//            break;
//            case 6:
//            case 7:
//            case 8:
//            System.out.println("Summer");
//            case 9:
//            case 10:
//            case 11:
//            System.out.println("Autumn");
//            break;
//            default:
//            System.out.println("Invalid Month");
//         }
//     }
// }

// import java.util.Scanner;

// public class Csolution {
//     public static boolean isPrime(int n){
//         if(n<=1) return false;
//         int count=0;
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0) return false;
//         }
//         return true;
//     }

//     public static void main(String args[]){
//        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        if(a>b || a<0 || b<0){
//         System.out.println("Provide Valid Imput");
//         return;
//        }
//        for(int i=a;i<=b;i++){
//         if(isPrime(i)){
//             System.out.println(i);
//         }
//        }
//     }
// }

// import java.util.*;
// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         //reverse number
//         int reverseNum=0;
//         int val=n;
//         while(n!=0){
//             int carry=n%10;
//             reverseNum=reverseNum*10+carry;
//             n=n/10;
//         }
//         System.out.println(reverseNum);
//         String str=Integer.toString(val);
//         int i=0;
//         int j=str.length()-1;
//         while(i<=j){
//             if(str.charAt(i)!=str.charAt(j)){
//                 System.out.println("Not Palindrome");
//                 sc.close();
//                 return;
//             }
//             i++;
//             j--;
//         }
//         System.out.println("Palindrome Number");

//     }
// }

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Salary");
//         int salary=sc.nextInt();
//         System.out.println("Enter the performance appraisal Rating");
//         float rating=sc.nextFloat();
//         if(salary<=0 || rating<1.0 ||rating>5.0){
//             System.out.println("Invalid Input");
//             return;
//         }
//         if(rating>=1.0 && rating<=3.0){
//             salary+=salary*10/100;
//         }
//         else if(rating>=3.1 && rating<=4.0){
//             salary+=salary*25/100;
//         }
//         else{
//             salary+=salary*30/100;
//         }
//         System.out.println(salary);
//     }
// }

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n=sc.nextInt();
//         System.out.println(n);
//         if(n<999 || n>9999){
//             System.out.println("Enter 4 digit number only");
//             return;
//         }
//         int sum=0;
//         while(n!=0){
//         int bit=n%10;
//         sum+=bit;
//         n=n/10;
//         }
//         if(sum%3==0 || sum%7==0|| sum%5==0){
//             System.out.println("Lucky Number");
//         }
//         else{
//             System.out.println("Not a Lucky Number");
//         }
//     }
// }

// import java.util.*;
// public class Csolution{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of course");
//         int n=sc.nextInt();
//         if(n<=0){
//             System.out.println("Invalid Rnage");
//             return;
//         }
//         System.out.println(n);
//         String course[]=new String[n];
//         for(int i=0;i<n;i++){
//             course[i]=sc.next();
//         }

//         System.out.println("Enter the course you want to search");
//         String st=sc.next();
//         System.out.println(st);
//         for(int i=0;i<n;i++){
//             //System.out.println(course[i]+" "+st);
//             if(course[i].equalsIgnoreCase(st)){
//                 System.out.println(st+" Course is availaible");
//               return;
//             }
//         }
//         System.out.println(st+"Course is not availaible");
//     }
// }

// import java.util.Scanner;

// public class Csolution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         System.out.println(num);
//         int n=Math.abs(num);
//         if(n==0){
//             System.out.println("No factors");
//             System.exit(0);
//         }
//         else{
//             for(int i=1;i<=n;i++){
//                 if(n%i==0){
//                     System.out.println(i+" ");
//                 }
//             }
//         }
//     }
// }

//COGNIZANT PRACTISE SET

//ques:You are given a string s.
// Write a program to find the first non-repeating character in the string. 
//If all characters repeat, print -1.

// import java.util.*;

// public class Csolution {

//      public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.next();
//         HashMap<Character,Integer>mp= new LinkedHashMap<>();
//           for(int i=0;i<str.length();i++){
//             Character ch= str.charAt(i);
//             mp.put(ch, mp.getOrDefault(ch, 0)+1);
//           }

//           for(Map.Entry<Character,Integer>it:mp.entrySet()){
//             char ch=it.getKey();
//             int freq=it.getValue();
//             if(freq==1){
//                 System.out.println(ch);
//                 return;
//             }
//           }
//      }
// }

// Problem:
// Given an array of integers and an integer k, 
// find the maximum sum of any subarray of size k.

// public class Csolution {

//     public static int sum(int arr[],int k){
//         int maxSum=Integer.MIN_VALUE;
//        int j=0;
//        int i=0;
//        int total=0;
//        while(j<arr.length){
//        total+=arr[j];
//        if(j-i+1==k){
//         maxSum=Math.max(maxSum,total);
//         total-=arr[i];
//         i++;
//        }
//        j++;
//        }
//         return maxSum==Integer.MIN_VALUE?-1:maxSum;
//     }
//     public static void main(String[] args) {
//         int []arr={1, 12, -5, -6, 50, 3};
//         int k=4;
//         int value=sum(arr,k);
//         System.out.println(value);
//         System.exit(0);
//     }
// }

//Problem:
//Write a recursive function to calculate the sum of digits of a number until the sum becomes a single digit.

// import java.util.Scanner;

// public class Csolution {

//     public static int sum(int num){
//         if(num<10) {
//             return num;

//         }

//         int value=0;
//        while(num!=0){
//         int digit=num%10;
//         value+=digit;
//         num/=10;
//        }
//        //System.out.println(value);
//         return sum(value);
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int value=sum(n);
//         System.out.println(value);
//         System.exit(0);

//     }
// }

// import java.util.Arrays;

// public class Csolution{

//     public static int minimumSum(int []arr1,int []arr2){

//       int n=arr1.length;
//       int i=0;
//       int j=n-1;
//       int ans=0;
//       while(i<n && j>=0){
//       ans+=arr1[i]*arr2[j];
//       i++;
//       j--;
//       }

//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr1[]={4,1,6,2};
//         int arr2[]={7,3,9,5};
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//       int ans=minimumSum(arr1, arr2);
//       System.out.println(ans);

//     }
// }

// public class Csolution {

//   public static int magicalProblem(int arr[][]) {
//     int magical = 0;
//     int row = arr.length;
//     int col = arr[0].length;
//     for (int i = 0; i < row; i++) {
//       int count = 0;
//       for (int j = 0; j < col; j++) {
//         if (arr[i][j] % 2 != 0) {
//           count += arr[i][j];
//         }
//       }
//       if (count % 2 == 0)
//         magical++;
//     }
//     return magical;
//   }

//   public static void main(String[] args) {
//     int arr[][] = {
//         {2, 4},
//        {0, 0},
//         {11, 11}
//     };
//     int ans = magicalProblem(arr);
//     System.out.println(ans);
//   }
// }

// public class Csolution {

//   public static int passwordDistance(String str) {
//     int n = str.length();
//     int i = 0;
//     int j = n - 1;
//     int dist = Integer.MIN_VALUE;
//     if (str.charAt(i) != str.charAt(j)) {
//       dist = Math.max(j - i, dist);
//       return dist;
//     }
//     // Char are same
//     while (i < n && str.charAt(i) == str.charAt(n - 1)) {
//       i++;
//     }
//       if (i < n) {
//         //left se  diff char find 
//         //distance= lastindex-thatindex
//         dist = Math.max((n-1)-i, dist);
//         return dist;
//       }
//     while (j >= 0 && str.charAt(0) == str.charAt(j)) {
//       j--;
//     }
//     if (j >= 0) {
//       //right s diff char find
//       //max distance will be thatindex-0(starting index)
//       dist = Math.max(j-0, dist);
//       return dist;
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     String str = "abc10";
//     int ans = passwordDistance(str);
//     System.out.println(ans);
//   }
// }

// import java.util.*;

// public class Csolution {

//     public static int chocolateProblem(int n) {
//         int total = 0;
//         if (n % 5 == 0) {
//             total += 2;
//         }
//         int i = 1;
//         while (i != n) {
//             if ((i + 1) % 5 == 0) {
//                 total += 2;
//             }
//             total += i;
//             i++;
//         }
//         total += n;
//         return total;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = chocolateProblem(n);
//         System.out.println(ans);
//     }
// }


// public class Csolution {
//     public static String  cryptoGrapher(String str){
//         int n=str.length();
//         String result="";
//         for(int i=0;i<n;i++){
//             if(str.charAt(i)=='a'){
//               result+='z';
//             }
//             else{
//                 int val=str.charAt(i);
//               val=val-1;
//               char ch=(char)val;
//               result+=ch;
//             }
//         }
//         return result;
//     }

//     public static void main(String args[]){
//         String str="bcd";
//         System.out.println(cryptoGrapher(str));
//     }
// }

// import java.util.*;

// public class Csolution{
//     public static int repeating(int []arr){
//       HashMap<Integer,Integer>mp=new LinkedHashMap<>();
//       for(int i=0;i<arr.length;i++){
//         mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
//       }
//       System.out.println(mp);

//        //map traversal
//        for(Map.Entry<Integer,Integer>it:mp.entrySet()){
//         int digit=it.getKey();
//         int val=it.getValue();
//         if(val>1){
//             return digit;
//         }
//        }
//        return -1;
//     }
//     public static void main(String[] args) {
//         int arr[]={10,5,3,4,3,5,6};
//       System.out.println(repeating(arr));
//     }
// }

// import java.util.HashMap;

// public class Csolution {

//      public static int longestUniqueSubstring(String str){
//       int maxLen=0;
//       HashMap<Character,Integer>mp=new HashMap<>();
//      int i=0;
//      int j=0;
//      while(j<str.length()){
//         char ch=str.charAt(j);
//         if(mp.containsKey(ch)){
//             i = Math.max(i, mp.get(ch) + 1);
//             mp.put(ch, j);
//              maxLen=Math.max(maxLen, j-i+1);
//         }
//         else{
//             mp.put(ch, j);
//             maxLen=Math.max(maxLen, j-i+1);
//         }
//         j++;
//      }

//         return maxLen;
//      }

//     public static void main(String args[]){
//         String str="abcabcbb";
//         System.out.println(longestUniqueSubstring(str));
//     }
// }


// import java .util.*;
// public class Csolution{
// public static String printOccurence(String str){
//     StringBuilder ans=new StringBuilder();
//     HashMap<Character,Integer>index=new HashMap<>();
//     for(int i=0;i<str.length();i++){
//         char ch= str.charAt(i);
//         if(!index.containsKey(ch)){
//             index.put(ch,i+1);
//         }
//     }
//     //For each char check its value in map
//     for(int i=0;i<=str.length()-1;i++){
//         char ch= str.charAt(i);
//         int value=index.get(ch);
//         int x=0;
//         while(x<value){
//             ans.append(ch);
//             x++;
//         }
//        if(i!=str.length()-1) ans.append("-");
//     }
//     System.out.println(index);
//     System.out.println(ans.toString());
//     return ans.toString();
// } 

//     public static void main(String args[]){
//        String str="abcaba";
//        String ans=printOccurence(str);

//     }
// }

// public class Csolution {

//     public static void main(String[] args) {
//         int []arr={1,2,2,2};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         int leftSum=0;
//         int rightSum=0;

//         for(int i=0;i<arr.length;i++){
//         leftSum+=arr[i];
//         rightSum=sum-leftSum;
//         //System.out.println(leftSum+" "+rightSum);
//         if(Math.abs(leftSum-rightSum)==1) {
//             System.out.println(i);
//             System.exit(0);
//         }
//     }
// }
// }

import java.util.*;
public class Csolution {
     public static int length(String s1, String s2){
        HashMap<Character,Integer>mp1=new LinkedHashMap<>();
         HashMap<Character,Integer>mp2=new LinkedHashMap<>();
         for(int i=0;i<s1.length();i++){
            Character ch=s1.charAt(i);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
         }
        for(int i=0;i<s2.length();i++){
            Character ch=s2.charAt(i);
          mp2.put(ch, mp2.getOrDefault(ch, 0)+1);
        }
        System.out.println(mp1);
        System.out.println(mp2);
        int answer=0;
        for(Map.Entry<Character,Integer>it:mp1.entrySet()){
            char ch=it.getKey();
            int val=it.getValue();
            if(mp2.containsKey(ch)){
               mp2.put(ch, Math.max(0, mp2.get(ch) - val));
            }
        }
        System.out.println(mp2);
        for(Map.Entry<Character,Integer>it:mp2.entrySet()){
            int val=it.getValue();
         if(val>=0) answer+=val;
        }
        
        return answer;
     }
     public static void main(String ars[]){
        String s1="ABD";
        String s2="AABCCAD";
        int ans= length(s1, s2);
        System.out.println(ans);
     }
}