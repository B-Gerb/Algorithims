package Algorithims;

public class Merge {
  public static Integer[] merge(Integer[] toSort){
    merge(0, toSort.length-1, toSort);
    return toSort;
  }
  public static Integer[] merge(int l, int r, Integer[] toSort){
    int value = toSort[l];
    if(r-l < 2){
      if(toSort[l] > toSort[r]){
        toSort[l] = toSort[r];
        toSort[r] = value;
      }
      return toSort;
    }
    else {
      toSort = merge((r+l) / 2 + 1, r, toSort);
      toSort = merge(l, (r+l) / 2, toSort);
    }
    int middle = (r+l)/2+1;
    int[] copy = new int[r-l+1];
    int location =l;
    for(int i=0;i<r-location+1; ++i) {
      if (middle > r) {
        copy[i] = toSort[l++];
      } else {
        if (l > (r + location) / 2) {
          copy[i] = toSort[middle++];
        } else {
          if (toSort[l] > toSort[middle]) {
            copy[i] = toSort[middle++];
          } else {
            copy[i] = toSort[l++];

          }
        }
      }
    }

    int spot = 0;
    for(int i=location; i<=r; ++i) {
      toSort[i] = copy[spot++];
    }
    return toSort;
  }
}
