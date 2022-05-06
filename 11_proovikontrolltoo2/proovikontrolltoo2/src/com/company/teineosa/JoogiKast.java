package com.company.teineosa;

public class JoogiKast {
    String kastiTyyp;
    double kastiHind;
    double kastiMass;
    int pesad;
    JoogiPudel joogipudel;


    public JoogiKast(String kastiTyyp, double kastihind, double kastiMass, int pesad) {
        this.kastiTyyp = kastiTyyp;
        this.kastiHind = kastihind;
        this.kastiMass = kastiMass;
        this.pesad = pesad;
    }


    public double getMass(int jookideArv) {
        if(jookideArv > pesad){
            jookideArv = pesad;
            System.out.println("Jookide arv oli suurem kui pesade arv, " + "võtan kasutusele " + pesad + " jooki.");
        }
        if (joogipudel == null){
            return kastiMass;
        }else {
            return kastiMass + (joogipudel.mass + joogipudel.jook.erikaal + joogipudel.maht) + jookideArv;
        }
    }

    public double getHind(int jookideArv){
        if(jookideArv > pesad){
            jookideArv = pesad;
            System.out.println("Jookide arv oli suurem kui pesade arv, " + "võtan kasutusele " + pesad + " jooki.");
        }
        if (joogipudel == null){
            return kastiHind;
        }else {
            return kastiHind + (joogipudel.taaraMaksumus + joogipudel.jook.erikaal + joogipudel.jook.omahind) + jookideArv;
        }
    }

    public int villiKastiPudelid(Joogivaat joogivaat){
        int loendur = 0;
        while (joogivaat.liitritesJooki >= joogipudel.maht){
            joogivaat.liitritesJooki -= joogipudel.maht;
            loendur++;
        if(loendur ==)
        }
        System.out.print("Villisid " + loendur + " jooki");
        return loendur;
    }
}
