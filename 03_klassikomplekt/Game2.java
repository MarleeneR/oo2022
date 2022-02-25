import java.util.Arrays;
import java.util.Scanner;

    //paremklõps --> refactor -> rename
public class Game2 {
    public static void main(String[] args) {
        //sout --> pakub
        System.out.println("Hello world!"); //kustuta ln siis vasakult paremale


        // Math.random() -- 0 .... 0.9999 - 0 ... 4.9999 -- 0..2 .. 2..3 double cast to int

        //tyyp+>
        World world = new World(5,10);
        //klassi  nimi Player
        Player mangija1 = new Player(world.height, world.width);
        Player mangija2 = new Player(world.height, world.width);

        // uue instansi loomine -- uue mälukohaga objekti tekitamine
        //kellel on kõik omadused, mis on defineeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.height, world.width);
        Item sword = new Item(world.height, world.width, ItemType.SWORD);
        Item hammer = new Item(world.height, world.width, ItemType.HAMMER);
        Item dagger = new Item(world.height, world.width, ItemType.DAGGER);
        world.items = Arrays.asList(sword,hammer, dagger);


        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        // Klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input, world.height, world.width);
            for (Item item:world.items) {
                if (item.coordinateX == mangija1.coordinateX && item.coordinateY == mangija1.coordinateY){
                    mangija1.addItem(item);
                    break;
                }
            }
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
