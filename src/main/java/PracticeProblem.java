public class PracticeProblem {

	public static void main(String args[]) {

	}	
    public static void stringSwap(String[] arr, int index1, int index2) {
        if (arr == null || index1 < 0 || index2 < 0 
                || index1 >= arr.length || index2 >= arr.length) {
            return; // invalid input, do nothing
        }

        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void reverse(int[] arr) {
        if (arr == null) return;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static String[] toWordArray(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new String[0];
        }
        return input.trim().split("\\s+");
    }
}


