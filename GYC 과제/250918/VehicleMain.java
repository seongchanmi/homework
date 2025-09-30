package ch5;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Vehicle bicycle1 = new Bicycle();

        car1.move();
        bicycle1.move();

        car1.showCar();
        bicycle1.showBicycle();
    }

    /*
     * 여기서는 반대로 공백을 넣어주는 게 좋습니다.
     * Tab 키 혹은 이클립스의 `ctrl + shift + f` 단축키를 적극 활용해 주세요.
     * 여기서는 제가 전체적으로 공백 및 개행 정리 해 둘게요. 😸
     *
     * 참고로 보통 탭 한 번은 스페이스 4번입니다!
     */
}
