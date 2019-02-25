public class LinearSearch implements Practice03Search
{
	public String searchName()
	{
		return "Linear Search";
	}
	
	//Function goes through each element in array, starting at index 0, and compares it to the target.
	public int search(int [] arr, int target)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
}