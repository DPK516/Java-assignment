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
