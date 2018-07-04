package Day2_Questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Corruption_checksum_2 {

	public static void main(String[] args) {
		String inputFile = "/Users/tejaswini.m/Desktop/input.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		int sum=0;
		
		try {
			br = new BufferedReader(new FileReader(inputFile));
			try {
				while((line = br.readLine()) != null) {
				String[] values	=line.split(csvSplitBy);
				Integer[] arr = Arrays.stream(values).map(Integer::parseInt).toArray(Integer[]::new);
				Arrays.sort(arr, (a,b)->{return b-a;});
				
				
				for(int i=0; i<arr.length-2; i++) {
					for(int y=i+1; y<arr.length; y++) {
					if((arr[i]%arr[y])==0) {
						sum = sum + (arr[i]/arr[y]);
					}
					}
				}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The sum is:"+sum);
		
	}
	
	

}
