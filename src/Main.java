import shape.CircleComparator ;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CircleComparator[] circles = new CircleComparator [3];
        circles[0] = new CircleComparator (3.6);
        circles[1] = new CircleComparator ();
        circles[2] = new CircleComparator (3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (CircleComparator  circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Post-sorted:");
        for (CircleComparator  circle : circles) {
            System.out.println(circle);
        }

    }
}
