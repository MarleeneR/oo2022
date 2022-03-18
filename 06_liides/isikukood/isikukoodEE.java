package isikukood;

public class isikukoodEE implements isikukoodObject{
    String isikukood;
    String[] kuud = {"jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"};
    //39412431256

    public isikukoodEE(String isikukood) {
        this.isikukood = isikukood;
    }

    @Override
    public boolean isMale() {
        return isikukood.startsWith("1") || isikukood.startsWith("3") || isikukood.startsWith("5");
    }

    @Override
    public int getBirthYear() {
        return 1900 + Integer.parseInt(isikukood.substring(1,3));
    }

    @Override
    public String getBirthMonth() {
        return kuud[Integer.parseInt(this.isikukood.substring(3,5))-1];
    }
}
