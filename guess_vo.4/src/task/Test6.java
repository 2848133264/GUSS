package task;

public class Test6 {
	public static void main(String[] args) {
		new Test6(null);
	}

    private Test6(Object o) {
     System.out.println("Object");
    }

    private Test6(double[] doubleArray) {
      System.out.println("Double array");
 	}
    
    //原因： 先走子类，后走父类。
}