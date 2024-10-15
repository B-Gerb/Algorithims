package Algorithims;

public class Heap {
  public static Integer[] sortHeap(Integer[] arr, int endLength){
    createHeap(arr);
    for(int i=endLength; i>=0; --i){
      int hold = arr[0];
      arr[0] =  arr[i];
      arr[i] = hold;
      heapFast(arr, 0, i-1);
    }
    return arr;
  }
  public static void createHeap(Integer[] arr){
    for(int i=(int) Math.ceil((arr.length-1) /2.0) -1; i>=0; --i){
      heapFast(arr, i, arr.length-1);
    }
  }
  public static void heapFast(Integer[] arr, int value, int heapsize) {
    while (value <= Math.ceil(heapsize / 2.0) - 1) {
      int largest = value;
      int left = (value + 1) * 2 - 1;
      int right = (value + 1) * 2;
      if (left <= heapsize && arr[left] > arr[largest]) {
        largest = left;
      }
      if (right <= heapsize && arr[right] > arr[largest]) {
        largest = right;
      }
      if (largest != value) {
        int hold = arr[value];
        arr[value] = arr[largest];
        arr[largest] = hold;
        value = largest;
      }
      else{
        value = arr.length;
      }
    }
  }
}
