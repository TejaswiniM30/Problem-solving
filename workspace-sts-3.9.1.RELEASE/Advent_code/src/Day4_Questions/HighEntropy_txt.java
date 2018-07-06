package Day4_Questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HighEntropy_txt {

	public static void main(String[] args) {
		File inputFile = new File("/Users/tejaswini.m/Documents/parseinput.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		int valid =0;
		String phrase = "";
		try {
			while((phrase=br.readLine())!=null) {
				String[] p = phrase.split(" ");
				boolean flag = true;
			for (int i = 0; i < p.length; i++) {
				int count1 = 1;
				Integer c = count.putIfAbsent(p[i], count1);
				if(c!=null) {
					count.put(p[i], ++count1);
				}
			}
			for(Map.Entry<String, Integer> e : count.entrySet()) {
				if(e.getValue()>1) {
					flag = false;
				}
			}
			
			if(flag){
				valid = valid +1;
			}
			count.clear();
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("No of valid phrases: "+(valid-1));
	}

}
	