public class DemoApplication {

	public static void main(String[] args) {
		
		Calculate calculate = new Calculate();
		Integer res = calculate.add(1, 3);
		System.out.println(res);
		res = calculate.sub(100, 30);
		System.out.println(res);
		res = calculate.mult(200, 10);
		System.out.println(res);
	}

}

class Calculate {

	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	public Integer sub(Integer a, Integer b) {
		return a-b;
	}
	
	public Integer mult(Integer a, Integer b) {
		return a*b;
	}
	
}

