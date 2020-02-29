package cn.hello;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("HelloWorld");
		Class<HelloWorld> clazz = HelloWorld.class;
		Module module = clazz.getModule();
		String moduleName = module.getName();
		System.out.println("Module Name is "+moduleName);
	}
	
	public void print() {
		
		System.out.println("Hello Java Module In PMOOC09-020First");
	}
}
