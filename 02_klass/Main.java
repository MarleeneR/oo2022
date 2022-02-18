public class Main {
    public static void main(String[] args) {
        Human one = new Human("Mihkel", 99, 2.22, true);
        Human two = new Human("adas", 4599, 2.4522, true);

        System.out.println(one);
        System.out.println(two);

        one.sayHello();
        two.sayHello();
    }
}
