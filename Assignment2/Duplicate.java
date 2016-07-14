//Remove duplicate elements
package Assignment2;

public class Duplicate {
	int[] removeDuplicate(int input[])	{
		int i,a,j,k,arr_len;
		arr_len=input.length;
		for(i=0;i<arr_len;i++)
		{
			for(j=i+1;j<arr_len;j++)
			{
				if(input[i]==input[j])
				{
					a=j;
					for(k=j+1;k<arr_len;k++,a++)
					{
						input[a]=input[k];
					}
					arr_len--;j--;
				}
			}
		}
		int output[]=new int[arr_len];
		for(i=0;i<arr_len;i++)
			{
			output[i]=input[i];
			System.out.println(output[i]);
			}
	return output;		
	}
}
