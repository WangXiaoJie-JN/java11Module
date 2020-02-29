package cn.helloSecond;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.hello.ExportsOpensTest1;
import cn.hello.ExportsOpensTest2;
import cn.hello.HelloWorld;

public class HelloWorldSecond {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		//ʹ��module.hello���HelloWorld����
		//�����İ����Ʋ�Ҫ��ͬ
	    //module.helloģ����exports,module.helloSecond��requires module����
		//PMOOC09-020Second��Ŀ��add build path�����project���µ�modulepath���PMPOOC09-02-First��Ŀ
		new HelloWorld().print();
		//��requires������modules�ﲻ��pubic���ε� function,���ɷ��� 
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
