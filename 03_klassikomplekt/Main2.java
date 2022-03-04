public class Main2 {
    public static void main(String[] args) {
        Juht juht = new Juht("Jüri Kask", 56, "36602277542");
        Takso takso = new Takso(juht,"Ford", "hall", "658 GBT");
        Sõit sõit = new Sõit(juht, takso, "Mooni 75", "Mustjõe 26", 5, 4);
        String taksoSõit = sõit.getTaksosoit();
        System.out.println(taksoSõit);
    }
}
