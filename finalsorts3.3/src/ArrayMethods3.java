import java.util.Arrays;

public class ArrayMethods3 {
	
	public static String[] mergeSort(String[] list)
	{
		if (list.length == 1)
		{
			return list;
		}
		else 
		{
			//Arrays.copyofRange() creates copy of list from specified range
			String [] left = Arrays.copyOfRange(list, 0, list.length / 2);
			String [] right = Arrays.copyOfRange(list, list.length / 2, list.length - 1);
			
			return (merge(mergeSort(left), mergeSort(right)));
		}
		
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] finalList = new String[list1.length + list2.length];
		
		int x = 0, 
			y = 0;
		
		while(x < list1.length && y < list2.length)
		{
			
		}
			
			return finalList;
	}
		
	}
	
	public static int partitionSort(int[] list1, int i, int j)
	{
		int pivot = list1[0];
		
		while (i <= j);
		{
			while (list1[i] < pivot)
			{
				i++;
			}
			
			while (list1[j] > pivot)
			{
				j--;
			}
			
			if (list1[i] <= list1[j])
			{
				swapPartition(list1, i, j);
				i++;
				j--;
			}
		}
		
		if (list1[0] < j)
		{
			partitionSort(list1, i, j);
		}
		
		if (list1[list1.length - 1] > i)
		{
			partitionSort(list1, i, j);
		}
		
		return 0;
	}
	
	
	public static void swapPartition(int[]arr, int a, int b)
	{
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
}
