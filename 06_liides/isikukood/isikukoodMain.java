package isikukood;

public class isikukoodMain {
    public static void main(String[] args) {
        isikukoodEE ee = new isikukoodEE("39412431256");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthYear());
        System.out.println(ee.getBirthMonth());

        isikukoodEE ee2 = new isikukoodEE("60003431256");
        System.out.println(ee2.isMale());
        System.out.println(ee2.getBirthYear());
        System.out.println(ee2.getBirthMonth());

        isikukoodLV lv = new isikukoodLV("120388-51237");
        System.out.println(lv.isMale());
        System.out.println(lv.getBirthYear());
        System.out.println(lv.getBirthMonth());

        /*isikukoodLV lv2 = new isikukoodLV("60003431256");
        System.out.println(lv2.isMale());
        System.out.println(lv2.getBirthYear());
        System.out.println(lv2.getBirthMonth());*/
    }
}
