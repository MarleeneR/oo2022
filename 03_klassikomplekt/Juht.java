public class Juht {
    String nimi;
    int vanus;
    String isikukood;

    public Juht(String nimi, int vanus, String isikukood){
        this.nimi = nimi;
        this.vanus = vanus;
        this.isikukood = isikukood;
    }

    @Override
    public String toString() {
        return "Juht{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", isikukood='" + isikukood + '\'' +
                '}';
    }
}

