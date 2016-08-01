package marsrover;

import static java.lang.String.format;
import static marsrover.Direction.*;

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

    public void recieveCommand(char r) {
        direction = Direction.values()[direction.ordinal() == 3 ? 0 : direction.ordinal() + 1];
    }
}
