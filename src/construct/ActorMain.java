package construct;

public class ActorMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor("고윤정", 29, "배우");
        Actor actor2 = new Actor("최우식", 33, "배우");
        Actor actor3 = new Actor("선민제", 25);
        Actor actor4 = new Actor("박지원");

        System.out.println("이름: " + actor1.name + ", 나이: " + actor1.age + ", 배역: " + actor1.role);
        System.out.println("이름: " + actor2.name + ", 나이: " + actor2.age + ", 배역: " + actor2.role);
        System.out.println("이름: " + actor3.name + ", 나이: " + actor3.age + ", 배역: " + actor3.role);
        System.out.println("이름: " + actor4.name + ", 나이: " + actor4.age + ", 배역: " + actor4.role);

    }
}
