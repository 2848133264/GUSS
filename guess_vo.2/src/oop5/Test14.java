package oop5;

public class Test14 {
	public static void main(String[] args) {
		Person p = new Person(17);
		p.seeMovie();
	}
}

class Person {
	public Person(int _age) {
		if (_age < 18) {
			throw new RuntimeException("年龄必须大于18岁。");
		}
		/*
		 * 不要再构造方法中添加异常抛出
		 */
	}

	public void seeMovie() {
		System.out.println("看限制级电影");
	}
}