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
