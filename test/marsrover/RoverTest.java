package marsrover;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static marsrover.Coordinates.at;
import static marsrover.Direction.*;
import static org.junit.Assert.assertEquals;

public class RoverTest {
    private Rover rover;

    @Before
    public void beforeRoverTest() {
        rover = new Rover(at(1, 2), NORTH);
    }

    @Test
    public void givenInitialCoordinatesAndDirectionRoverShouldBeAbleToReturnThem() throws Exception {
        assertEquals(at(1, 2), rover.getCoordinates());
        assertEquals(NORTH, rover.getDirection());
    }

    @Test
    public void givenRotateCommandWhenRoverIsDirectedToNorthRoverShouldChangeDirection() throws Exception {
        rover.recieveCommand('R');
        assertEquals(rover.getDirection(), EAST);

        rover.recieveCommand('R');
        assertEquals(rover.getDirection(), SOUTH);

        rover.recieveCommand('R');
        assertEquals(rover.getDirection(), WEST);

        rover.recieveCommand('R');
        assertEquals(rover.getDirection(), NORTH);
    }

    @Test
    public void givenForwardCommandWhenRoverIsDirectedToNorthThenRoverYCoordinateDecrements() throws Exception {
        rover = new Rover(at(1, 2), NORTH);
        rover.recieveCommand('F');
        assertEquals(at(1, 1), rover.getCoordinates());
        assertEquals(NORTH, rover.getDirection());
    }

    @Test
    public void givenForwardCommandWhenRoverIsDirectedToEastThenRoverXCoordinateIncrements() throws Exception {
        rover = new Rover(at(1, 2), EAST);
        rover.recieveCommand('F');
        assertEquals(at(2, 2), rover.getCoordinates());
        assertEquals(EAST, rover.getDirection());
    }

    @Test
    public void givenForwardCommandWhenRoverIsDirectedToSouthThenRoverYCoordinateIncrements() throws Exception {
        rover = new Rover(at(1, 2), SOUTH);
        rover.recieveCommand('F');
        assertEquals(at(1, 3), rover.getCoordinates());
        assertEquals(SOUTH, rover.getDirection());
    }

    @Test
    public void givenForwardCommandWhenRoverIsDirectedToWestThenRoverXCoordinateDecrements() throws Exception {
        rover = new Rover(at(1, 2), WEST);
        rover.recieveCommand('F');
        assertEquals(at(0, 2), rover.getCoordinates());
        assertEquals(WEST, rover.getDirection());
    }
}