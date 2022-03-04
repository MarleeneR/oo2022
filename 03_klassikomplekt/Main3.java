public class Main3 {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford Focus", "730 GLP");
        Parkimine parkimine = new Parkimine(auto, 12.30, 14.12, 10.58);
        String autoParkimine = parkimine.getAuto();
        System.out.println(autoParkimine);
    }
}
