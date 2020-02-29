package cn.helloSecond;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.hello.ExportsOpensTest1;
import cn.hello.ExportsOpensTest2;
import cn.hello.HelloWorld;

public class HelloWorldSecond {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		//使用module.hello里的HelloWorld方法
		//两个的包名称不要相同
	    //module.hello模块里exports,module.helloSecond里requires module名称
		//PMOOC09-020Second项目的add build path配置里，project项下的modulepath添加PMPOOC09-02-First项目
		new HelloWorld().print();
		//再requires进来的modules里不是pubic修饰的 function,不可访问 
		//new ExportsOpensTest1().print();
		new ExportsOpensTest2().print();
		try {
			Class clazz = 
					//ExportsOpensTest1.class;
					Class.forName("cn.hello.ExportsOpensTest1");
			Method method = 
					//clazz.getMethod("print",null);
					clazz.getDeclaredMethod("print", null);
			method.setAccessible(true);
			method.invoke(clazz.newInstance(),null);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void print() {
		System.out.print("print function in HelloWorldSecond,module is module.helloThird");
	}

}
