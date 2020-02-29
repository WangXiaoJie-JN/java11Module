/**
 * @author admin
 *使用open module +exports 或使用exports +opens
 */
//open module module.hello {
module module.hello {
	
	//输出给别人使用cn.hello包下的文件
	exports cn.hello;
	opens cn.hello;
	//指定哪些模块可以使用cn.hello包下的public元素
	//exports cn.hello to module.helloSecond;
	
	//使用provides对外只暴露接口，不暴露实现类
	exports cn.service;
	//provides 实现类的两种形式。1：有public无参构造函数的实现类，2：有public static 接口/实现类 provider()方法的类
	//provides cn.service.Shoe with cn.serviceImpl.Warrior;
	provides cn.service.Shoe with cn.common.ShoeFactory;

	
}