import java.util.Arrays;

public class QuickSort<T extends Comparable> {
    int patition(T[] arr , int low, int high){
        T pivot = arr[high];
        T temp;
        int i = low,j = low-1;
        for ( i= low; i < high+1; i++) {
            if(arr[i].compareTo(pivot) <= 0){
                j++;
                temp = arr[j];
                arr[j] =arr[i];
                arr[i] = temp;
            }
        }
        return j;
    }
    public void sort(T[] arr,int low,int high){
        if(low<high) {
            int pivot = patition(arr, low, high);
            sort(arr,low,pivot-1);
            sort(arr,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {4,5,2,7,9,3,5,3,0};
        new QuickSort<Integer>().sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
