package task01;

public class task03 {

	public static void main(String[] args) {
		 //1.�����洢��һ�����ݵ�����temp
        int k = 2;
        int[] temp = new int[k];//2λ
        //1.1 ��Ϊ��������Ϊ1�����Ը���һ����temp[0]�����һ����temp[k-1]��ֵΪ1
        temp[0] = temp[k - 1] = 1;

        //2.��ӡ�������
        //��ӡ������--�������������rowCount
        int rowCount = 1;
        for (int i = 1; i <= rowCount; i++) {//�ⲿ����
            // �������飬��ȡ��ǰ������
            int[] arr = new int[i];
            // ����ǰ�����鸳ֵ
            for (int j = 0; j < i; j++) {
                // �ȸ���һ�������һ������ֵ
                if (j == 0 || j == i - 1) {
                    arr[j] = 1;
                } else {
                    // �м���Ϊ��һ��б�Խǵ�����֮��
                    arr[j] = temp[j - 1] + temp[j];
                }
            }
            // ����ǰ�и�ֵ��Ϻ���k+1���������鳤�ȣ����ڴ�ȡ��ǰ�е�����
            k++;
            temp = new int[k];
            // ��ӡ��ǰ�����飬������temp��ֵ��������һ��ʹ�õ�ǰ������
            for (int y = 0; y < arr.length; y++) {
                temp[y] = arr[y];
                System.out.print(arr[y] + " ");
            }
            System.out.println();
        }

	}
}
