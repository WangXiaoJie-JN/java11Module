module module.helloThird {
	requires module.helloSecond;
	//provides对应提供的接口
	uses cn.service.Shoe;
}