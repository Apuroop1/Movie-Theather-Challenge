package challenge.TheaterSeating.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FileProcessor {
	String filename;
	int numberOfLines;

	public FileProcessor(String input) {
		filename = input;
		numberOfLines = 0;

	}

	public void writeToFile(LinkedHashMap<String, ArrayList<String>> hm) {
		BufferedWriter wr = null;
		try {
			wr = new BufferedWriter(new FileWriter("D:\\Walamart-Assesment\\Movie-Theater-Seating\\output.txt"));
			Iterator<Entry<String, ArrayList<String>>> itr = hm.entrySet()
					.iterator();
			while (itr.hasNext()) {
				Entry<String, ArrayList<String>> pairs = itr.next();
				String str = pairs.getKey() + " " + pairs.getValue();
				System.out.print(str + "\n");
				wr.write(str + "\n");
			}
			wr.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(hm);
	}
}
