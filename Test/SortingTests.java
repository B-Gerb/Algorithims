import org.junit.Before;
import org.junit.Test;
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
  public void Heap(){
    Heap test = new Heap();
    assertTrue(checkSorted(test.sortHeap(numbers.clone(), numbers.length-1)));
    assertTrue(checkSorted(test.sortHeap(numbers1.clone(), numbers1.length-1)));
    assertTrue(checkSorted(test.sortHeap(numbers2.clone(), numbers2.length-1)));

  }
  @Test
  public void Inserition(){
    Inserition test = new Inserition();
    assertTrue(checkSorted(test.insertSort(numbers.clone())));
    assertTrue(checkSorted(test.insertSort(numbers1.clone())));
    assertTrue(checkSorted(test.insertSort(numbers2.clone())));

  }
  @Test
  public void Merge(){
    Merge test = new Merge();
    assertTrue(checkSorted(test.merge(numbers.clone())));
    assertTrue(checkSorted(test.merge(numbers1.clone())));
    assertTrue(checkSorted(test.merge(numbers2.clone())));

  }
  @Test
  public void QuickSort(){
    QuickSort test = new QuickSort();
    assertTrue(checkSorted(test.quick(numbers.clone())));
    assertTrue(checkSorted(test.quick(numbers1.clone())));
    assertTrue(checkSorted(test.quick(numbers2.clone())));

  }


}