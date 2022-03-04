public class Auto {
    String mudel;
    String numbrimärk;

    public Auto(String mudel, String numbrimärk){
        this.mudel = mudel;
        this.numbrimärk = numbrimärk;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "mudel='" + mudel + '\'' +
                ", numbrimärk='" + numbrimärk + '\'' +
                '}';
    }
}
