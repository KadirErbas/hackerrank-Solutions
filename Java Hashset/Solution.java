import java.util.*;

class Solution{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String[] left = new String[num];
        String[] right = new String[num];

        for (int i = 0; i < num; i++) {
            left[i] = input.next();
            right[i] = input.next();
        }
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < num; i++) {
            hashSet.add(left[i]+","+right[i]);
            System.out.println(hashSet.size());
        }



    }
}