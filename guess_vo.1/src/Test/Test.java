package Test;

public class Test {

	
	
	/**
	 *��ҵ��ϰ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("1.��ӡ1~1000֮�����������ĺ�(ʹ���㷨���뷽ʽʵ��)");
		int sum =0;
		int count= 0;
		
		for(int i=1;i<1000;){
			sum +=i;
			count++;//�������
			i = i+2;
		}
		System.out.println("count:"+count+"   sum="+sum);
		System.out.println("2.��ӡ1~10000֮��������7�ı����������ĸ������ܺͣ�������ü�������˼�룩");
		int seve = 0;
		int sum7 = 0;
		for(int i= 1;i<10000;i++){
			if(i%7==0){
				sum7 +=i;
				seve ++;
			}
		}
		System.out.println("1  -  10000 7����������"+seve+"     �ܺ�Ϊsum="+sum7);
		System.out.println("3.������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾�����磺 153 = 1*1*1 + 3*3*3 + 5*5*5");
		for(int i=1;i<1000;i++){
			check(i);
		}
		
		
	}
     public static void check(int n){
    	 int b = n/100;//��λ
    	 int ss = n/10%10;
    	 int gg = n%10;
    	 if((int) (Math.pow(b, 3)+Math.pow(ss, 3)+Math.pow(gg,3)) == n){
    	    System.out.print(n+"  ");
          }else{
//    	 System.out.println(n+"����ˮ�ɻ���");
          }
     }
 
}
