class unsort_data_find_small
{
	public static void main(String arg[])
	{
		int a[] = new int[]{32,43,53,54,32,65,63,98,43,23};
		int largest = a[0];
		int smaller = a[0];
		//for(int i=1;i<=a.length;i++)
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]>largest)
			{
			largest=a[i];
			}
			else if(a[i]<smaller)
			{
				smaller=a[i];
			}
		}
	System.out.println("Largest number is :" +largest);
	System.out.println(" Smaller number is : "+smaller);
	}
}