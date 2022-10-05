import java.util.Scanner;

public class PatternExample1 {
    public static class PatternExample {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your length of pattern: ");
            int len= sc.nextInt();
         /* *
            * *
            * * *
            * * * *   */
            // above type of pattern printing example
            for(int i=0;i<len;i++){
                for(int j=0;j<=i;j++){

                    System.out.print("*"+ " ");
                }
                System.out.println();
            }

        }
    }
}
