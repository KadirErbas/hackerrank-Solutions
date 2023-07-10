import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        myCalculator myCalc= new myCalculator();

        while (input.hasNextInt()) {
            try {
                int n = input.nextInt();
                int p = input.nextInt();
                System.out.println(myCalc.power(n, p));
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class myCalculator{
    long power(int n, int p) throws Exception {
        if (n <0 || p<0){
            throw new Exception("n or p should not be negative.") ;
        } else if (n ==0 && p ==0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) Math.pow(n,p);
    }
}