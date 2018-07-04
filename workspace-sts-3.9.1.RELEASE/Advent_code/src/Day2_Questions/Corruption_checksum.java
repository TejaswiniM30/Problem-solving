package Day2_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Corruption_checksum {

	public static void main(String[] args) {
		String inputFile = "/Users/tejaswini.m/Desktop/input.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int sum=0;
		
		try {
			br = new BufferedReader(new FileReader(inputFile));
			try {
				while((line = br.readLine()) != null) {
				String[] values	=line.split(csvSplitBy);
				List<String> row1 = Arrays.asList(values);
		Integer max = row1.stream().mapToInt(Integer::parseInt).max().getAsInt();
		Integer min = row1.stream().mapToInt(Integer::parseInt).min().getAsInt();
		
		sum = sum + (max-min);
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
