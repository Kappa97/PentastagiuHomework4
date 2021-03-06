package homework4.game.artifacts;

import homework4.game.characters.Map;

import static homework4.game.Constants.*;

public class Health extends Artifact {
    private int x;
    private int y;
    private int points;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Health(int x, int y, int points) {
        super(x, y, points);
        if (x < MAP_X && y < MAP_Y && Map.myMap[x][y] == 0) {
            this.x = x;
            this.y = y;
            this.points = points;
            Map.myMap[this.getX()][this.getY()] = 2;
        } else {
            System.out.println("Bad value for x and y - health");
        }
    }
}
