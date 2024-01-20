package fc.java.model;

public class MovieVO {

	// 1. 모든 생태정보를 정보은닉 하기(private)
	private String title;
	private int day;
	private String major;
	private String part;
	private float time;
	private int level;

	// 2. 디폴트 생성자 만들기
	public MovieVO() {
	}

	// 3. 생성자 메서드를 오버로딩하여 객체 초기화 하기
	public MovieVO(String title, int day, String major, String part, float time, int level) {
		this.title = title;
		this.day = day;
		this.major = major;
		this.part = part;
		this.time = time;
		this.level = level;
	}

	// 4. setter 메서드를 만들기(값을 저장용도)
	// 5. getter 메서드를 만들기(값을 얻기 용도)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// 6. toString()메서드를 만들기(객체가 가지고 있는 전체 값 출력 용도)
	@Override
	public String toString() {
		return "MovieVO{" +
			"title='" + title + '\'' +
			", day=" + day +
			", major='" + major + '\'' +
			", part='" + part + '\'' +
			", time=" + time +
			", level=" + level +
			'}';
	}
}
