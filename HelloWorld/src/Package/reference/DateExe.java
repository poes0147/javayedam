package Package.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		//Date 기능.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		System.out.println(sdf.format(now));
		
		try { //예외발생 시 catch구문을 실행하고 정상 종료.
			now =sdf.parse("2024-12-25 12:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(now);
		System.out.println("end of prog");
  	}	
}
