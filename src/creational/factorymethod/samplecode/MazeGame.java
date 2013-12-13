package creational.factorymethod.samplecode;
import static creational.factorymethod.samplecode.CardinalDirection.*;

/**
 * Created by dkocian on 12/13/13.
 */
class MazeGame {
    Maze createMaze() {
        Maze aMaze = makeMaze();

        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door theDoor = makeDoor(room1, room2);

        aMaze.addRoom(room1);
        aMaze.addRoom(room2);

        room1.setSide(NORTH, makeWall());
        room1.setSide(EAST, theDoor);
        room1.setSide(SOUTH, makeWall());
        room1.setSide(WEST, makeWall());

        room2.setSide(NORTH, makeWall());
        room2.setSide(EAST, makeWall());
        room2.setSide(SOUTH, makeWall());
        room2.setSide(WEST, theDoor);

        return aMaze;
    }
    Maze makeMaze() {
        return new Maze();
    }
    Room makeRoom(int n) {
        return new Room(n);
    }
    Wall makeWall() {
        return new Wall();
    }
    Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
