// Your First Program
import java.util.Scanner;

import Classes.Checker;
class Q2 {
    public static void main(String[] args) {
        /**get password */
       Scanner scan = new Scanner(System.in);

       String password = scan.next();
        scan.close();
        /*create class Checker */
        Checker controller = new Checker();

        /*Check all of coditions to hava a strong password */
        boolean size = controller.sizeCheck(password);
        boolean hasDigit = controller.digitCheck(password);
        /*first position to check lowerCase, second position to check Uppercase*/
        boolean []lowerUpper = new boolean[2];
        lowerUpper= controller.lowerUpperCaseCheck(password);
        boolean specialString = controller.specialCheck(password);
        
        int more_characters = 0;
        if(!size){
            more_characters += (6 - password.length());
        }else{
            if(!hasDigit){
            more_characters += 1;
            }
            if(!lowerUpper[0]){
                more_characters += 1;
            }
            if(!lowerUpper[1]){
                more_characters += 1;
            }
            if(!specialString){
                more_characters += 1;
            }

        }
        
        System.out.print(more_characters);
       
    }
}

