public class App {
    public static void main(String[] args) {
        int array[] = {1, 0, 9, 4, 2, 8, 7, 3, 4};
        quicksort(array,0, array.length - 1);
        System.out.print("\nAfter: ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
    public static void quicksort(int array[], int start, int end) {
        if (start >= end) return; 
        int pivot = hati(array, start, end);
        quicksort(array, start, pivot - 1);
        quicksort(array, pivot + 1, end);
    }
    public static int hati(int array[], int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) { 
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}

