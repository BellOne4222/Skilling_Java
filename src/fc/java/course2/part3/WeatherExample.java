package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
	public static void main(String[] args) {
		// OpenWeatherMap API 키
		String apiKey = "a54a36319b90f654c4c8fd41d472693b";

		// 날씨 정보를 요청할 도시
		String city = "Seoul";

		// OpenWeatherMap API에 요청할 URL 생성
		String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

		try {
			// 생성된 URL로 URL 객체 생성
			URL url = new URL(urlString);

			// HttpURLConnection을 사용하여 URL에 연결
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// 요청 메소드를 GET으로 설정
			connection.setRequestMethod("GET");

			// 요청 헤더에 Accept 속성을 설정하여 JSON 응답을 기대함을 표시
			connection.setRequestProperty("Accept", "application/json");

			// HTTP 응답 코드 가져오기
			int responseCode = connection.getResponseCode();

			if (responseCode == 200) {
				// 만약 응답 코드가 200(성공)이라면

				// 입력 스트림 연결
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();

				// 입력 스트림에서 데이터를 읽어와서 content에 추가
				while ((inputLine = in.readLine()) != null) {
					content.append(inputLine);
				}
				in.close();

				// content를 출력
				System.out.println("content.toString() = " + content.toString());

				// JSON 문자열을 JsonObject로 파싱
				JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();

				// JsonObject에서 "main" 속성의 값을 가져옴
				JsonObject mainData = weatherData.getAsJsonObject("main");

				// "temp" 속성의 값을 double로 가져와서 출력
				double temp = mainData.get("temp").getAsDouble();
				System.out.println("temp = " + temp);

				// 연결 종료
				connection.disconnect();
			} else {
				// 응답 코드가 200이 아니면 오류 처리
				// 오류에 대한 처리 로직을 추가할 수 있음
			}
		} catch (Exception e) {
			// 예외 발생 시 에러 메시지 출력
			e.printStackTrace();
		}
	}
}

/*
API Key 및 요청 정보 설정:

OpenWeatherMap에서 발급받은 API 키(apiKey)를 사용합니다.
날씨 정보를 얻고자 하는 도시(city)를 설정합니다.
API 요청을 위한 URL을 구성합니다.
URL 및 연결 객체 생성:

구성된 URL 문자열을 사용하여 URL 객체를 생성합니다.
URL을 통해 HttpURLConnection 객체를 생성하고, 이를 통해 API에 연결합니다.
HTTP 요청 설정:

HttpURLConnection 객체의 setRequestMethod 메서드를 사용하여 HTTP 요청 메서드를 GET으로 설정합니다.
setRequestProperty 메서드를 사용하여 요청 헤더에 "Accept" 속성을 추가하여 JSON 형식의 응답을 기대함을 표시합니다.
HTTP 응답 코드 확인:

getResponseCode 메서드를 사용하여 서버의 응답 코드를 확인합니다.
응답 처리:

응답 코드가 200(성공)인 경우:
BufferedReader를 사용하여 API 응답 스트림을 읽어오고, StringBuffer에 저장합니다.
JSON 형식의 문자열을 JsonParser를 사용하여 JsonObject로 파싱합니다.
	JsonObject에서 "main" 속성을 가진 하위 객체를 추출합니다.
"temp" 속성의 값을 가져와서 출력합니다.
연결 종료:

API와의 연결을 끊습니다.
오류 처리:

응답 코드가 200이 아닌 경우에는 오류 처리 로직을 추가할 수 있습니다.
예외 처리:

코드 실행 도중 예외가 발생하면 catch 블록에서 예외 메시지를 출력합니다.*/
