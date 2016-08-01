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
}