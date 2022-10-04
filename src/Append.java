import java.util.Scanner;

public class Append {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first name:");
        String first=scan.nextLine();
        System.out.println("Enter the last name:");
        String last=scan.nextLine();
        StringBuffer sb=new StringBuffer();
        String full=sb.append(first+" "+last).toString();
        System.out.println(full);

    }
}
