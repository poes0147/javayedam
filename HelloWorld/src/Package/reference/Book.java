package Package.reference;
//<< ������, ����, ���ǻ�, �ǸŰ��� >>
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
		System.out.printf("å���� : %s �۰� : %s  ���ǻ� : %s  ���� : %s \n", bookName,
				bookWriter, bookCompany, bookPrice);
	}

}
