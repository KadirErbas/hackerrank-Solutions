import java.util.InputMismatchException;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = input.nextInt();
            int p = input.nextInt();
            System.out.println(n/p);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println(new InputMismatchException());
        }
    }
}
