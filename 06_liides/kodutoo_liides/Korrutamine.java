package kodutoo_liides;

public class Korrutamine implements liides{

    int val;

    Korrutamine(){
        val = 1;
    }

    public int multiply(){
        val *= 2;
        return val;
    }
}
