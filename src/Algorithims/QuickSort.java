package Algorithims;

public class QuickSort {
  public static Integer[] quick(Integer[] sort){
    quicksortP(sort, 0, sort.length-1);
    return sort;

  }
  public static void quicksortP(Integer[] sort, int l, int r){
    int j = l;
    int remeber;
    if(r-l<2){
      if(l<r && sort[r] < sort[l]){
        remeber = sort[r];
        sort[r] = sort[j];
        sort[j] = remeber;
      }
      return;
    }

    for(int i=l; i<r; ++i){
      if(sort[i] < sort[r]) {
        remeber = sort[i];
        sort[i] = sort[j];
        sort[j++] = remeber;
      }
    }
    remeber = sort[r];
    sort[r] = sort[j];
    sort[j] = remeber;
    quicksortP(sort, l, j-1);
    quicksortP(sort, j+1, r);
  }
}
