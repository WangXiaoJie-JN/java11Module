/**
 * @author admin
 *ʹ��open module +exports ��ʹ��exports +opens
 */
//open module module.hello {
module module.hello {
	
	//���������ʹ��cn.hello���µ��ļ�
	exports cn.hello;
	opens cn.hello;
	//ָ����Щģ�����ʹ��cn.hello���µ�publicԪ��
	//exports cn.hello to module.helloSecond;
	
	//ʹ��provides����ֻ��¶�ӿڣ�����¶ʵ����
	exports cn.service;
	//provides ʵ�����������ʽ��1����public�޲ι��캯����ʵ���࣬2����public static �ӿ�/ʵ���� provider()��������
	//provides cn.service.Shoe with cn.serviceImpl.Warrior;
	provides cn.service.Shoe with cn.common.ShoeFactory;

	
}