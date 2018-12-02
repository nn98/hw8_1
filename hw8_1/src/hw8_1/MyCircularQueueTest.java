package hw8_1;

import java.util.Scanner;

// �ּ��� �����̶�� ���ڰ� ���̴� ���� �����Դϴ�

public class MyCircularQueueTest {

	public static void main(String[] args) {
		System.out.println("hw8_1: ������\n");

		MyCircularQueue queue=new MyCircularQueue(5);
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.println("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����");
			t=s.nextInt();
			switch(t) {
			case 1://1 ���ý� ����ڷκ��� �������� �ϳ� �Է¹޾� ���ÿ� ����(push)
				System.out.println("������ ������ �Է�:");
				int p=s.nextInt();
				queue.enQueue(p);
				break;
			case 2://2 ���ý� ���ÿ��� ����(pop)�Ͽ� ���ϵ� ���� ���
				System.out.println("ť Front�� ���� ����: "+queue.deQueue());
				break;
			case 3://3 ���ý� ���ÿ��� ��ȸ(peek)�Ͽ� ���ϵ� ���� ���
				System.out.println("ť Front�� ���� ��ȸ: "+queue.peek());
				break;
			case 4:
				System.out.println("ť�� ����� ���� ��: "+queue.size());
				break;
			case 5:
				int sum=0;
				while(!queue.isEmpty()) {
					sum+=queue.deQueue();
				}
				System.out.println("ť�� ����� ������ �հ�: "+sum);
				break;
			default:
				System.out.println("�Է� ����.");
			}
		}while(t!=6);
		System.out.println("����.");
	}

}