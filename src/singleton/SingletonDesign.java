package singleton;

public class SingletonDesign {
	public static void main(String args[]) {
		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		if(obj==obj2) {
			System.out.println("true");
		}
		
		System.out.println(obj);
		System.out.println(obj2);
		}
}
