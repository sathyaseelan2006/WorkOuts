package slidingwindow;

public class variablewindow {
    // to find longest maximum sum in a array
    public static void main(String[] args) {

        int k = 3;
        int arr[] = { 1, 2, 3, 4, 5 };
        int left = 0;
        int max = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            max = Math.max(max, right - left + 1);

        }
        System.out.println(max);
        System.out.println(sum);

    }
}