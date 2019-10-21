package task;


//定义一个季节枚举,应用抽象方法,输出对应季节的信息
enum reason1{
	spring,
	summer,
	autumn,
	winter	
}
//抽象类
abstract class print_reason{
	
	abstract void spring(reason1 s);
	abstract void summer(reason1 s);
	abstract void autumn(reason1 s);
	abstract void winter(reason1 s);
	
}
public class task04 extends print_reason{

	@Override
	void spring(reason1 s) {
		// TODO Auto-generated method stub
	
		System.out.println(s.spring+" 春天"+","+"春风又绿江南岸");
	}

	@Override
	void summer(reason1 s) {
		// TODO Auto-generated method stub
		System.out.println(s.summer+" 夏天"+","+"映日荷花别样红");
	}

	@Override
	void autumn(reason1 s) {
		// TODO Auto-generated method stub
		System.out.println(s.autumn+" 秋天"+","+"秋水共长天一色");
	}

	@Override
	void winter(reason1 s) {
		// TODO Auto-generated method stub
		System.out.println(s.winter+" 冬天"+","+"窗含西岭千秋雪");
	}
	public static void main(String[] args) {
		
		task04 t = new task04();
		t.spring(reason1.spring);
		t.summer(reason1.summer);
		t.autumn(reason1.autumn);
		t.winter(reason1.winter);
	}

}
