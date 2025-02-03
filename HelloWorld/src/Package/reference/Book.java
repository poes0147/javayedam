package Package.reference;
//<< ������, ����, ���ǻ�, �ǸŰ��� >>
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
		System.out.printf("å���� : %s �۰� : %s  ���ǻ� : %s  ���� : %s \n", bookName,
				bookWriter, bookCompany, bookPrice);
	}
	
	String showBookInfo(){
		return bookName + "     " + bookWriter + "     " + bookPrice;
	}
	
	void showTatailInfo() {
		// ���Ÿ� : ���ǻ� : 
		// ���� :  ���� : 
		String strFormat = "���Ÿ� : %10s\t ���� : %6s\n ���ǻ� : %10s\t ���� : %6d";
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

