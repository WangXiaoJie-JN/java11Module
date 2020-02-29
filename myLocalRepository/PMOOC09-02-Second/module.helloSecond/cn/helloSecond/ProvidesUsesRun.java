package cn.helloSecond;

import java.util.ServiceLoader;

import cn.service.Shoe;

public class ProvidesUsesRun {
	
	public static void main(String[] args) {
		
		/**
		 *1. serviceLaoder.load加载shoe的实现类（with出的实现类）
		 *2.reload()，方法产生新的实例
		 */
		ServiceLoader<Shoe> implObjs = ServiceLoader.load(Shoe.class);
		//implObjs.reload(); 产生新的实例
		for(Shoe obj : implObjs) {
			obj.slogon();
		}
	}

}
