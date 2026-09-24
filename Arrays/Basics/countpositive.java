public class countpositive {
    public static void main(String[] args) {

        int[] arr = {10, -5, 7, -2, 0, 8};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                count++;
            }
        }

        System.out.println("Positive numbers = " + count);
    }
}