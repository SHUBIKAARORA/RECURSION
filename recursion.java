import java.util.Scanner;

public class recursion{
 static int n1=0,n2=1,n3=0;
 static int rev(int n,int temp){
    if (n==0){return temp;}
    temp=(temp*10)+(n%10);
    return rev(n/10,temp);
  }

 static void palindrome(int n){
  int temp=rev(n,0);
  if (temp==n){
   System.out.println("IT IS A PALINDROME");
  }
  else{
   System.out.println("IT IS NOT A PALINDROME");
  }
 }

 static int calculate(int n,int temp){
  int d=0;
  if (n==0){return temp;}
  d=n%10;
  temp=temp+(d*d*d);
  return calculate(n/10,temp);
 }

 static void armstrong(int num){
  int result=calculate(num,0);
  if (result==num){
   System.out.println("IT IS AN ARMSTRONG NUMBER");
  }
  else{
   System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
  }
 }
 
 static int factorial(int n){
  if (n==0){
    return 1;}
  else{
   return n*factorial(n-1);
  }
 }
 static void fibonacci(int n){
  if (n>0){
   n3=n1+n2;
   n1=n2;
   n2=n3;
   System.out.print(n3+"\t");
   fibonacci(n-1);
  }
 }

 public static void main(String args[]){
  int choice,num;
  Scanner sc=new Scanner(System.in);
  System.out.println("RECURSION PROGRAMMING\n");
  System.out.println("1.PALINDROME\n2.ARMSTRONG\n3.FACTORIAL\n4.FIBONACCI SERIES\n5.EXIT\n");
  choice=sc.nextInt();
  switch(choice){
   case 1:
      System.out.println("Enter the number to be checked:");
      num=sc.nextInt();
      palindrome(num);
      break;
   case 2:
      System.out.println("Enter the number to be checked:");
      num=sc.nextInt();
      armstrong(num);
      break;
   case 3:
      System.out.println("Enter the number");
      num=sc.nextInt();
      int result=factorial(num);
      System.out.println("THE FACTORAL IS:");
      System.out.println(result);
      break;
   case 4:
     System.out.println("Enter number of terms:");
     num=sc.nextInt();
     System.out.print(0+"\t"+1+"\t");
     fibonacci(num-2);
     break;
   case 5:
     break;
   }
 }
}