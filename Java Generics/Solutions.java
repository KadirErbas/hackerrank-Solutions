import java.util.Scanner;


public class Solutions {

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        String[] stringArray = { "Hello", "World" };
        printArray(intArray);
        printArray(stringArray);

    }
    public static <T> void printArray(T[] array){
        for (T element:array) {
            System.out.println(element);
        }
    }
}