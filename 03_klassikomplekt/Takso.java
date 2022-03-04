public class Takso {
    Juht juht;
    String mudel;
    String värv;
    String numbrimärk;


    public Takso(Juht juht, String mudel, String värv, String numbrimärk) {
        this.juht = juht;
        this.mudel = mudel;
        this.värv = värv;
        this.numbrimärk = numbrimärk;
    }

    @Override
    public String toString() {
        return "Takso{" +
                "juht=" + juht +
                ", mudel='" + mudel + '\'' +
                ", värv='" + värv + '\'' +
                ", numbrimärk='" + numbrimärk + '\'' +
                '}';
    }
}