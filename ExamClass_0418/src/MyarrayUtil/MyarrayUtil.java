package MyarrayUtil;

// myarrayutil이 상속받음
public class MyarrayUtil extends Myarray {
	//super는 생성자 호출할 때 부모의 생성자를 지정하여 호출하는 것.
	//객체는 반드시 생성자를 호출해야 함, 생성자만 잘 조립하기
	MyarrayUtil() {
		super();
	}
	MyarrayUtil(int length){
		super(length); 
	}
	// 배열의 모든 값의 합을 반환하는 메서드
	// int sum을 밖에 쓰면 계속 누적되기 때문에 안에 쓸 것!
	public int getSum() { // for문 뒤에 return 작성할 것!
		int sum = 0;
		/* 처음에 arr.length에 오류뜨는 이유는 부모클래스에
		 * 접근하려고 했기 때문에 super를 통해 부모클래스 활용
		 */
		for (int i = 0; i < super.getLength(); i++) {
			sum += super.getValue(i);
		}
		return sum;
	}
	
	// 배열에 특정 값이 존재하는지 확인하여 해당 위치를 반환하는 메서드
	public int getloc(int value) {
		for (int i = 0; i < super.getLength(); i++) {
			if (super.getValue(i) == value) {
				return i;
			}
		}
		return -1;
	}
}
