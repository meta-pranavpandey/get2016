/**
 * This file stores the Output in the file Answer.txt
 */
package assignment1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {
	static private String[][] participants_ans;

	/**
	 * Initializing the participants_ans  
	 * @param no_participants Total participants
	 * @param no_ques Total no. of questions
	 */
	OutputFile(int no_participants, int no_ques) {
		participants_ans = new String[no_participants][no_ques];
	}
	/**
	 * printOutput() will output the results evaluated in the file CalculateRatio.java
	 */
	public void printOutput() {
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter(
							"E:\\Workspace\\Oops-session2\\src\\assignment1\\Answer.txt"));

			for (int i = 0; i < participants_ans.length; i++) {
				out.write("Participant" + (i + 1));
				for (int j = 0; j < participants_ans[i].length; j++) {
					out.write(",");
					out.write(participants_ans[i][j]);
				}
				out.newLine();
			}
			out.close();
			new CalculateRatio().printRatio(participants_ans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void storeOutput(String[] ans, int pariticipant_no, int ques_no) {
		participants_ans[pariticipant_no][ques_no] = ans[ques_no];
	}
}
