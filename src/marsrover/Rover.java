package marsrover;

import static marsrover.Coordinates.at;

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

    void recieveCommand(char c) {
        if (c == 'R') direction = direction.right();
        else if (c == 'F') coordinates = coordinates.plus(direction.vector);
    }

    void recieveCommands(String cmds) {
        char[] chars = cmds.toCharArray();
        for (char c : chars) {
            recieveCommand(c);
        }
    }
}
