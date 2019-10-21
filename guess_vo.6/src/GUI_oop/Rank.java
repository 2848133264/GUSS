package GUI_oop;

/**
	1.创建一个排行榜文件 list.txt
	
	2.文件内容包括时间%用户名%成绩
	
	2019/06/01 08:01%zhanshang%6
	
	3.创建一个排行榜类读取和保存排行榜信息
	
	Rank {time,username,score}
	
	4.将排行榜文件的信息读取到集合中
	
   list<Rank>
   
	5.对集合数据进行排序
	
	6.把排好序的数据显示到窗口中

2019/06/01 08:01%zhanshang%6
2019/06/02 07:11%lisi%16
2019/06/03 09:21%wangwu%60
2019/06/04 10:11%zhangwuji%26
2019/06/05 11:01%zhangshanfeng%36

 * @author Administrator
 *
 */
public class Rank {//相当一个实体类型的。
    
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
