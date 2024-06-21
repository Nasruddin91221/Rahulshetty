
public class MethodsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1= new MethodsDemo2();
		d1.getUserData();
		getData2();
		

	}

	// Why Methods-
	public String getData() {
		System.out.println("Hi World");
		return "Nasruddin";
		
	
	}
	public static String getData2() {
		System.out.println("Hi World This a Programer");
		return "Nasruddin";
		// https://rahulshettyacademy.com/locatorspractice/
	}

}
