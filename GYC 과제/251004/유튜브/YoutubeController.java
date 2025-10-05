package ch1;

import java.util.List;
import java.util.Scanner;

public class YoutubeController {

	Scanner sc = new Scanner(System.in);
	private YoutubeService service = new YoutubeService();

	public void run() {
		while (true) {
			System.out.println("1. 등록 | 2. 전체조회 | 3. 개별조회 | 4. 수정 | 5. 삭제 | 0. 종료");

			int q = sc.nextInt();

			switch (q) {
			case 1:
				addYoutube();
				break;
			case 2:
				allYoutube();
				break;
			case 3:
				getById();
				break;
			case 4:
				updateYoutube();
				break;
			case 5:
				deleteYoutube();
				break;
			case 0:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

	private void addYoutube() {
	
		
	}

	private void allYoutube() {
		List<YoutubeDTO> list = service.getAllYoutube();
		outYoutubeList(list);
	}

	private void outYoutubeList(List<YoutubeDTO> list) {
		// null: 객체 자체가 없는 경우, .isEmpty() : 객체는 있으나 데이터가 0
		if(list == null || list.isEmpty()) { // null 체크 후 empty 체크
			System.out.println("맛집 내용 없음");
		} else {
			for (YoutubeDTO dto : list) {
				System.out.println(dto);
			}
		}
		
	}

	private void getById() {
		
	}

	private void updateYoutube() {
		
	}

	private void deleteYoutube() {
		
	}

}
