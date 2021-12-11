import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year of birth ");
        int age = 2021 - scan.nextInt();
        System.out.println("You are " + age);
    }
}
