package fc.java.model2;

// 잘 설계된 VO, DTO
public class Book {

	// 멤버 변수, 상태 정보, 속성(property)
	private String title;
	private int price;
	private String company;
	private String author;

	// default 생성자
	public Book() {
	}

	// 생성자 메서드의 중복 정의(오버로딩)
	public Book(String title, int price, String company, String author) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.author = author;
	}

	// setter, getter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// toString, Object 클래스의 toSting을 하위 클래스에서 재정의
	@Override
	public String toString() {
		return "Book{" +
			"title='" + title + '\'' +
			", price=" + price +
			", company='" + company + '\'' +
			", author='" + author + '\'' +
			'}';
	}
}
