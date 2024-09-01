package view;
import controller.ExQuickController;

public class ExQuick 
{
	 public static void main(String Args[])
	 {
	  ExQuickController quick = new ExQuickController();
	  int[]vet1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
	  int[]vet2 = {44, 43, 42, 41, 40, 39, 38};
	  int[]vet3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
	 
	  int tamanho1 = vet1.length;
	  int tamanho2 = vet2.length;
	  int tamanho3 = vet3.length;
	 
	  System.out.print("Vetor original: {");
	  for( int k : vet1)
	  {
	  tamanho1--;
	   if (tamanho1 > 0)
	    {
	     System.out.print(k + ", ");
	    }
	    else
	     {
	      System.out.print(k + "} ");
	     }
	  }

	   System.out.print("");
	   vet1 = quick.OrdenarQ(vet1);
	   tamanho1 = vet1.length;
	   System.out.print("Vetor ordenado com QuickSort: {");
	   for( int h : vet1)
	   {
	   tamanho1--;
	    if (tamanho1 > 0)
	     {
	      System.out.print(h + ", ");
	     }
	     else
	      {
	       System.out.print(h + "} ");
	      }  
	   }
	   
	   System.out.print("");
	   System.out.print("Vetor original: {");
	   for( int k : vet2)
	   {
	   tamanho2--;
	    if (tamanho2 > 0)
	     {
	      System.out.print(k + ", ");
	     }
	     else
	      {
	       System.out.print(k + "} ");
	      }
	   }
	   
	    System.out.print("");
	    vet2 = quick.OrdenarQ(vet2);
	    tamanho2 = vet2.length;
	    System.out.print("Vetor ordenado com QuickSort: {");
	    for( int h : vet2)
	    {
	    tamanho2--;
	     if (tamanho2 > 0)
	      {
	       System.out.print(h + ", ");
	      }
	      else
	       {
	        System.out.print(h + "} ");
	       }  
	    }

	    System.out.print("");
	    System.out.print("Vetor original: {");
	    for( int k : vet3)
	    {
	    tamanho3--;
	     if (tamanho3 > 0)
	      {
	       System.out.print(k + ", ");
	      }
	      else
	       {
	        System.out.print(k + "} ");
	       }
	    }
	     System.out.print("");
	     vet3 = quick.OrdenarQ(vet3);
	     tamanho3 = vet3.length;
	     System.out.print("Vetor ordenado com QuickSort: {");
	     for( int h : vet3)
	     {
	     tamanho3--;
	      if (tamanho3 > 0)
	       {
	        System.out.print(h + ", ");
	       }
	       else
	        {
	         System.out.print(h + "} ");
	        }  
	     }
	 }
}
