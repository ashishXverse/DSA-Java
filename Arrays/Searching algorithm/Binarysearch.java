public class Binarysearch {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 20, 25};
        int target = 25;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                break;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
    }
}