package oop.oop1.oop2;

public class Car {
    private int speed;
    private boolean start;

    public void start() {
        System.out.println("시동 킴");
        start = true;
    }

    public void speedUp() {
        System.out.println("속도 10 증가");
        speed += 10;
    }

    public void speedDown() {
        System.out.println("속도 10 감소");
        speed -= 10;
    }

    public void carStatus() {
        System.out.println("[차 상태]");
        System.out.println("start: " + start);
        System.out.println("speed: " + speed);
    }

    public void stop() {
        System.out.println("시동 끔");
        start = false;
    }
}
