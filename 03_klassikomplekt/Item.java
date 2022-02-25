public class Item {
    int coordinateY;
    int coordinateX;
    double strenght;
    ItemType itemType; //klass(enum klass) muutuja


    public Item(int worldHeight, int worldWidth, ItemType itemType){
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType; //this -> selles klassis olev itemtype (viitab klassile)
        determineStrenght(itemType); // enne aktiivseks -> (ekstractimiseks) ctrl + alt + m
    }

    private void determineStrenght(ItemType itemType) {
        switch (itemType){
            case SWORD:
                this.strenght = 3;
                break;
            case HAMMER:
                this.strenght = 2;
                break;
            case DAGGER:
                this.strenght = 1;
                break;
        }
    }

    public int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;

    }
}
