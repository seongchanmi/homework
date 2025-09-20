package hw1;

import java.util.List;
import java.util.Scanner;

public class AnimalController {

		/* 🎀
		* Scanner의 접근제한자를 default로 설정해 두셨네요! 이유가 무엇인가요?
		* default와 private의 차이는 무엇일까요?!
		*/
		Scanner sc = new Scanner(System.in);
		private AnimalService service;
		
		public AnimalController(AnimalService service) {
			this.service = service;
		}
		
		public void run () {
			while(true) {
				System.out.println("번호 입력: 1-회원 등록 / 2-회원 조회 / 0-프로그램 종료");
				/* 🎀
				* 사소한 부분이지만, 변수명은 해당 값이 어떤 의미를 가지는지 드러나도록 짓는 연습을 해 보면 좋아요!
				* 지금은 간단한 수준의 콘솔 프로그램이지만, 나중에 복잡한 시스템을 개발한다면 그만큼 변수도 많아지기 때문에
				* q, n, m 이렇게 짓다 보면 뭐가 뭔지 구분하기 어려운 상황이 올 수 있어요. 😅
				*
				* int q = sc.nextInt();에서 q는 명령어 값을 입력받고 있으니,
				* command처럼 의도를 쉽게 유추할 수 있는 이름으로 바꿔주면 가독성이 더 좋아질 거예요 ㅎㅎ
				* 제가 지은 변수명이 정답은 아니니 나중에 여유 생기면 한번 생각해 보세요~~
				*/
				int q = sc.nextInt();
				sc.nextLine();
				
				switch (q) {
				/* 🎀
				* case1과 case2의 각 로직들(break; 전까지의 구문들)을 각각 메서드로 분리할 수 있을 것 같아요.
				* 예를 들어 case1의 로직들은 addAnimal()이라든지~ case2의 로직들은 getAllAnimals()라든지~ 이런 식으로요!
				* 메서드 분리 연습 겸 한번 도전해 보시죠 😼
				*/
				case 1:
					System.out.println("아이디: ");
					String id = sc.nextLine();
					System.out.println("보호자명: ");
					String guardian = sc.nextLine();
					System.out.println("반려동물 이름: ");
					String name = sc.nextLine();
					System.out.println("반려동물 나이: ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.println("연락처: ");
					String phone = sc.nextLine();
					
					service.addAnimal(id, guardian, name, age, phone);
					System.out.println("회원 등록 끝");
					break;
				
				case 2:
					List<AnimalDTO> animal = service.getAllAnimal();
					// 🎀 향상된 for문을 잊지 않고 활용해 주신 점 👍
					for(AnimalDTO dto : animal) {
						System.out.println(dto);
					}
					
					break;
					
				case 0:
					System.out.println("프로그램 종료");
					return;

				default:
					System.out.println("숫자만 입력하세요");
					
			}
		}
	}

}
