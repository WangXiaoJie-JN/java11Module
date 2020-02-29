package cn.helloThird;

import cn.hello.ExportsOpensTest2;
import cn.helloSecond.HelloWorldSecond;
import cn.hello.ExportsOpensTest1;

public class TransitiveUsedTest {
	
	
	public static void main(String args[]) {
		useExportsOpensTest();
	}
	
	public static void useExportsOpensTest() {
		//ʹ��requires�����module.helloSecond;
		HelloWorldSecond hws = new HelloWorldSecond();
		hws.print();
		//ʹ��requires�����module.helloSecond��requires transitive ��module.hello
		ExportsOpensTest1 eot1 = new ExportsOpensTest1();
		//eot1.print();
		
		ExportsOpensTest2 eot2 = new ExportsOpensTest2();
		eot2.print();
	}
}
