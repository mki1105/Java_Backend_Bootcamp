package Examjava2_04;
	
	class TestB{ //test2
		public void method() {
			Test1 ob = new Test1();
			ob.pack = 1;
			ob.pro = 2;
			ob.pub = 3;
			//ob.pri = 4; //접근 불가
		}
	}

	public class Test1 {
		int pack;
		private int pri;
		protected int pro;
		public int pub;
		
		public void method() {
			pack = 1;
			pri = 2;
			pro = 3;
			pub = 4;
		}

}
