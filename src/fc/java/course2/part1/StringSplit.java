package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		String str = "Hello,World,Java";
		String[] strArray = str.split(",");

		for ( String s: strArray){
			System.out.println(s);
		}

		String str1 = "Hello World Java";
		String[] str1Array = str1.split("\\s+");

		for(String s : str1Array){
			System.out.println(s);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str2 = scanner.nextLine();
		String[] str2Array = str2.split("\\s+");
		for(String s : str2Array){
			System.out.println(s);
		}
	}
}
