package Test612;

/**

p10��p14��p21��p28��p41��p49��p56��p57��p58
 * @author Administrator
 *
 */
public class Person { // ����Person��
	private String name; // ����name����
	private int age; // ����age����

	public String getName() { // ȡ��name����
		return name;
	}

	public void setName(String name) { // ����name����
		this.name = name;
	}

	public int getAge() { // ȡ��age����
		return age;
	}

	public void setAge(int age) { // ����age����
		this.age = age;
	}

	public String toString() { // ��дtoString()����
		return "������" + this.name + ",���䣺" + this.age;
	}
}