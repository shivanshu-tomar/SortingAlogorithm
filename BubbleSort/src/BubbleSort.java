import java.util.Arrays;
//this is Bubble Sort Algo
public class BubbleSort<T extends Comparable> {
    void bubbleSort(T[] arr,int order){
        try {
            if (!(order == 1 || order == -1)) throw new Exception("wrong choice of order");
            T temp;
            int anyswaphappan = 0;   //Flag to check Swap is Happen or not
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (order * (arr[j].compareTo(arr[j + 1])) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        anyswaphappan =1;
                    }
                }
                if(anyswaphappan==0) break;  // if No Swap List is been Sorted
                anyswaphappan = 0;
            }
        }
        catch (Exception e) {
                e.printStackTrace();
            }

    }

    public static void main(String[] args) {
        String[] arr = new String[]{"Satyam","Tomar","Shivanshu","TomarShab"};
        new BubbleSort<>().bubbleSort(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}
