package cn.helloThird;

import cn.hello.ExportsOpensTest2;
import cn.helloSecond.HelloWorldSecond;
import cn.hello.ExportsOpensTest1;

public class TransitiveUsedTest {
	
	
	public static void main(String args[]) {
		useExportsOpensTest();
	}
	
	public static void useExportsOpensTest() {
		//使用requires引入的module.helloSecond;
		HelloWorldSecond hws = new HelloWorldSecond();
		hws.print();
		//使用requires引入的module.helloSecond下requires transitive 的module.hello
		ExportsOpensTest1 eot1 = new ExportsOpensTest1();
		//eot1.print();
		
		ExportsOpensTest2 eot2 = new ExportsOpensTest2();
		eot2.print();
	}
}
