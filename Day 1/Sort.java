import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        mergeSort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }


    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        else
            return;
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start +1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i =0;i<n1;i++){
            left[i] = arr[start + i];
        }
        for(int j=0;j<n2;j++){
            right[j] = arr[j+mid+1];
        }
        int i=0,j=0,k=start;

        while(i < n1 && j<n2){
            if(left[i] >= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
            while(i < n1){
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j < n2){
                arr[k] = right[j];
                j++;
                k++;
            }

    }
}
