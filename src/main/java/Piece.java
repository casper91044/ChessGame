public abstract class Piece {
    private String name;
    private Spot spot;
    private String id;
    private boolean white;
    private boolean killed;

    public Piece(String name, Spot spot, String id, boolean white) {
        this.name = name;
        this.spot = spot;
        this.id = id;
        this.white = white;
    }

    public String getName() {
        return name;
    }

    public Spot getSpot() {
        return spot;
    }

    public String getId() {
        return id;
    }

    public boolean isWhite() {
        return white;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "name='" + name + '\'' +
                ", spot=" + spot +
                ", id='" + id + '\'' +
                ", white=" + white +
                ", killed=" + killed +
                '}';
    }
}
