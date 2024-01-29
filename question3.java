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
