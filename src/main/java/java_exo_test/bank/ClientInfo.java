package java_exo_test.bank;

public class ClientInfo {
    private final int age;

    public ClientInfo(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isMajor() {
        return this.age >= 18;
    }
}
