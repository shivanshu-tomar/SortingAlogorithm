import java.util.Arrays;

public class MergeSortGeneric<T extends Comparable>{
    void merge(T[] arr,int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high - mid ;      // 0 1 2 3 4 5 6 7
        Object[] templeft  = new Object[n1];
        Object[] tempright = new Object[n2];
        for (int i = 0; i < n1; i++) {
            templeft[i] = arr[low+ i];
        }
        for (int i = 0; i < n2; i++) {
            tempright[i] = arr[mid + i+1];
        }
        int k ,i ,j ;
        k = low;
        for (i=0,j=0; i<n1 && j <n2;k++){
            if( ((T) templeft[i]).compareTo((T) tempright[j])<=0){
                arr[k] = (T) templeft[i++];
            }
            else {
                arr[k] = (T) tempright[j++];
            }
        }
        while(i < n1){
            arr[k++] = (T) templeft[i++];
        }
        while(j < n2){
            arr[k++] = (T) tempright[j++];
        }
    }
    void sort(T[] arr , int low,int high){
        if(low<high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,5,7,9,3,5,4,3,8};
        new MergeSortGeneric<Integer>().sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
