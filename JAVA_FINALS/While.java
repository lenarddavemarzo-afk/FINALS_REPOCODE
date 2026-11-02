import java.util.Scanner;

class whiles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

         String password = "";
         int attempts = 0;

        while(!password.equals("java123") && attempts <3) {
            System.out.print("Enter password: ");
                password = sc.nextLine();
                attempts++;
        
        }  
        if (password.equals("java123")){
            System.out.println("Access ok");
        }

        else if (attempts == 3){
            System.out.println("Too many attempts!");
        }

            int guess = 37;
            int sauce = 0;
            int attempts1 = 0;
                while (sauce != guess && attempts1 < 3){ {
                    System.out.print("Enter your guess number: ");
                        sauce = sc.nextInt();
                    attempts1++;
                }
                    if (sauce == guess){
                    System.out.println("Correct guess!");
                    } 
                    else if (attempts1 == 3){
                        System.out.println("Too many attempts!");
                    } 
        }    
    }
}  

