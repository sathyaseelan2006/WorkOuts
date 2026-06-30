package Arrays.arrays_2d;

public class FindMaxValue {

    public static int MaxValue(int arr[][]) {
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int MinValue(int arr[][]) {
        int min = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, -1 }
        };
        System.out.println(MaxValue(arr));
        System.out.println(MinValue(arr));
    }
}
