//q1

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        System.out.println("Enter the last natural number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum natural of number upto "+n+" is : "+sum);
    }
}

//q2

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        System.out.println("Enter the multiplication table number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mult;
        System.out.println("The multiplication table of "+n+" is : ");
        for (int i=1;i<=10;i++){
            mult=i*n;
            System.out.print(mult+" ");
        }

    }
}


//q3


import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i >= 1; i++) {
            int d1 = n1 / i;
            int d2 = n2 / i;
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            if (d1 == 0 || d2 == 0) break;

        }
        System.out.println("The GCD of "+n1+" and "+n2+" is : "+gcd);
    }
}

//q4

import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s= sc.next();
        int n=s.length();
        String ans="Answer";
        for (int i=0;i<n;i++){
            //System.out.println(s.charAt(i));
            if (s.charAt(i)==s.charAt(n-(i+1))){
                ans="This is a palindrome";

            }
            else {
                ans="This is not a palindrome";
            }
        }
        System.out.println(ans);

    }
}

//q5

import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int t1=0;
        int t2=1;
        int sum=0;
        System.out.println("The Fibonacci series upto "+n+ "th term is : ");
        for (int i=1;i<=n;i++){
            System.out.print(sum+" ");
            t1=t2;
            t2=sum;
            sum=t1+t2;

        }

    }
}
