package fc.java.course2.part2;

import java.util.ArrayList;
import java.util.List;

import fc.java.model2.Movie;

public class ArrayListGeneric {
	public static void main(String[] args) {
		List<Movie> list=new ArrayList<>(); // Movie[]
		list.add(new Movie("괴물","봉준호","2006", "한국"));
		//list.add("Hello"); // X -> Movie 타입으로 선언했기 때문에 타입 안전성을 보장 가능
		list.add(new Movie("기생충","봉준호","2019", "한국"));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
