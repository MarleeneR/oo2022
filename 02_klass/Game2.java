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
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .... 0.9999 - 0 ... 4.9999 -- 0..2 .. 2..3

        //klassi  nimi Player
        Player mangija1 = new Player(worldHeight, worldWidth);
        Player mangija2 = new Player(worldHeight, worldWidth);

        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight, worldWidth, mangija1.playerCoordinateY,
                mangija1.playerCoordinateX, enemyCoordinateY, enemyCoordinateX);

        // Klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input, worldHeight, worldWidth);

            printMap(worldHeight, worldWidth, mangija1.playerCoordinateY,
                    mangija1.playerCoordinateX, enemyCoordinateY, enemyCoordinateX);
            input = scanner.nextLine();
        }
    }
    // int -- sama tüüpi, mis peab olema funktsiooni sees returni järgi
    public static int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;

    }

    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateY, int playerCoordinateX,
                                int enemyCoordinateY, int enemyCoordinateX){
        //fori -->pakub
        char symbol; //deklareerib 1x muutuja, mitte iga kord deklaleerib selle
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y==worldHeight-1){ // || - või  ---- tõenäolisemalt true vaskule poole ---- primitiiv || andmebaasipäring
                    symbol = '-';
                }else if (x== 0 || x==worldWidth-1) {
                    symbol = '|';
                }else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x){
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();

        }
    }
}
