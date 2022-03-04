public class Parkimine {
    Auto auto;
    double algus;
    double lõpp;
    double maksumus;

    public Parkimine(Auto auto, double algus, double lõpp, double maksumus){
        this.auto = auto;
        this.algus = algus;
        this.lõpp = lõpp;
        this.maksumus = maksumus;
    }

    public String getAuto(){
        return "Auto andmetega: " + this.auto + ". Parkimise andmed on: parkimise algus:" + this.algus +", parkimise lõpp:"+ this.lõpp +", parkimise maksumus "+ this.maksumus;
    }
}
