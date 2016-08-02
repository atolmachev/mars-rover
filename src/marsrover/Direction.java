package marsrover;

enum Direction {
    NORTH(0, -1),
    EAST(1, 0),
    SOUTH(0, 1),
    WEST(-1, 0);

    Coordinates vector;

    Direction(int x, int y) {
        this.vector = new Coordinates(x, y);
    }

    public Direction right() {
        return Direction.values()[this.ordinal() == 3 ? 0 : this.ordinal() + 1];
    }
}
