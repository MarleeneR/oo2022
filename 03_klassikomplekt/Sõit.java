public class Sõit {
    Juht juht;
    Takso takso;
    String alguspunkt;
    String lõpppunkt;
    int kestvus;
    int maksumus;

    public Sõit(Juht juht, Takso takso, String alguspunkt, String lõpppunkt, int kestvus, int maksumus){
        this.juht = juht;
        this.takso = takso;
        this.alguspunkt = alguspunkt;
        this.lõpppunkt = lõpppunkt;
        this.kestvus = kestvus;
        this.maksumus = maksumus;
    }

    public String getTaksosoit(){
        return "Teie takso andmed on: " + this.takso + ". Teid sõidutas juht: "
                + this.juht + ". Teie sõidu alguspunkt oli: " + this.alguspunkt + " ja lõpppunkt oli " + this.lõpppunkt +
                ". Teie sõidu maksumus oli " + this.maksumus + " eurot.";
    }
}
