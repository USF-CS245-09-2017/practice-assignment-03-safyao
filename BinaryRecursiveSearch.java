public class BinaryRecursiveSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary Recursive Search";
	}
	
	//Search function initializes start and end, and calls the recursive binsearch function.
	public int search(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length -1;

		return binsearch(arr, target, start, end);
	}

	//Binsearch requires start and end arguments so we can focus on the appropriate subsection of the array for every iteration.
	public int binsearch(int[] arr, int target, int start, int end)
	{
		int mid = (start + end)/2;
		if (start > end)
		{
			return -1;
		}
		else if (arr[mid] == target)
		{
			return mid;
		}
		else if (arr[mid] < target)
		{
			return binsearch(arr, target, mid + 1, end);
		}
		else 
		{
			return binsearch (arr, target, start, mid - 1);
		}
	}
}