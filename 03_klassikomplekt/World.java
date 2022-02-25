import java.util.List;

public class World {
    int height;
    int width;
    List<Item> items;

    public World(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordinateX) {
        //fori -->pakub
        char symbol; //deklareerib 1x muutuja, mitte iga kord deklaleerib selle
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y== height -1){ // || - või  ---- tõenäolisemalt true vaskule poole ---- primitiiv || andmebaasipäring
                    symbol = '-';
                }else if (x== 0 || x== width -1) {
                    symbol = '|';
                }else {
                    symbol = ' ';
                }
                for (Item item : items) {
                    if (item.coordinateY == y && item.coordinateX == x) {
                        symbol = 'I';
                        break;
                    }
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
