package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamTask {
	
	public boolean checkOdd(int number) {
		return number % 2 != 0;
	}
	
	public static void main(String[] args) {
		StreamTask streamTask = new StreamTask();
//		1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
		
//		ABCDEF를 각 문자별로 출력
//		"ABCDEF".chars().forEach(c -> System.out.println((char)c));
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(datas::add);
//		IntStream.range(0, 50).map(data -> data * 2 + 1).forEach(datas::add);
//		System.out.println(datas);
		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Character> chars = new ArrayList<Character>();
//		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1 : c).forEach(c -> chars.add((char)c));
//		System.out.println(chars);
		
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream()
//			.filter(data -> data.charAt(0) >= 'A')
//				.filter(data -> data.charAt(0) <= 'Z')
//					.forEach(System.out::println);
		
//		한글을 정수로 변경
//		String hangle = "공일이삼사오육칠팔구";
//		String data = "일공이사";
//		
//		data.chars().map(hangle::indexOf).forEach(System.out::print);
		
//		정수를 한글로 변경
		String hangle = "공일이삼사오육칠팔구";
		String data = "1024";
		
		data.chars().map(c -> c - 48).forEach(i -> System.out.println(hangle.charAt(i)));
	}
}
