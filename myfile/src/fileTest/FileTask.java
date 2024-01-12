package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask {
	public static void main(String[] args) throws IOException {
//		음식을 4개 출력
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//		String[] foods = {"스테이크", "오마카세", "햄버거", "한우"};
//		
//		Arrays.asList(foods).stream().forEach(food -> {
//			try{
//				bufferedWriter.write(food + "\n");
//				bufferedWriter.newLine(); 비추!
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//		bufferedWriter.close();
		
//		음식 모두 가져와서 콘솔에 출력
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
//
//		try {
//			String line = null;
//			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		bufferedReader.close();
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
//		String line = null;
//		String temp = "";
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("스테이크")) {
//				temp += "스파게티\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//		bufferedWriter.write(temp);
//		
//		bufferedWriter.close();
		
//		햄버거 삭제
		BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
		String line = null;
		String temp = "";
		
		while((line = bufferedReader.readLine()) != null) {
			if(line.equals("햄버거")) {
				continue;
			}
			temp += line + "\n";
		}
		bufferedReader.close();
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
		bufferedWriter.write(temp);
		
		bufferedWriter.close();
		
	}
}
