import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main2005 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str =sc.next();
			String date[]=str.split("/");
			int y=Integer.parseInt(date[0]);
			int m=Integer.parseInt(date[1]);
			int d=Integer.parseInt(date[2]);
			int day[] ={0,31,28,31,30,31,30,31,31,30,31,30};
			for(int i=0;i<m;i++) {
				d+=day[i];
			}
			if(((y%4==0&&y%100!=0)||y%400==0)&&m>2 ) {
				d++;
			}
			System.out.println(d);
		}

	}
}
/*while (sc.hasNext()) {
			String b=sc.next();
				SimpleDateFormat a=new SimpleDateFormat("yyyy/MM/dd");
				Date date=a.parse(b);
				SimpleDateFormat c=new SimpleDateFormat("D");
					System.out.println(c.format(date));
		}*/
