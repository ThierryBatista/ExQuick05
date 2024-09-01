package controller;
import quicksort.batista.QuickSort;

public class ExQuickController
{
 public ExQuickController()
 {
	super(); 
 }

 public int[] OrdenarQ(int[] vet)
 {
	 QuickSort quick = new QuickSort();
	 vet = quick.quick(vet, 0, vet.length - 1);
	 return vet;
 }
}
