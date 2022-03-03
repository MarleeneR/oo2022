public class Koer {
    String nimi;
    String tõug;
    String suurus;
    int vanus;
    double kaal;


    public Koer(String nimi, String tõug, String suurus, int vanus, double kaal){
        this.nimi = nimi;
        this.tõug = tõug;
        this.suurus = suurus;
        this.vanus = vanus;
        this.kaal = kaal;
    }
    public void sayHello(){
        System.out.println(nimi + " on " + suurus + " " + tõug + " ja ta on " + vanus + " aastat vana.");
    }


    public void toidukogus(){
        if(vanus<=1){
            if(suurus=="väike"){
                System.out.println(nimi + " peab sööma " + kaal * 0.14 + " kg kuivtoitu.");
            }else{
                System.out.println(nimi + " peab sööma " +kaal * 0.22 + " kg kuivtoitu.");
            }
        }else{
            if(suurus=="väike"){
                System.out.println(nimi + " peab sööma " +kaal * 0.1 + "kg kuivtoitu.");
            }else{
                System.out.println(nimi + " peab sööma " +kaal * 0.2 + "kg kuivtoitu.");
            }
        }
    }

    @Override
    public String toString() {
        return "Koer{" +
                "nimi='" + nimi + '\'' +
                ", tõug='" + tõug + '\'' +
                ", suurus='" + suurus + '\'' +
                ", vanus=" + vanus +
                ", kaal=" + kaal +
                '}';
    }
}
