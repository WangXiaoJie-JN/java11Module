package cn.helloSecond;

import java.util.ServiceLoader;

import cn.service.Shoe;

public class ProvidesUsesRun {
	
	public static void main(String[] args) {
		
		/**
		 *1. serviceLaoder.load����shoe��ʵ���ࣨwith����ʵ���ࣩ
		 *2.reload()�����������µ�ʵ��
		 */
		ServiceLoader<Shoe> implObjs = ServiceLoader.load(Shoe.class);
		//implObjs.reload(); �����µ�ʵ��
		for(Shoe obj : implObjs) {
			obj.slogon();
		}
	}

}
