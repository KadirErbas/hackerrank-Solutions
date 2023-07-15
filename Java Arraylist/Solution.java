import java.util.*;

class Solution{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        // Create 2D irregular array
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int num2 = input.nextInt();
            arrayList.add(new ArrayList<>(num2));
            for (int j = 0; j < num2; j++) {
                arrayList.get(i).add(input.nextInt());
            }
        }

        // printing by coordinate
        int num3 = input.nextInt();
        for (int i = 0; i < num3; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            try {
                System.out.println(arrayList.get(x-1).get(y-1).toString());
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }


    }
}

