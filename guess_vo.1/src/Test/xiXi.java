package Test;

import java.util.Arrays;

public class xiXi {

	/**
	 * ��Ѫ��������ָλ��Ϊż�������֣�
	 * ������һ��������˶��õ�����������ָ������˻���һ��λ�������֣�
	 * ���д������������ѡȡ�����ֿ�����������
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("4.дһ�������ҳ�4λ����������Ѫ������֡����磺1260=21*60,1827=21*87");
		String[] ar_str1, ar_str2;
        int sum = 0;
        long start =System.nanoTime();
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int i_val = i * j;
                if (i_val < 1000 || i_val > 9999)
                    continue; // ��С��1000�����9999�ų�,������һ�ֻ�
                ar_str1 = String.valueOf(i_val).split(""); //21 * 60 =1260; 0 1 2  6 
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");// 21+60
                Arrays.sort(ar_str1);
                Arrays.sort(ar_str2);
                if (java.util.Arrays.equals(ar_str1, ar_str2)) {
                    // �����Ƚ�,Ϊ�����ҵ�һ��
                    sum++;
                    System.out.println("��" + sum + "��: " + i + "*" + j + "=" + i_val);
                }
            }
        }
        System.out.println(System.nanoTime()-start);
        System.out.println("���ҵ�" + sum + "����Ѫ����");
	}

}
