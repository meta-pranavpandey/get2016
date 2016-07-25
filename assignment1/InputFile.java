/**
 * This class reads the file from the Questions text file and retrieves the valuable
 * data from file for further Implementation
 */

package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	
	public String[][] getQueStrings() throws IOException{
		BufferedReader input = null;
		String[][] ques = null;
		int counter =0;
		try{
			input = new BufferedReader(new FileReader("E:\\Workspace\\Oops-session2\\src\\assignment1\\Question.txt"));
			String characterTemp;
			int i=0;
			while (input.readLine() != null) {
				counter++;
			}
			input.close();
			input = new BufferedReader(new FileReader("E:\\Workspace\\Oops-session2\\src\\assignment1\\Question.txt"));
			ques = new String[counter][];
			while((characterTemp= input.readLine())!=null){
				ques[i++] = characterTemp.split(",");//split will divide the line with the separator "," 
			}
			input.close();
		}catch(Exception e)	{
			System.out.println(e);
		}
		return ques;
	}
}
