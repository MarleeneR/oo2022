public class Arvuti {
    Info info;
    int maksumus;

    public Arvuti(Info info, int maksumus){
        this.info = info;
        this.maksumus = maksumus;
    }

    public String getInfo() {
        return "Arvuti on parameertritega: " + this.info + ". Maksumus on: " + this.maksumus;
    }
}
