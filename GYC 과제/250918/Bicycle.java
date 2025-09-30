package ch5;

public class Bicycle implements Vehicle {

    private int bicycleSpeed = 20;

    public void move() {
        System.out.println("자전거가 움직입니다.");
    }

    public int getBicycleSpeed() {
        return bicycleSpeed;
    }

    public void setBicycleSpeed(int bicycleSpeed) {
        this.bicycleSpeed = bicycleSpeed;
    }


    public void showBicycle() {
        System.out.println("자전거 속도: " + bicycleSpeed);
    }

    @Override
    public void showCar() {
        System.out.println("자전거 클래스에 show car");
    } ///이거 왜?????? 이거 없으면 자꾸 에러나는 이유 왜??????

    /* 🎀
     * 불필요한 공백은 제거해 두는 게 좋습니다! (일단 제가 지워 둘게요 ㅎㅎ)
     * 그래야 코드를 읽는 제3자의 입장에서 좋답니다😸
     *
     * 이보다 조오금 더 심화된 내용이지만, 팀원이 읽었을 때 보기 좋은 코드를 작성하는 것을 연습해 보면 좋아요.
     * 이를 위해 “클린 코드”라는 키워드가 있는데, 나아중에 욕심이 생긴다면 검색해 보거나 관련 책을 읽어보면서 체득해 두면 좋습니다👍
     * */

}
