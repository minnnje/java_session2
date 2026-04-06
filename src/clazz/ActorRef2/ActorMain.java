package clazz.ActorRef2;

public class ActorMain {
    public static void main(String[] args)  {
        Actor actor1 = new Actor();
        Actor actor2 = new Actor();

        actor1.name = "고윤정";
        actor1.age = 29;
        actor1.role = "제인";

        actor2.name = "선민제";
        actor2.age = 24;
        actor2.role = "최우식";

        System.out.println("이름 : " + actor1.name + ", 나이 :" + actor1.age + ", 배역 : " + actor1.role);
        System.out.println("이름 : " + actor2.name + ", 나이 :" + actor2.age + ", 배역 : " + actor2.role);

        System.out.println(actor1);
        System.out.println(actor2);

        Actor[] actors = new Actor[2];
        actors[0] = actor1;
        actors[1] = actor2;
        for (Actor actor : actors) {
            System.out.println("이름 : " + actor.name + ", 나이 : " + actor.age + ", 배역 : " + actor.role);
        }
    }
}
