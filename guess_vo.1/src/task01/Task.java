package task01;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 课堂练习1 1. 模拟一个trim方法,去除字符串两端的空格。 2.
		 * 将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg” 3.
		 * 获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在“abkkcadkabkebfkabkskab”中出现的次数
		 */

		 String s1 = "             hello ";
		 String ss = trim(s1);
		 System.out.println("练习1：\n没去除空格之前："+s1+"\n去除空格后:"+ss);

		// 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如将“ab cdef g”反转为”ab fedc g”

		String a1 = "abcdefg";
		System.out.println("练习2:\na1之前的值:"+a1+"\n把cdef反转后的a1:" + Reback(a1, 2, 6));
		// 3.获取“ ab”在“abkkcadkabkebfkabkskab”中出现的次数
		String string = "abkkcadkabkebfkabkskab";// 预计结果为 4
		String c = "ab";
		System.out.println("练习3：\n"+c + "出现的次数为：" + count(string, c));// 只能计算两个的
	}
	// 3. 获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在“abkkcadkabkebfkabkskab”中出现的次数
	public static int count(String s, String c) {

		/*
		 * 思路是：如果当前的位置是a 并且下一个字符要为b 就实现count +1
		 */
		int count = 0;
		char[] cc = s.toCharArray();
		char[] cs = c.toCharArray();
		for (int i = 0; i < cc.length; i++) {
			if (cc[i] == cs[0] && cc[i + 1] == cs[1]) {
				count = count + 1;
			}
		}
		return count;
	}

	// 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如将“ab cdef g”反转为”ab fedc g”

	public static String Reback(String ss, int start, int end) {
		// start :表示的是要截取的下标
		// end:表示的是结束的下标
		// 判断输入的start和end的合法性
		String sub;
		String newsub = "";
		if (start > 0 && end > 0 && end < ss.length() && start < (ss.length() - 1)) {
			
			sub = ss.substring(start, end);// 获取到要反转的字串
			newsub = Change(sub);
			//这里的ss.replace()方法调用，要赋值到原先的字符串
			ss = ss.replace(sub, newsub);
		} else {
			System.err.println("参数输入错误");
		}
		return ss;
	}

	public static String Change(String ss) {
		char[] cc = ss.toCharArray();
		char[] re = new char[cc.length];
		for (int i = 0; i < cc.length; i++) {
			re[re.length - i - 1] = cc[i];
		}
		return new String(re);
	}

	@SuppressWarnings("null")
	public static String trim(String ss) {// 这个方法会去除所有的空格

		char[] c = ss.toCharArray();
		//System.out.println(c.length);// 9
		char[] copyc = new char[c.length];
		for (int i = 0, j = 0; i < c.length - 1;) {
			if (c[i] == ' ') {
				i++;			
			} else {
				copyc[j] = c[i];
				i++;
				j++;
			}
		}
		return new String(copyc);
	}
}
