public class Main2 {
    public static void main(String[] args) {
        Koer one = new Koer("Loki", "Taksikoer", "keskmine", 4, 12.7);
        Koer two = new Koer("Lontu", "Šoti terjer", "väike", 2, 8.6);
        Koer tree = new Koer("Muki", "Puudel", "väike", 5, 9.2);

        System.out.println(one);
        System.out.println(two);
        System.out.println(tree);

        one.sayHello();
        two.sayHello();
        tree.sayHello();

        one.toidukogus();
        two.toidukogus();
        tree.toidukogus();
    }
}
