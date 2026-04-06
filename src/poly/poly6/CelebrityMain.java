package poly.poly6;

public class CelebrityMain {
    public static void main(String[] args) {
        Celebrity celebrity1 = new Actor(); //다형적 참조
        Celebrity celebrity2 = new Singer(); //다형적 참조
        Celebrity celebrity3 = new Youtuber(); //다형적 참조

        Celebrity[] celebrities = {celebrity1, celebrity2, celebrity3};

        for (Celebrity celebrity : celebrities) {
            celebrity.introduce();
        }
    }
}