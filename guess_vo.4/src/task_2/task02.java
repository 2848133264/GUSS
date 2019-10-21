package task_2;

import java.io.File;
import java.util.Arrays;

public class task02 {

	public static void main(String[] args) {
		IEmail em = new Email();
		em.setContent("video",3);
		em.setHeader("BASE64");
		em.setSender("LZL");
		em.setReceiver("LzL_R");
		System.out.println(em.toString());;
	}
	
}



interface  IEmail{
	
	void setSender(String sender);
	void setReceiver(String receiver);
	void setContent(Object content,int type);//��װ�����ݣ�object ���ͣ�HTML ��text��������
	void setHeader(String ...header);//������BASE64,������QP������������̶���
}

class Email implements IEmail{

	
	private String sender ; //������
	private String receiver;//������
	private Object obj ;//���͵����ݡ�
	private String[] header ;//��ֵ���ܶ����
	private String result ="";
	@Override
	public void setSender(String sender) {
		// TODO Auto-generated method stub
		this.sender = sender;
	}

	@Override
	public void setReceiver(String receiver) {
		// TODO Auto-generated method stub
		this.receiver = receiver;
	}

	@Override
	public void setContent(Object content,int type) {
		// TODO Auto-generated method stub
		this.obj = content;
		String typename ="";
		if(type == 1){
			typename =  "�ı�����";
		}else if(type == 2){
			typename = "Html��ʽ";
		}
		else if(type == 3){
			typename = "��ý��";
		}else {
			typename = "������ʽ";
		}
		this.result = typename + "���ݣ�"+this.obj;
	}

	@Override
	public void setHeader(String... header) {
		// TODO Auto-generated method stub
		
		this.header = header;
	}

	@Override
	public String toString() {
		return "Email : sender=" + sender + ", receiver : " + receiver + " header="
				+ Arrays.toString(header) + ", result=" + result + "";
	}

	

	
}