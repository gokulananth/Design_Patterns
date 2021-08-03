package singleton;

public class SingletonClass {
	static SingletonClass obj;
	private SingletonClass() {
		System.out.println("Created");
	}
	
	public static SingletonClass getInstance() {
		if(obj==null) {
			obj= new SingletonClass();
		}
		return obj;
	}
	
	
}
