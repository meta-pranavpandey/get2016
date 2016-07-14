//Find the Longest Sequence
package Assignment3;

public class LongestSequence {
	public int[] longestSequence(int input[]){
		int[] startPosition = new int[30];
		int[] endPosition = new int[30];
		int[] posDifference = new int[30];
		int j=0;
		int input_len = input.length;
		startPosition[0] = 0;
		for(int in=0;in<input_len-1;in++){
			if(input[in]>input[in+1]){
				endPosition[j]=in;
				posDifference[j]= endPosition[j]-startPosition[j];
				startPosition[j+1]=in+1;
				j++;
			}
		}
		endPosition[j] = input_len;
		posDifference[j] = endPosition[j]-startPosition[j];
		
		int maxPosition = 0;
		for(int i=1;i<=j;i++){
			if(posDifference[maxPosition]<posDifference[i]){
				maxPosition = i;
			}
		}
		int[] output =new int[posDifference[maxPosition]];
		for(int i=0;i<posDifference[maxPosition];i++){
			output[i] = input[startPosition[maxPosition]+i];
		}
		return output;
	}
	
}
