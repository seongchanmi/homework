package hw2;

public class FoodDTO {

	private int num;
	private String name;
	private int amount;
	/* 🎀
	* 자바에 날짜형을 취급하는 자료형이 있다는 거 아시나요?! Date, LocalDate 등등
	* 나중에는 이 자료형도 활용해 보는 것도 좋을 것 같습니다~
	*/
	private String date;
	
	public FoodDTO() {}

	public FoodDTO(int num, String name, int amount, String date) {
		this.num = num;
		this.name = name;
		this.amount = amount;
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "식자재 번호: " + num + ", 식자재명: " + name + ", 수량: " + amount + ", 등록날짜: " + date;
	}
	
	
	
}
