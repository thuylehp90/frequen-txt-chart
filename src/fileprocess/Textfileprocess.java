package fileprocess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Textfileprocess  {
	FileInputStream fileinput = null;
	int[] carr = new int[26];
	char[] echarr = {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int c,i;
	//char c;
	public Textfileprocess(FileInputStream f) {
		// TODO Auto-generated constructor stub
		Arrays.fill(carr, 0);
		try {
			CharacterCounter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CharacterCounter(FileInputStream f)throws IOException {
		try {
			fileinput =f;
			while((c=fileinput.read())!= -1){
				for (i=0;i<26;i++) {
					if(c==echarr[i]) {
						carr[i]++;
					}
				}
			}
		} finally {
			// TODO: handle finally clause
			fileinput.close();
		}
	}
	public int[] getfpResult() {
		return carr;
	}
	public char[] getArrChar() {
		return echarr;
	}
	
}
