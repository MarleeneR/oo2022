package Kodutoo;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Kirjutaga vili mille kohta soovite infot");

        Scanner vastus = new Scanner(System.in);
        String Vili = vastus.nextLine();


        if (Objects.equals(Vili, "Apelsin")){
            Apelsin apelsin = new Apelsin();
            apelsin.kasvabpuul();
            apelsin.sisaldabvitamiini();
            apelsin.soodav();
            apelsin.varv();
        }
        if (Objects.equals(Vili, "Ploom")){
            Ploom ploom = new Ploom();
            ploom.kasvabpuul();
            ploom.seeme();
            ploom.soodav();
        }
        if (Objects.equals(Vili, "Greip")){
            Greip greip = new Greip();
            greip.kasvabpuul();
            greip.sisaldabvitamiini();
            greip.soodav();
            greip.maitse();
        }
        if (Objects.equals(Vili, "Hernes")){
            Hernes hernes = new Hernes();
            hernes.kaun();
            hernes.soodav();
            hernes.varv();
        }
        if (Objects.equals(Vili, "Kaalikas")){
            Kaalikas kaalikas = new Kaalikas();
            kaalikas.kasvabmullas();
            kaalikas.soodav();
        }
        if (Objects.equals(Vili, "Mandariin")){
            Mandariin mandariin = new Mandariin();
            mandariin.kasvabpuul();
            mandariin.sisaldabvitamiini();
            mandariin.soodav();
            mandariin.varv();
        }
        if (Objects.equals(Vili, "Nektariin")){
            Nektariin nektariin = new Nektariin();
            nektariin.kasvabpuul();
            nektariin.seeme();
            nektariin.soodav();
        }
        if (Objects.equals(Vili, "Peet")){
            Peet peet = new Peet();
            peet.kasvabmullas();
            peet.soodav();
        }
        if (Objects.equals(Vili, "Pomel")){
            Pomel pomel = new Pomel();
            pomel.kasvabpuul();
            pomel.sisaldabvitamiini();
            pomel.soodav();
        }
        if (Objects.equals(Vili, "Porgand")){
            Porgand porgand = new Porgand();
            porgand.kasvabmullas();
            porgand.soodav();
        }
        if (Objects.equals(Vili, "Sidrun")){
            Sidrun sidrun = new Sidrun();
            sidrun.kasvabpuul();
            sidrun.sisaldabvitamiini();
            sidrun.soodav();
        }
        if (Objects.equals(Vili, "Uba")){
            Uba uba = new Uba();
            uba.kaun();
            uba.soodav();
        }

    }
}
