public class World {
    int worldHeight;
    int worldWidth;

    public World(int height, int width){
        this.worldHeight = height;
        this.worldWidth = width;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordinateX) {
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
