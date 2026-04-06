package construct;

public class Actor {
    String name;
    int age;
    String role;

    Actor(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    Actor(String name, int age) {
        this(name, age, "배역 없음");
    }

    Actor(String name) {
        this(name, 20, "배역없음");
    }
}
