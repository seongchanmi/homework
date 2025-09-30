package ch5;

public class PersonMain {

	public static void main(String[] args) {
		Person[] p = new Person[5];
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Person();
		}

		/* 🎀
		* 찬미쨩 역시 똑부러지게 잘 하셨네요!
		* 그런데 만약 찬미쨩의 마을이 재개발되어 인구가 50명으로 늘어난다면…
		* setName(), setAge()를 50번이나 직접 호출해 줘야 하는 아주 무시무시한 일이 발생할 수도 있어요 🫢
		* 이럴 때를 대비해서, 이름과 나이를 배열에 담고 for문으로 초기화해 보는 건 어떨까요?
		* 나중에 시간 있을 때 고민해 주셔도 됩니다 ㅎㅎ
		*/

		/* 🤚
  		* 누나 내 이름은 없네 살짝 서운하네..
		* 나중에 시간되면 확인하고 수정해주면 고맙겠습니다.
		* 전체적으로 잘만드셨네요 칭찬 따봉 드리겠습니다.
		*/
		p[0].setName("성찬미");
		p[0].setAge(27);
		
		p[1].setName("정소영");
		p[1].setAge(26);
		
		p[2].setName("김현정");
		p[2].setAge(25);

		p[3].setName("최정민");
		p[3].setAge(25);
		
		p[4].setName("성지혜");
		p[4].setAge(35);
		
		for(int i=0; i<p.length; i++) {
			p[i].showPerson();
		}
	}


}
 // 누나 내 이름은 없네 살짝 서운하네..
