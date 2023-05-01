public class Tile {
    int id;
    int upperValue;
    int lowerValue;

    public Tile() {
    }

    public Tile(int id, int upperValue, int lowerValue) {
        this.id = id;
        this.upperValue = upperValue;
        this.lowerValue = lowerValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUpperValue() {
        return upperValue;
    }

    public void setUpperValue(int upperValue) {
        this.upperValue = upperValue;
    }

    public int getLowerValue() {
        return lowerValue;
    }

    public void setLowerValue(int lowerValue) {
        this.lowerValue = lowerValue;
    }
}
