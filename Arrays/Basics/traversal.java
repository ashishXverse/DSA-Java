public class traversal {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40};

        // scores.length tells you how many boxes exist (here, 4)
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Box " + i + " contains: " + scores[i]);
        }
    }
}

