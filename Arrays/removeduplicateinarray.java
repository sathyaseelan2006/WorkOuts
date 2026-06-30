package Arrays;

////////////////////////////////////WORKS ONLY FOR SORTED ARRAY//////////////////////////////////////////////////////
public class removeduplicateinarray {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, };
        int j = 0;

        if (arr.length == 0) {
            System.out.println("-1");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];

            }

        }
        int k = j + 1;
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("No of unique element in the array is: ");
        System.out.println(k);

    }
}
