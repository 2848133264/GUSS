package Test;
class Ticket extends Thread{ // �̳�Thread��
private int ticket = 5 ; // һ��5��Ʊ
public void run(){ // ��дrun()����
for(int i=0;i<100;i++){ // ����Ʊ����ѭ��
if(ticket>0){ // �ж��Ƿ���ʣ��Ʊ
System.out.println("��Ʊ��ticket =" +ticket--);
}
}
}
};
public class ThreadDemo04 {
public static void main(String args[]) {
Ticket mt1 = new Ticket() ; // �����̶߳���
Ticket mt2 = new Ticket() ; // �����̶߳���
Ticket mt3 = new Ticket() ; // �����̶߳���
mt1.start() ; // ������һ���߳�
mt2.start() ; // �����ڶ����߳�
mt3.start() ; // �����������߳�
}
};