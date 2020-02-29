module module.helloSecond {
	//引入module.hello模块
	//requires module.hello;
	exports cn.helloSecond;
	requires transitive module.hello;
	//provides对应提供的接口
	uses cn.service.Shoe;
}