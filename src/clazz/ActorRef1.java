package clazz;

public class
ActorRef1 {
    public static void main(String[] args) {
        String[] actorName = {"구교환", "박정민"};
        int[] actorAge = {40, 35};
        String[] actorRole = {"제인", "고택일"};

        for (int i = 0; i < 2; i++) {
            System.out.println("이름: " + actorName[i] + ", 나이: " + actorAge[i] + ", 배역: " + actorRole[i]);
        }
    }
}
