package Algorithims;

public class fibonacci {
  public int FIB(int n){
    if(n==0) return 0;
    int[] r = new int[n+1];
    r[1] = 1;
    r[2] = 1;
    return FIBREC(r,n);
  }
  public int FIBREC(int[] r, int n){
    if(r[n] >0) return r[n];
    r[n] = FIBREC(r, n-1) + FIBREC(r, n-2);
    return r[n];
  }
}
