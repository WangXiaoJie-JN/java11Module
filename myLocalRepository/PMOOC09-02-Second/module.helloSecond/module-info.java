module module.helloSecond {
	//����module.helloģ��
	//requires module.hello;
	exports cn.helloSecond;
	requires transitive module.hello;
	//provides��Ӧ�ṩ�Ľӿ�
	uses cn.service.Shoe;
}