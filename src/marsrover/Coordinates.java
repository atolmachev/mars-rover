package marsrover;

import java.util.Objects;

class Coordinates {
    private final int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Coordinates at(int x, int y) {
        return new Coordinates(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}