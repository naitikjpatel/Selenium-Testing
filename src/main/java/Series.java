
public class Series {

	public static void main(String[] args) {
		int s=7;
		int a=8;
		int i=1;
		int ss=7;							
		while(i<10) {
			if(i==1) {
				System.out.print(s+",");
			}
			else {
				s+=a;
				System.out.print((s)+",");
				a++;
			}
			i++;
		}
	}
}
