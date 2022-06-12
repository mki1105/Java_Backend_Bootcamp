package Examclass03;

public class TV2 {

		public static void main(String[] args) {
			TV tv1 = new TV();
			tv1.brand = "»ï¼º";
			
			TV tv2 = new TV();
			tv2.brand = "¿¤Áö";
			
			System.out.println(tv1);
			System.out.println(tv2);
			
			tv1.view();
			tv2.view();
			
			tv1.powerOn();
			tv2.view();
			
			tv1.chUp();
			tv2.powerOn();
			
			
			
		}
	}