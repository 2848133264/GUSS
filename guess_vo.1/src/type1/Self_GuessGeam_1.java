package type1;

import java.util.Scanner;

public class Self_GuessGeam_1 {

	// ��������
	private static String computer = "����"; // ����
	private static String person = ""; // �û�
	private static int computerScore = 0; // ���Է���
	private static int personScore = 0; // �û�����
	private static int geamCount = 0; // ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ����
		System.out.println("\n-----------��ӭ������Ϸ����--------------\n\n");
		System.out.println("\t****************\n");
		System.out.println("\t** ��ȭ����ʼ   **\n");
		System.out.println("\t****************\n");

		System.out.println("\n��ȭ����1.���� 2.ʯͷ 3.��\n");
		System.out.println("��ѡ�����Ľ�ɫ(1�����޼�  2���Ƿ�  3��С��)��");
		
		// ���������Ϣ������
		Scanner in = new Scanner(System.in);
		int role = in.nextInt();
		int count = 3;// ���λ���
		while (count > 0) {
			if (role == 1) {
				person = "���޼�";
				break;
			} else if (role == 2) {
				person = "�Ƿ�";
				break;
			} else if (role == 3) {
				person = "С��";
				break;
			} else {
				System.out.print("��ʣ��" + count + "����\n" + "����ȷ���룺");
				role = in.nextInt();
				count--;
				if (count == 0) {
					System.out.println("�����������벻��ȷ������Ϸ��������л����ʹ�á�");
					System.out.println("��������");
					System.exit(0);

				}
			}
		}

		System.out.println("��Ҫ��ʼ������ ��y/n��:");
		String con = in.next();
		// System.out.println("���ȭ��1.���� 2.ʯͷ 3.��");
		int perfist;// �û���ȭ
		int comfist;// ���Գ�ȭ
		while (con.equals("y")) {
			// ��ȭ
			perfist = personShowFist();
			comfist = computerShowFist();
			// �ж�ʤ��
			if ((perfist == 1 && comfist == 1) || (perfist == 2 && comfist == 2) || (perfist == 3 && comfist == 3)) {
				System.out.println("������;֣���˧���ٺ٣����ţ�");
			} else if ((perfist == 1 && comfist == 3) || (perfist == 2 && comfist == 1)
					|| (perfist == 3 && comfist == 2)) {
				System.out.println("�������ϲ ��Ӯ�ˣ�");
				personScore++;// �û�����
			} else {
				System.out.println("��������ź� �����ˣ��汿!\n");
				computerScore++;// ����Ӯ��
			}
			geamCount++;// ��Ϸ����
			System.out.println("\n���Ƿ��������һ�ֱ�������y/n��:");
			con = in.next();

		}
		/* ��ʾ��� */
		showResult();
	}

	private static void showResult() {
		System.out.println("-------------------�����ʾ------------------------");
		System.out.println(person + "   VS  " + computer);
		System.out.println("��ս������" + geamCount + "��");
		int result = calcResult();
		if (result == 1) {
			System.out.println("��������ƽ��Ŷ�������ȡ��ʤ���𣿣�");
		} else if (result == 2) {
			System.out.println("�������ϲ��ϲ    սʤ�����ˣ�"); // �û���ʤ
		} else {
			System.out.println("��������� ���������´μ��Ͱ���"); // �������ʤ
		}
		System.out.println("--------------------��Ϸ����-----------------------");

	}

	private static int calcResult() {
		if (personScore == computerScore) {
			return 1;// ƽ��

		} else if (personScore > computerScore) {
			return 2;// �û�Ӯ
		} else {
			return 3;// ����Ӯ
		}
	}

	private static int computerShowFist() {
		// TODO Auto-generated method stub
		int show = (int) (Math.random() * 10) % 3 + 1;// ���������
		switch (show) {
		case 1:
			System.out.println("���Գ�ȭ: ����");
			break;
		case 2:
			System.out.println("���Գ�ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���Գ�ȭ����");
		}
		return show;
	}

	private static int personShowFist() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("\n���ȭ:1.���� 2.ʯͷ 3.�� (������Ӧ����) :");
		int show = in.nextInt();
		switch (show) {
		case 1:
			System.out.println("����ȭ������");
			break;
		case 2:
			System.out.println("����ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("����ȭ����");
		}

		return show;
	}

}
