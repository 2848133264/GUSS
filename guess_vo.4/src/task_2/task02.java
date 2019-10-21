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
	void setContent(Object content,int type);//封装的内容，object 类型（HTML ，text，流对象）
	void setHeader(String ...header);//可以是BASE64,可能是QP，域的数量不固定。
}

class Email implements IEmail{

	
	private String sender ; //发送者
	private String receiver;//接受者
	private Object obj ;//发送的内容。
	private String[] header ;//传值可能多个，
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
			typename =  "文本类型";
		}else if(type == 2){
			typename = "Html格式";
		}
		else if(type == 3){
			typename = "流媒体";
		}else {
			typename = "其他格式";
		}
		this.result = typename + "内容："+this.obj;
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