import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Give a number =");
        int number = input.nextInt();
        double result =0;


        for (double i=1; i<=number ; i++){
            result += (1/i);
        }
        System.out.println("Harmonik number =" +result);
    }
}
