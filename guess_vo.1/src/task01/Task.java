package task01;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ϰ1 1. ģ��һ��trim����,ȥ���ַ������˵Ŀո� 2.
		 * ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת�����罫��abcdefg����תΪ��abfedcg�� 3.
		 * ��ȡһ���ַ�������һ���ַ����г��ֵĴ��������磺��ȡ�� ab���ڡ�abkkcadkabkebfkabkskab���г��ֵĴ���
		 */

		 String s1 = "             hello ";
		 String ss = trim(s1);
		 System.out.println("��ϰ1��\nûȥ���ո�֮ǰ��"+s1+"\nȥ���ո��:"+ss);

		// 2. ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת�����罫��ab cdef g����תΪ��ab fedc g��

		String a1 = "abcdefg";
		System.out.println("��ϰ2:\na1֮ǰ��ֵ:"+a1+"\n��cdef��ת���a1:" + Reback(a1, 2, 6));
		// 3.��ȡ�� ab���ڡ�abkkcadkabkebfkabkskab���г��ֵĴ���
		String string = "abkkcadkabkebfkabkskab";// Ԥ�ƽ��Ϊ 4
		String c = "ab";
		System.out.println("��ϰ3��\n"+c + "���ֵĴ���Ϊ��" + count(string, c));// ֻ�ܼ���������
	}
	// 3. ��ȡһ���ַ�������һ���ַ����г��ֵĴ��������磺��ȡ�� ab���ڡ�abkkcadkabkebfkabkskab���г��ֵĴ���
	public static int count(String s, String c) {

		/*
		 * ˼·�ǣ������ǰ��λ����a ������һ���ַ�ҪΪb ��ʵ��count +1
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

	// 2. ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת�����罫��ab cdef g����תΪ��ab fedc g��

	public static String Reback(String ss, int start, int end) {
		// start :��ʾ����Ҫ��ȡ���±�
		// end:��ʾ���ǽ������±�
		// �ж������start��end�ĺϷ���
		String sub;
		String newsub = "";
		if (start > 0 && end > 0 && end < ss.length() && start < (ss.length() - 1)) {
			
			sub = ss.substring(start, end);// ��ȡ��Ҫ��ת���ִ�
			newsub = Change(sub);
			//�����ss.replace()�������ã�Ҫ��ֵ��ԭ�ȵ��ַ���
			ss = ss.replace(sub, newsub);
		} else {
			System.err.println("�����������");
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
	public static String trim(String ss) {// ���������ȥ�����еĿո�

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
