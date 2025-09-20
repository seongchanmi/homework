package ch5;

public class Car implements Vehicle {

    private int carSpeed = 80;

    public void move() {
        System.out.println("차가 움직입니다.");
    }


    public int getCarSpeed() {
        return carSpeed;
    }


    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }


    public void showCar() {
        System.out.println("차 속도: " + carSpeed);
    }

    @Override
    public void showBicycle() {
        System.out.println("자동차 클래스에 show bicycle");
    }///이거 왜?????? 이거 없으면 자꾸 에러나는 이유 왜??????

    /* 🎀
     * Bicycle, Car 두 클래스 모두 Vehicle 인터페이스를 구현하고 있습니다.
     * 찬미쨩이 이 Vehicle 인터페이스에서 구현체(Bicycle, Car)들이 `move()`, `showCar()`, `showBicycle()`
     * 총 3가지 메서드를 반드시 오버라이딩하도록 정의하셨네요.
     * 그래서 Bicycle, Car 클래스에서 각각 showCar(), showBicycle()을 오버라이딩하지 않으면 컴파일 에러(빨간 줄)가 발생합니다.
     *
     * 하지만 찬미쨩이 의도하신 구조는 Car 클래스는 자동차 정보를 보여주는 역할만, Bicycle 클래스는 자전거 정보를 보여주는 역할만 해야 하는 구조였을 거예요.
     * 아무래도 자전거가 자동차 정보를 보여주거나, 자동차가 자전거 정보를 보여주는 건 어색하죠. 😄
     *
     * 이런 상황은 인터페이스가 너무 많은 책임을 강제하고 있다는 신호입니다!
     * Vehicle 인터페이스가 “차량”이라는 공통점을 표현하려고 만든 것이라면, 정말 공통된 기능만 추상화하는 것이 좋습니다.
     * 제가 아래에 개선 방향 두 가지를 적어 볼게요. 어떤 게 정답인지는 저도 모릅니다!
     * 찬미쨩이 생각하기에 나는 이 방향이 더 맞는 것 같아~하는 쪽으로, 아니면 또 다른 좋은 방안이 있다면 그쪽으로 개선해 보는 게 좋을 것 같아요.
     *
     * 개선안 1) 최소한의 기능만 추상화하기
     * : move()만 추상화하고, showCar()나 showBicycle()처럼 **구체 클래스만이 책임져야 할 메서드**는 각 클래스에 따로 두는 방법입니다.
     *
     * 개선안 2) showCar(), showBicycle()을 showInfo()라는 메서드 하나로 추상화하기
     * : 그럼 아래와 같은 모양이 되겠네요! 메서드명은 임의로 지었으니, 더 멋진 이름이 생각난다면 그걸로 하셔두 됩니다.
     * public interface Vehicle {
     * 	void move();
     * 	void showInfo();
     * }
     * 이제, Bicycle, Car 두 클래스에서 각각 오버라이딩한 뒤, 본인 클래스의 정보를 출력해 주면 됩니다.
     *
     *
     * +) SOLID의 “인터페이스 분리 원칙(ISP)” 키워드를 검색해 보는 것을 추천드립니다.
     * 아직 소화하기엔 벅차겠지만, 이런 키워드가 있구나 하는 것을 아는 것만으로도 추후 학습에 도움이 될 거라 생각합니다.
     * 인터페이스를 배웠으니, 이 키워드의 존재만이라도 알아 두세요!
     */
}
