
//abstract -- ei saa teha new Character();  (ei saa teha uut instantsi)
// saab extendida - extend võtab kõik omadused

public abstract class Character {
    int coordinateY;
    int coordinateX;


    public Character(int worldHeight, int worldWidth){
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1; //cast
    }
}
