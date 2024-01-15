package testjava;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.setXY(x, y);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = { this.x, this.y };
        return arr;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }


}

