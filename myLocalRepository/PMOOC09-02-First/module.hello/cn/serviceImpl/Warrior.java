package cn.serviceImpl;

import cn.service.Shoe;

public class Warrior implements Shoe {
	
	private String name;
	
	/**
	 * 服务实现类有public 的无参构造函数
	 */
	public Warrior() {
		
	}
	
	public Warrior(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void slogon() {
		
		System.out.println("回力");

	}

}
