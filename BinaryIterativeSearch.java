public class BinaryIterativeSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary Iterative Search";
	}

	//Function initializes the middle of array and compares it to the target.
	//If the target is greater than the middle item, the function focuses on the greater half of the array.
	//Otherwise, it will focus on the smaller half. 
	//The process continues until target is found or we run out of elements in the array.
	public int search(int [] arr, int target)
	{
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (start <= end)
		{
			if (arr[mid] == target)
			{
				return mid;
			}
			else if (arr[mid] < target)
			{
				start = mid + 1;
				mid = (start + end)/2;
			}
			else 
			{
				end = mid - 1;
				mid = (start + end)/2;
			}
		}
		return -1;
	}
}