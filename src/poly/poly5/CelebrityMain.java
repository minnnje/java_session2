package poly.poly5;

public class CelebrityMain {
    public static void main(String[] args) {
        Celebrity celebrity1 = new Actor(); // 부모는 자식을 담을 수 있다. (*다형적 참고)
        Celebrity celebrity2 = new Singer(); // 부모는 자식을 담을 수 있다. (*다형적 참고)
        Celebrity celebrity3 = new Youtuber(); // 부모는 자식을 담을 수 있다. (*다형적 참고)
        
        Celebrity[] celebrities = {celebrity1, celebrity2, celebrity3};

        for (Celebrity celebrity : celebrities) {
            celebrity.introduce();
        }
    }
}
