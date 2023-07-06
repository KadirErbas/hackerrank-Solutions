import java.util.Scanner;


public class Solutions {
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        Solutions.Inner inner = new Solutions.Inner();
        Object o = inner.new Private();
        ((Solutions.Inner.Private) o).powerof2(num1);
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

    }
}