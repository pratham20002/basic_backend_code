package bubbleSort;
import java.util.*;
public class bubbleSort {

	private int[] arr;
	static Scanner sc = new Scanner(System.in);
	
	public void insert()
	{
		System.out.print("Enter Length for Array: ");
		int len = sc.nextInt();
		arr = new int[len];
		
		System.out.println("Enter ["+len+"] Elements: ");
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}	
	}
	
	public void display()
	{
		int cnt=1;
		System.out.println("\n========== Displaying Array ==========");
		for(int i : arr)
		{
			System.out.println("\n"+cnt+" Element ---------> "+i);
			cnt+=1;
		}
		System.out.println("--------------------------------------\n");
	}
	
	public void Sort_According(String order)
	{
		for(int i=0; i< arr.length-1; i++)
		{
			
			for(int j=0; j<arr.length-i-1; j++)
			
			{
				if(order == "asc")
				{
					Asc(i, j);
				}
				if(order == "desc")
				{
					Desc(i, j);
				}
			}
		}
	}
	
	public void Desc(int i, int j)
	{
		int temp=0;
		if(arr[j] < arr[j+1])
		{
			temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		}
	}
	
	public void Asc(int i, int j)
	{
		int temp=0;
		if(arr[j] > arr[j+1])
		{
			temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		}
	}
	
	public void sort()
	{
		System.out.print("\n======== Sorting Menu ========\n1: In Ascending\n2: In Descending\nEnter Your Choice: \n------------------------------");
		switch(sc.nextInt())
		{
			case 1: Sort_According("asc");
					System.out.println("Array Has Been Sorted in Ascending.....!");
					break;
					
			case 2: Sort_According("desc");
					System.out.println("Array Has Been Sorted in Descending.....!");
					break;
		}	
	}
	
	public static void main(String[] args)
	{
		bubbleSort bs = new bubbleSort();
		while(true)
		{
			System.out.println("\n================ Menu ================");
			System.out.println("1: Insert\n2: Display\n3: Sort\nEnter Your Choice: ");
			System.out.println("--------------------------------------");
			switch(sc.nextInt())
			{
				case 1: bs.insert();
						break;
				
				case 2: bs.display();
						break;
						
				case 3: bs.sort();
						break;
			}
		}	
	}
}
