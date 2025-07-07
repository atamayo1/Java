package Java.classObject;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Anthony");
        User anotherUser = new User(2, "Susana");

        // toString
        System.out.println(user);
        System.out.println(anotherUser.toString());

        // Equals
        System.out.println(user.equals(anotherUser));

        // HashCode
        System.out.println(user.hashCode());
        System.out.println(anotherUser.hashCode());
    }
}
