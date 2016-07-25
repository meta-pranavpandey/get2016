/**
 * This class will Calculate the ratio on the basis of the option
 * opted by the user
 */

package assignment1;

import java.io.IOException;

public class CalculateRatio {
	private static int[] count;

	/**
	 * 
	 * @param ans will be the answer inputed by the user
	 */
	public void printRatio(String[][] ans){
		String[][] que = null;
		InputFile file = new InputFile();//file is the object of InputFile class
		try {
			que = file.getQueStrings();//stores the questions retrieved from InputFile
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<que.length;i++){
			if(que[i][1].equalsIgnoreCase("single select")){
				int c= que[i][2].split("/").length;
				count = new int[c];
				for(int j=0;j<ans.length;j++){
					int index = Integer.parseInt(ans[j][i]);
					count[index-1]++;
				}
			}
		}
		/*this section evaluates the total Percentage of opted options
		 *  
		 */
		
		
		for(int i=0;i<count.length;i++){
			System.out.println((i+1)+": "+(count[i]*100/ans.length));
		}
	}

}
