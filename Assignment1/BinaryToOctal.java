//Find the Binary to Octal
package Assignment1;

public class BinaryToOctal {

	int convertBinaryToOctal(int n)	{
		int remainder,octal=0,i=1,j=0;
		int store_arr[]=new int[5];

		while(n!=0)
		{
			remainder=n%10;
			
			octal=octal+remainder*i;
			
			i*=2;
			
			n=n/10;
			
			if(i==8){ i=1; store_arr[j]=octal; j++; octal=0; }
		}
		store_arr[j]=octal;
		i=1;
		octal=0;
		int a=j;
		j=0;
		while(j<=a){
			octal=octal+store_arr[j]*i;
			i*=10;
			j++;
		}
		
		return octal;
	}

}
