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