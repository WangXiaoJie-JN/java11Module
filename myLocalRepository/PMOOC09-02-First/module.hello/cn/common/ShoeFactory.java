package cn.common;

import cn.service.Shoe;
import cn.serviceImpl.Warrior;

public class ShoeFactory {
	
	/**
	 * provides 第二种方法：使用一个拥有public static ,返回值为服务类或者接口，方法名为provider的类作为with（实现类）测试
	 * @return
	 */
	public static Shoe provider() {
		
		Shoe shoe = new Warrior();
		return shoe;
	}

}
