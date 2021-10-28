import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            
            String user = scan.nextLine();
            user = user.toLowerCase();
            char userchoice = user.charAt(0);
            System.out.println(userchoice);
            
            String userc;
            
            switch(userchoice){
                case 'r':
                    userc = "Rock";
                    break;
                case 'p':
                    userc = "Paper";
                    break;
                case 's':
                    userc = "Scissors";
                    break;
            }
            
            
            
            if (userchoice != 'r' && userchoice != 'p' || userchoice != 's'){
                System.out.println("Break");
                break;
            }
            
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            
            if (computerChoice == userchoice){
                System.out.println("Its a tie, You played "+userc+" And the CPU played " + computerChoice);
            }
            
            else if (userchoice == 'r' && computerChoice == 's' || userchoice == 'p' && computerChoice == 'r' || userchoice == 's' && computerChoice == 'p'){
                System.out.println("You won :D, you played "+userc+" And the CPU played "+computerChoice);
            }
            else{
                System.out.println("You Lost D;, you played "+userc+" And the CPU played "+computerChoice);
            }

            System.out.println("\n\n");
            
            
            
        }while(true);
    }
}
