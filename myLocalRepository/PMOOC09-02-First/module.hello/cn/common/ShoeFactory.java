package cn.common;

import cn.service.Shoe;
import cn.serviceImpl.Warrior;

public class ShoeFactory {
	
	/**
	 * provides �ڶ��ַ�����ʹ��һ��ӵ��public static ,����ֵΪ��������߽ӿڣ�������Ϊprovider������Ϊwith��ʵ���ࣩ����
	 * @return
	 */
	public static Shoe provider() {
		
		Shoe shoe = new Warrior();
		return shoe;
	}

}
