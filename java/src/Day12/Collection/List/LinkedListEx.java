package Day12.Collection.List;

import java.util.LinkedList;

public class Product {

@Data
@
class Product{
	String name; 	// 상품명
	int price; 		// 가격
	int count; 		// 재고 수
}

public class LinkedListEx{
	

	public static void main(String[] args) {
		// LinkedList 생성 - 재고 목록
		LinkedList<Product> inventoryList = new LinkedList<Product>();
		Product product1 = new Product.ProductBuilder()
									  .name("블루투스 동글")
									  .price(5000)
									  .count(10)
									  .build();
		Product product2 = new Product.ProductBuilder()
										.name("기계식 키보드")
										.price(5000)
										.count(20)
										.build();
		Product product1 = new Product.ProductBuilder()
									.name("미니 선풍기")
									.price(12000)
									.count(50)
									.build();
		inventoryList.add(product1);
		inventoryList.add(product1);
		inventoryList.add(product1);
		
		
		//첫 번째/마지막 요소 가져오기
		Product firstProduct = inventoryList.getFirst();
		Product firstProduct = inventoryList.getFirst();
		System.out.println("첫번째 상품 : " + firstProduct);
		System.out.println("마지막 상품 : " + lastProduct); 

		// 첫번째 / 마지막 요소 제거
		inventroyList.removeFirst();
		inventroyList.removelast();
		
		// 첫번째/ 마지막 요소 추가
		inventoryList.add(new product("모니터"))
	}

}
