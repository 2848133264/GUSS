package GUI_oop;

/**
	1.����һ�����а��ļ� list.txt
	
	2.�ļ����ݰ���ʱ��%�û���%�ɼ�
	
	2019/06/01 08:01%zhanshang%6
	
	3.����һ�����а����ȡ�ͱ������а���Ϣ
	
	Rank {time,username,score}
	
	4.�����а��ļ�����Ϣ��ȡ��������
	
   list<Rank>
   
	5.�Լ������ݽ�������
	
	6.���ź����������ʾ��������

2019/06/01 08:01%zhanshang%6
2019/06/02 07:11%lisi%16
2019/06/03 09:21%wangwu%60
2019/06/04 10:11%zhangwuji%26
2019/06/05 11:01%zhangshanfeng%36

 * @author Administrator
 *
 */
public class Rank {//�൱һ��ʵ�����͵ġ�
    
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private String time ;
	private String username;
	private int score = 0 ;
	public Rank(String time, String username, int score) {
		super();
		this.time = time;
		this.username = username;
		this.score = score;
	}
	
	
}
