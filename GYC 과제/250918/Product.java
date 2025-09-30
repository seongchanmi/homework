package ch5;

public class Product {
	
	private String name;
	private int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/* 🎀
	* toString()메서드는 Object 클래스의 메서드를 재정의하는 것이기 때문에,
	* @Override 어노테이션을 붙여주는 게 좋습니다!
	* 이 어노테이션을 사용하면,
	* 실수로 오타가 났을 때 컴파일 에러로 알려줘서 개발자 입장에서 편하고,
	* 코드를 읽는 사람에게도 의도적으로 오버라이딩한 메서드임을 명확히 알릴 수 있습니다. ㅎㅎ
	* 사소한 부분이지만, 이러한 부분들이 모여서 전체 서비스의 안정성과 가독성을 높여줍니다. 👍
	*/
	// @Override // <- 이거 주석 푸시면 됩니다요
	public String toString() {
		return "상품명: "+name+", 가격: "+price+"원";
	}

}
