package task;

public class Test10 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		
//		if(s.append("there").equals("False")){
//			System.out.println("yes");
//		}else{
//			System.out.println("不相等");
//		}
		
		
		if ((s.length() > 5) && (s.append("there").equals("False"))){
			System.out.println("yes");
			
			/*
			 * s 的长度为 5 ，所以前者是false ，后面  也是     false    
			 * 
			 * false  && false  等于   false  ？？？？
			 */			
		}
		else {
			System.out.println("no");
			System.out.println(s.length());
		}
		System.out.println("value is " + s);
		
		// 结果： && 操作  的规则是：如果前者是false 则在之后的判断就不会执行。
	}
}