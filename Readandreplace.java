import java.util.Scanner;

public class Readandreplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = "Java";
        
        for(int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'a'){
                System.out.print("_");
            }
            else{
                System.out.print(string.charAt(i));
            }
        }
    }
}
