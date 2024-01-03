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