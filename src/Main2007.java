import java.util.Scanner;

public class Main2007 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
		int start= sc.nextInt();
		int end = sc.nextInt();
		int square=0;
		int cube=0;
		if(start >end) {
			int temp = start;
			start = end;
			end = temp;
		}
		for(;start<=end;start++) {
			if((start&1)==0) {
				square +=Math.pow(start,2);
			}
			else {
				cube +=Math.pow(start,3);
			}
			
		}
		System.out.println(square+" "+ cube);
	}
	sc.close();
	
	}

}
