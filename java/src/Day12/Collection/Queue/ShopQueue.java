package Day12.Collection.Queue;

import java.util.Queue;

/**
 * 큐 자료구조는
 * 실세계에 있는 "줄서기"와 유사하다.
 * 
 * 가게에 방문한 손님들의 웨이팅 관리를 하는 프로그램을 만들어봅니다.
 * 
 */
public class ShopQueue {

	private Queue<String> customerQueue = new LinkedList<String>();
	
	// 손님 대기시키기
	public void wait(String customer) {
		customerQueue.offer(customer);
		System.out.println("대기한 손님: " + customer);
	}
	
	// 손님 입장
	public void serve() {
		if( !customerQueue.isEmpty() ) {
			String servedCustomer = customerQueue.poll();
			System.out.println("입장한 손님 : " + servedCustomer);
		} else {
			System.out.println("대기 중인 고객에 없습니다.");
		}
	}
	// 대기열 확인
	public void showWaitingList() {
		Iterable<String> it = customerQueue.iterator();
		int index = 0;
		while(it.hasNext()) {
			String customer = (String) it.next();
			System.out.println((++index) + ", " + customer);
		}
	}
	public static void main(String[] args) {
	    ShopQueue shopQueue = new ShopQueue();
	    shopQueue.wait("윤홍민");
	    shopQueue.wait("이준영");
	    shopQueue.wait("고건우");
	    
	    shopQueue.showWaitingList();
	    
	    shopQueue.serve();
	    shopQueue.wait("신유식");
	    
	    shopQueue.wait();
	    shopQueue.wait();
	    
	    
	    shopQueue.wait();
	    shopQueue.wait();
	    shopQueue.wait();
	}
}
