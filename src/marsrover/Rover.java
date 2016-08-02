package marsrover;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static marsrover.Coordinates.at;

class Rover {
    private Coordinates coordinates;
    private Direction direction;
    private Set<Coordinates> obstacles = new HashSet<>();

    Rover(Coordinates coordinates, Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public Rover(Coordinates coordinates, Direction direction, Set<Coordinates> obstacles) {
        this(coordinates, direction);
        this.obstacles = obstacles;
    }

    Coordinates getCoordinates() {
        return coordinates;
    }

    Direction getDirection() {
        return direction;
    }

    boolean recieveCommand(char c) {
        if (c == 'R') direction = direction.right();
        else if (c == 'F') {
            Coordinates nextCoordinate = coordinates.plus(direction.vector);
            if (obstacles.contains(nextCoordinate)) {
                return false;
            } else {
                coordinates = nextCoordinate;
            }
        }
        return true;
    }

    void recieveCommands(String cmds) {
        char[] chars = cmds.toCharArray();
        for (char c : chars) {
            if (!recieveCommand(c)) return;
        }
    }
}
