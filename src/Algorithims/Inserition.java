package Algorithims;

public class Inserition {
  public static Integer[] insertSort(Integer[] toSort){
    for (int i = 1; i < toSort.length; i++) {
      int key = toSort[i];
      int j;
      for(j = i-1; j>0 && toSort[j] >key; --j){
        toSort[j+1] = toSort[j];

      }
      toSort[j] = key;
    }
    return toSort;
  }
}
