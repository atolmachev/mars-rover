package marsrover;

import static java.lang.String.format;

class Rover {
    private Coordinates coordinates;
    private Direction direction;

    Rover(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    Coordinates getCoordinates() {
        return coordinates;
    }

    Direction getDirection() {
        return direction;
    }
}
