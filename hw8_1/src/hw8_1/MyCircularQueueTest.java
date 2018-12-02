package hw8_1;

import java.util.Scanner;

// 주석에 스택이라는 글자가 보이는 것은 착시입니다

public class MyCircularQueueTest {

	public static void main(String[] args) {
		System.out.println("hw8_1: 김윤서\n");

		MyCircularQueue queue=new MyCircularQueue(5);
		Scanner s=new Scanner(System.in);
		int t;
		do {
			System.out.println("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료");
			t=s.nextInt();
			switch(t) {
			case 1://1 선택시 사용자로부터 정수값을 하나 입력받아 스택에 삽입(push)
				System.out.println("삽입할 정수값 입력:");
				int p=s.nextInt();
				queue.enQueue(p);
				break;
			case 2://2 선택시 스택에서 삭제(pop)하여 리턴된 값을 출력
				System.out.println("큐 Front의 정수 삭제: "+queue.deQueue());
				break;
			case 3://3 선택시 스택에서 조회(peek)하여 리턴된 값을 출력
				System.out.println("큐 Front의 정수 조회: "+queue.peek());
				break;
			case 4:
				System.out.println("큐에 저장된 원소 수: "+queue.size());
				break;
			case 5:
				int sum=0;
				while(!queue.isEmpty()) {
					sum+=queue.deQueue();
				}
				System.out.println("큐에 저장된 원소의 합계: "+sum);
				break;
			default:
				System.out.println("입력 오류.");
			}
		}while(t!=6);
		System.out.println("종료.");
	}

}
