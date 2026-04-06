package extend.extend3;

public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println("전기차가 빠르게 이동");
    }
    public void charge() {
        System.out.println("전기를 충전합니다.");
    }
}
