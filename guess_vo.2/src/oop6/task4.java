package oop6;

public class task4 {

	public static void main(String[] args) {
		invoker ii = new invoker();
		Command command =new CommandImpl();
		ii.setCommand(command);
		ii.excute();
	}
	
}
//����ģʽ��

class invoker{
	
	private Command command;
	void setCommand(Command command){
		this.command = command;
	}
	void excute(){
		command.execute();
	}
}

interface Command{
	
	void Commend(Receiver receiver);
	void execute();
}
class CommandImpl implements Command{//ʵ��command�Ľӿڡ�

	private Receiver receiver =new Receiver();
	@Override
	public void Commend(Receiver receiver) {
		// TODO Auto-generated method stub
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.receiver();
	}
	
}
class Receiver{
	//һ�����յķ�����
	void receiver(){
		System.out.println("�ѽ��ա�������");
	}
}