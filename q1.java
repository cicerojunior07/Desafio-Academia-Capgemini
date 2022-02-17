// Your First Program
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();
        scan.close();
        int n2 = n-1;
       for(int i = 0 ; i < n ; i++){
           for(int j = 0 ; j < n ; j++){
               if(j >= n2){
                System.out.print('*');
                }else{
                System.out.print(" ");
                }
           }
           System.out.println();
            n2 -= 1;
       }
    }
}