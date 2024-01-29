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
        int i=1;
        int gcd=1;
        while (i<=n1 && i<=n2){
            if (n1%i==0 && n2%i==0){
                if (i>gcd) gcd=i;
            }
            i++;
        }
        System.out.println("Greatest common divisor is : "+gcd);
    }
}


//q4

import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st= sc.next();
        int n=st.length();
        boolean pl=true;
        for (int i=0;i<n;i++){
            if (st.charAt(i)==st.charAt(n-1-i)){
                pl=true;
            }
            else {
                pl=false;
                break;
            }
        }
        if (pl==true) System.out.println("Its a palindrome");
        else System.out.println("Its not a palindrome");

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
