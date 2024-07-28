package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2)
                + Math.pow(this.y - that.y, 2)
                + Math.pow(this.z, 2));
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
        Point c = new Point(1, 0, 2);
        Point d = new Point(2, 1, 0);
        double distance3d = c.distance3d(d);
        System.out.println(distance3d);
    }
}