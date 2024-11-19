import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;
import java.util.*;
import Algorithims.*;


public class SortingTests {
  Random rand = new Random(5);
  Integer[] numbers = new Integer[100];
  Integer[] numbers1 = new Integer[100];
  Integer[] numbers2 = new Integer[100];

  public boolean checkSorted(Integer[] list){
    for (int i = 1; i < list.length; i++) {
      if(list[i] < list[i-1]) return false;

    }
    return true;
  }
  @Before
  public void intalize(){
    ArrayList<Integer> numb = new ArrayList<>();
    ArrayList<Integer> numb1 = new ArrayList<>();
    ArrayList<Integer> numb2= new ArrayList<>();

    for(int i = 1; i<= 100; ++i){
      numb.add(i);
      numb1.add(i);
      numb2.add(i);
    }
    Collections.shuffle(numb, rand);
    Collections.shuffle(numb1, rand);
    Collections.shuffle(numb2, rand);
    numbers = numb.toArray(new Integer[0]);
    numbers1 = numb1.toArray(new Integer[0]);
    numbers2 = numb2.toArray(new Integer[0]);

  }
  @Test
  public void rodCut(){
    int[] values = new int[9];
    values[1] = 1;
    values[2] = 5;
    values[3] = 8;
    values[4] = 9;
    values[5] = 10;
    values[6] = 17;
    values[7] = 17;
    values[8] = 20;
    rodCutting cut = new rodCutting();
    assertEquals(cut.topDownRodCut(values, 8,   3), 20  );


  }
  @Test
  public void fib(){

    fibonacci fib = new fibonacci();
    assertEquals(fib.FIB(45), 1134903170 );


  }
  @Test
  public void obst(){
    obst test1 = new obst();
    double[][] data = {
            {-1, .04, .06, .08,.02, .1, .12, .14},
            {.06, .06, .06, .06,.05, .05, .05 ,.05}
    };
    test1.obstCreation(data);
    System.out.printf(test1.toString());

  }

  @Test
  public void Heap(){
    Heap test = new Heap();
    assertTrue(checkSorted(test.sortHeap(numbers, numbers.length-1)));
    assertTrue(checkSorted(test.sortHeap(numbers1, numbers1.length-1)));
    assertTrue(checkSorted(test.sortHeap(numbers2, numbers2.length-1)));

  }
  @Test
  public void Inserition(){
    Inserition test = new Inserition();
    assertTrue(checkSorted(test.insertSort(numbers)));
    assertTrue(checkSorted(test.insertSort(numbers1)));
    assertTrue(checkSorted(test.insertSort(numbers2)));

  }
  @Test
  public void Merge(){
    Merge test = new Merge();
    assertTrue(checkSorted(test.merge(numbers)));
    assertTrue(checkSorted(test.merge(numbers1)));
    assertTrue(checkSorted(test.merge(numbers2)));

  }
  @Test
  public void QuickSort(){
    QuickSort test = new QuickSort();
    assertTrue(checkSorted(test.quick(numbers)));
    assertTrue(checkSorted(test.quick(numbers1)));
    assertTrue(checkSorted(test.quick(numbers2)));

  }


}