package Algorithims;

public class Stack {
  int[] ar;
  int index =0;
  public Stack(int size){
    ar = new int[size];
  }
  public Stack(){
    ar = new int[2];
  }
  public int getSize(){
    return(ar.length);
  }
  public int pop() throws RuntimeException{
    if(index-1 == -1) throw (new RuntimeException("underflow"));
    return ar[--index];
  }
  public void push(int x) throws RuntimeException{
    if(index == ar.length) {
      if((index)*2>131072) throw (new RuntimeException("overflow"));
      int[] corr = new int[(index)*2];
      for (int i = 0; i < index; ++i) {
        corr[i] = ar[i];
      }
      ar = corr;
    }
    ar[index++]=x;
  }
  public void fullprint(){for(int i =0;i<ar.length; ++i) System.out.println(ar[i]);}


  public int getIndex(){return index;}
}