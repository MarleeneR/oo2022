import java.util.Scanner;

    //paremklõps --> refactor -> rename
public class Game2 {
    public static void main(String[] args) {
        //sout --> pakub
        System.out.println("Hello world!"); //kustuta ln siis vasakult paremale
        // String --- sõnaline muutuja
        // char ---- üks täht
        // double --- 15kohaline komakohaga number
        // float --- 7kohaline komakohaga number xxx
        // int --- täiskohaline number 2.1mlj
        // byte -- 128kohta
        // short --- 32000kohta
        // long --- 9,223,372,036,854,775,807
        // boolean --- kahendväärtus true/false

        // Math.random() -- 0 .... 0.9999 - 0 ... 4.9999 -- 0..2 .. 2..3

        World world = new World(5,10);
        //klassi  nimi Player
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);

        // uue instansi loomine -- uue mälukohaga objekti tekitamine
        //kellel on kõik omadused, mis on defineeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        // Klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input, world.worldHeight, world.worldWidth);

            world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
//    // int -- sama tüüpi, mis peab olema funktsiooni sees returni järgi
//    public static int generateRandomCoordinate(int worldSize){
//        return (int) (Math.random()*(worldSize-2))+1;
//
//    }


}
