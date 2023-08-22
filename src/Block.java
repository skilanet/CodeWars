public class Block {

    int[] size;

    public Block(int[] size) {
        this.size = size;
    }

    public int getWidth(){
        return size[0];
    }

    public int getLength(){
        return size[1];
    }

    public int getHeight(){
        return size[2];
    }

    public int getVolume(){
        return getWidth() * getLength() * getHeight();
    }

    public int getSurfaceArea(){
        return 2 * (getWidth() * (getLength() + getHeight()) + (getLength() * getHeight()));
    }
}