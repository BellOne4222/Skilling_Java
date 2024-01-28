package fc.java.course2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExample {
	public static void main(String[] args) {
		String url = "https://sum.su.or.kr:8888/bible/today?base_de=2023-03-20"; // html의 type이 hidden인걸 보고 날짜를 바꾸는 id가 base_de로 설정되있는 것을 확인

		try {
			Document document = Jsoup.connect(url).get(); // url이 정상적이지 않을 수 있으므로 예외처리를 해야함

			Element bibleText = document.getElementById("bible_text");
			Element bibleinfoBox = document.getElementById("bibleinfo_box");

			System.out.println(bibleText.text());
			System.out.println(bibleinfoBox.text());

			Elements num = document.select(".num"); // num앞의 .은 클래스를 나타냄
			Elements info = document.select(".info");

			for (int i = 0; i < num.size(); i++) {
				System.out.println(num.get(i).text() + ":" + info.get(i).text());
			}

			// 여호와의 성민이라
			// 본문 : 신명기(Deuteronomy) 14:1 - 14:21 찬송가 8장
			// 1:너희는 너희 하나님 여호와의 자녀이니 죽은 자를 위하여 자기 몸을 베지 말며 눈썹 사이 이마 위의 털을 밀지 말라
			// 2:너는 네 하나님 여호와의 성민이라 여호와께서 지상 만민 중에서 너를 택하여 자기 기업의 백성으로 삼으셨느니라
			// 3:너는 가증한 것은 무엇이든지 먹지 말라
			// 4:너희가 먹을 만한 짐승은 이러하니 곧 소와 양과 염소와
			// 5:사슴과 노루와 불그스름한 사슴과 산 염소와 볼기가 흰 노루와 뿔이 긴 사슴과 산양들이라
			// 6:짐승 중에 굽이 갈라져 쪽발도 되고 새김질도 하는 모든 것은 너희가 먹을 것이니라
			// 7:다만 새김질을 하거나 굽이 갈라진 짐승 중에도 너희가 먹지 못할 것은 이것이니 곧 낙타와 토끼와 사반, 그것들은 새김질은 하나 굽이 갈라지지 아니하였으니 너희에게 부정하고
			// 8:돼지는 굽은 갈라졌으나 새김질을 못하므로 너희에게 부정하니 너희는 이런 것의 고기를 먹지 말 것이며 그 사체도 만지지 말 것이니라
			// 9:물에 있는 모든 것 중에서 이런 것은 너희가 먹을 것이니 지느러미와 비늘 있는 모든 것은 너희가 먹을 것이요
			// 10:지느러미와 비늘이 없는 모든 것은 너희가 먹지 말지니 이는 너희에게 부정함이니라
			// 11:정한 새는 모두 너희가 먹으려니와
			// 12:이런 것은 먹지 못할지니 곧 독수리와 솔개와 물수리와
			// 13:매와 새매와 매의 종류와
			// 14:까마귀 종류와
			// 15:타조와 타흐마스와 갈매기와 새매 종류와
			// 16:올빼미와 부엉이와 흰 올빼미와
			// 17:당아와 올응과 노자와
			// 18:학과 황새 종류와 대승과 박쥐며
			// 19:또 날기도 하고 기어다니기도 하는 것은 너희에게 부정하니 너희는 먹지 말 것이나
			// 20:정한 새는 모두 너희가 먹을지니라
			// 21:너희는 너희의 하나님 여호와의 성민이라 스스로 죽은 모든 것은 먹지 말 것이나 그것을 성중에 거류하는 객에게 주어 먹게 하거나 이방인에게 파는 것은 가하니라 너는 염소 새끼를 그 어미의 젖에 삶지 말지니라

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
