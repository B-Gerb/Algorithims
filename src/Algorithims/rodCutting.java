package Algorithims;

public class rodCutting {
  public int topDownRodCut(int[] p, int n, int c){
    int[] newValues = new int[n+1];
    return topDownRodCut(p, n, c, newValues);
  }
  public int topDownRodCut(int[] p, int n,int  c, int[] newValues){
    if(newValues[n]> 0) return newValues[n];
    int q;
    if(n==0) q=0;
    else{
      q = -1;
      for (int i = 1; i <= n; i++) {
        if(i==n){
          q = Math.max(q, p[i] + topDownRodCut(p, n-i, c, newValues) );
        }
        else{
          q = Math.max(q, p[i] -c + topDownRodCut(p, n-i, c, newValues) );

        }


      }
    }
    newValues[n] = q;
    return q;
  }
}
