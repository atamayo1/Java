package Java.GetterSetter;

public class Main {
    public static void main(String[] args) {
        User user = new User("Anthony", "123456");
        System.out.println(user.getName());
        user.setName("Antho");
        System.out.println(user.getName());
    }
}
