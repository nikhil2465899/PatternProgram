import java.util.Scanner;

public class PatternExample2 {
    public static void PatternPrint10(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(j==i ||j==len-1){
                    System.out.print("*"+" ");
                }
                else{
                    if(i==i-j){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void PatternPrint9(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==0 || i==len-1){
                    System.out.print("*"+" ");
                }
                else{
                    if(i+j== len-1){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void PatternPrint8(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==0 || i==len-1){
                    System.out.print("*"+" ");
                }
                else{
                    if(j== (len/2)){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void PatternPrint7(int len ){

            int s=len;
            for (int i = 1; i <=s; i++) {
                int total = i > len ? 2 * len - i : i;
                int noWhiteSpace = len - total;
                for (int j = len; j > noWhiteSpace; j--) {
                    System.out.print(" ");
                }
                    for(int m=len;m>=total;m--){
                    System.out.print("*"+" ");

               }

                System.out.println();
            }

    }

    public static void PatternPrint6(int len){
        int s= len*2;
        for(int i=1;i<s;i++){
            int total= i>len? 2*len-i:i;
            int whitespace= len-total;

            for(int j=len;j>=total;j--){
                System.out.print("*"+" ");
            }
            for(int m=1;m<whitespace;m++){
                System.out.print(" ");
            }
            //System.out.print(" ");
            System.out.println();
        }
    }
    public static void PatternPrint5(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            //System.out.print(" ");
        }
    }

    public static void PatterPrint4(int len){
        int s=len;
        for (int i = 0; i < s; i++) {
            int total = i > len ? 2 * len - i : i;
            int noWhiteSpace = len - total;
            for (int j = 0; j < noWhiteSpace; j++) {
                System.out.print( " " );
            }
            for(int m=0;m<=total;m++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void PatternPrint3(int len){
        int s= len*2;
        for(int i=0;i<s;i++){
            int total= i>len? len*2-i:i;
            int whitespace= len-total;
            
            for(int j=0;j<=whitespace;j++){
                System.out.print(" ");
            }
            for(int m=0;m<total;m++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void PatternPrint2(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.print(" "+" ");
        }
    }
    public static void  patterPrint(int len){

        for(int i=0;i<len;i++){
            int nowhitespace= len-i;
            int total= i>len ? 2*len-i:i;
            for(int b=0;b<nowhitespace;b++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<=total;j++){


                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pattern length: ");
        int len = sc.nextInt();

      //  patterPrint(5);
    //  PatternPrint2(len);
       // PatternPrint3(len);
       PatterPrint4(len);
        //PatternPrint6(len);
       // PatternPrint8(len);
        //PatternPrint9(len);
       // PatternPrint10(len);
    }
}