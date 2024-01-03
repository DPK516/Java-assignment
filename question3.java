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
