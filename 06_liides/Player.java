// extends -- pärilus Inheritance 1x
// implements -- liides Interface ...x

public class Player extends Character implements WorldObject {
    Direction direction; //3-ndl kodutöö
    Item item;


    //Constructor ˇsama nimega kui klass
    public Player(int worldHeight, int worldWidth){
        super(worldHeight, worldWidth); // super on sama asi mis new Charecter();
        this.direction = Direction.UP;
    }

    public void addItem(Item item){
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }



    public void movePlayer(String input, int worldHeight, int worldWidth){
        switch (input){
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction){
            case LEFT:
                if (coordinateX > 1 ) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight -2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth -2) {
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateX > 1 ) {
                    coordinateY--;
                }
                break;
        }

            /*if(direction == Direction.LEFT && true){
                playerCoordinateX--;
            }else if(direction == Direction.DOWN)){
                playerCoordinateY++;
            }else if(direction == Direction.RIGHT)){
                playerCoordinateX++;
            }else if(direction == Direction.UP)){
                playerCoordinateY-;
            }*/
    }
}
//Klasside kasutamine
//Tellimuse - id, tooted, kasutaja, aja
//Kasutaja - frontendis registreerumise järgselt
//Ühe toote
//Kategooria