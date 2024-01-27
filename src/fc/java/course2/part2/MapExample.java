package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> stdScores = new HashMap<>();
		stdScores.put("Kim", 95); // 정보 추가
		stdScores.put("Lee", 85);
		stdScores.put("Park", 90);
		stdScores.put("Choi", 80);

		System.out.println(stdScores.get("Kim")); // 정보 조회

		stdScores.put("Park", 92); // 정보 수정

		stdScores.remove("Choi"); // 정보 삭제

		for(Map.Entry<String, Integer> entry : stdScores.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
