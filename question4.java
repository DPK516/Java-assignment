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
