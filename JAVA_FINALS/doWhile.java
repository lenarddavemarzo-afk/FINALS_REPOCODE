import java.util.Scanner;
class DOWhileLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String play;
        do{
            System.out.println("Do you want to play again? (Yes/No)");
            play = input.nextLine();
            play = play.toLowerCase();
        } while(play.equals("yes"));
          System.out.println("Thanks for playing!");
        
    }
}