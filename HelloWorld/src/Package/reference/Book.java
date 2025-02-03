package Package.reference;
//<< 도서명, 저자, 출판사, 판매가격 >>
public class Book {
	private String bookName;
	private String bookWriter;
	private String bookCompany;
	private int bookPrice;
	
	Book(String bookName, String bookWriter, String bookCompany, int bookPrice){
		this.bookName = bookName;
		this.bookWriter = bookWriter; 
		this.bookCompany = bookCompany;
		this.bookPrice = bookPrice;
	}
	
	void printInfo() {
		System.out.printf("책제목 : %s 작가 : %s  출판사 : %s  가격 : %s \n", bookName,
				bookWriter, bookCompany, bookPrice);
	}
	
	String showBookInfo(){
		return bookName + "     " + bookWriter + "     " + bookPrice;
	}
	
	void showTatailInfo() {
		// 도셔명 : 출판사 : 
		// 저자 :  가격 : 
		String strFormat = "도셔명 : %10s\t 저자 : %6s\n 출판사 : %10s\t 가격 : %6d";
		System.out.printf("",bookName, bookWriter, bookCompany, bookPrice);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookCompany() {
		return bookCompany;
	}

	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	///////////////////////////////////////
	
	
	
	
	
	
}

