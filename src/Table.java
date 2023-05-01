public class Table {
    static final int COUNT_TILES = 28;
    Player[] players;
    Bot[] bots;
    Tile[] tiles;

    public Table() {
    }

    public Table(Player[] players, Bot[] bots, Tile[] tiles) {
        this.players = players;
        this.bots = bots;
        this.tiles = tiles;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Bot[] getBots() {
        return bots;
    }

    public void setBots(Bot[] bots) {
        this.bots = bots;
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[] tiles) {
        this.tiles = tiles;
    }

    public void getTiles(Player player) {
        // here will be give generated tiles to specified player
    }
}
