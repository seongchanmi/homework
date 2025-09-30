package ch5;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle("자바의 정석");
		book.setAuthor("성찬미");
		book.setPrice(20000);
		
		
		TextBook tb = new TextBook();
		tb.setTitle("이것이 자바다");
		tb.setAuthor("신용권");
		tb.setPrice(30000);
		tb.setSubject("IT/자바");
		
		Novel nv = new Novel();
		nv.setTitle("용의자 x의 헌신");
		nv.setAuthor("히가시노 게이고");
		nv.setPrice(18000);
		nv.setGenre("미스테리");
		
		System.out.println("====Book====");
		book.showBook();
		
		System.out.println("====TextBook====");
		tb.showBook();
		tb.showText();
		/* 🎀
		* showBook() 메서드에서 공통 정보(Book 정보)만 출력하고,
		* 각 하위 클래스(TextBook, NovelBook)에서는 showText(), showNovel() 등을 통해 추가 정보를 출력하도록 작성하셨네요! 잘 하셨습니다 ㅎㅎ
		* 그런데, 상속과 다형성의 장점을 더 잘 살려볼 수 있을 것 같아요 😊
		*
		* 예를 들면, showInfo()라는 공통 메서드를 오버라이딩하고, 그 안에서 super.showInfo()로 상위 클래스(=부모 클래스)의 공통 정보를 출력한 뒤,
		* 각 하위 클래스에서 자신의 정보를 덧붙여서 출력해 볼 수 있지 않을까요?!
		* 그러면 여기 코드도 `tb.showBook();tb.showText();` 처럼 여러 메서드를 호출하는 대신,
		* tb.showInfo(); 한 줄로도 충분해질 것 같습니다 😸
		*/
		
		System.out.println("====Novel====");
		nv.showBook();
		nv.showNovel();
		
	
	}
}
