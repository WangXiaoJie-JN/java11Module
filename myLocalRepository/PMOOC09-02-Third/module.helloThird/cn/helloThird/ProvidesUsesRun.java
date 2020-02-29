package cn.helloThird;

import java.util.ServiceLoader;

import cn.service.Shoe;

public class ProvidesUsesRun {
	
	public static void main(String[] args) {
		
		/**
		 * serviceLaoder.load加载shoe的实现类（with出的实现类）
		 */
		ServiceLoader<Shoe> implObjs = ServiceLoader.load(Shoe.class);
		for(Shoe obj : implObjs) {
			obj.slogon();
		}
	}

}
