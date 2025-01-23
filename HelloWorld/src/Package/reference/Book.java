package Package.reference;
//<< 도서명, 저자, 출판사, 판매가격 >>
public class Book {
	String bookName;
	String bookWriter;
	String bookCompany;
	String bookPrice;
	
	Book(String bookName, String bookWriter, String bookCompany, String bookPrice){
		this.bookName = bookName;
		this.bookWriter = bookWriter; 
		this.bookCompany = bookCompany;
		this.bookPrice = bookPrice;
	}
	
	void printInfo() {
		System.out.printf("책제목 : %s 작가 : %s  출판사 : %s  가격 : %s \n", bookName,
				bookWriter, bookCompany, bookPrice);
	}

}
