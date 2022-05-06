package com.company.teineosa;

public class Joogivaat {

    double ruumala;
    double liitritesJooki;


    public Joogivaat(double ruumala, double liitritesJooki) {
        this.ruumala = ruumala;
        this.liitritesJooki = liitritesJooki;
    }

    public boolean t2idaJoogipudel(JoogiPudel joogiPudel){
        if(liitritesJooki >= joogiPudel.maht){
            System.out.print("Jooki mahub!");
            return true;
        }else{
            System.out.print("Jooki ei mahu!");
            return false;
        }
    }

    public int villiPudelid(JoogiPudel joogiPudel){
        int loendur = 0;
        while (liitritesJooki >= joogipudel.maht){
            //    liitritesJooki = liitritesJooki-joogiPudel.maht;
            liitritesJooki -= joogiPudel.maht;
            loendur++;
        }
        System.out.print("Villisid " + loendur + " jooki");
        return loendur;
    }


    public int villiKastiPudelid(Joogivaat joogivaat){
        int loendur = 0;
        while (liitritesJooki >= joogipudel.maht){
            //    liitritesJooki = liitritesJooki-joogiPudel.maht;
            liitritesJooki -= joogipudel.maht;
            loendur++;
        }
        System.out.print("Villisid " + loendur + " jooki");
        return loendur;
    }
}
