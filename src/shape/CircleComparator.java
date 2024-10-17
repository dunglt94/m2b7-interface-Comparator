package shape;

import java.util.Comparator;

public class CircleComparator  extends Circle implements Comparator<Circle> {

    public CircleComparator () {}

    public CircleComparator (double radius) {
        super(radius);
    }

    public CircleComparator (double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compare (Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        if (c1.getRadius() < c2.getRadius()) return -1;
        return 0;
    }
}
