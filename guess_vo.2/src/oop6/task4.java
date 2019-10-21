package oop6;

public class task4 {

	public static void main(String[] args) {
		invoker ii = new invoker();
		Command command =new CommandImpl();
		ii.setCommand(command);
		ii.excute();
	}
	
}
//命令模式。

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
class CommandImpl implements Command{//实现command的接口。

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
	//一个接收的方法。
	void receiver(){
		System.out.println("已接收。。。。");
	}
}