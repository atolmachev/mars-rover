package marsrover;

enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction right() {
        return Direction.values()[this.ordinal() == 3 ? 0 : this.ordinal() + 1];
    }
}
