import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;

public class prob21 {
    public static void main(String[] args) throws FileNotFoundException, NullPointerException {
        Scanner scan = new Scanner(new File("prob21.txt"));
        int numStars = scan.nextInt(); scan.nextLine();

        //parse the stars
        ArrayList<Star> stars = new ArrayList<>();
        for(int i = 0; i < numStars; i++) {
            stars.add(new Star(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
        }

        //debug parsing
        //stars.forEach(System.out::println);

        //parse the nodes, including start and target

        ArrayList<Node> nodes = new ArrayList<>();
        int jumps = scan.nextInt();
        String START, TARGET;
        for(int i = 0; i < jumps; i++) {
            START = scan.next();
            TARGET = scan.next(); scan.nextLine();
            Star start = null, target = null;
            //find the star that matches the name we're given
            for(Star s : stars)
                if (s.getName().equals(START))
                    start = s;
            for(Star s : stars)
                if (s.getName().equals(TARGET))
                    target = s;

            //add start
            nodes.add(new Node(start, true, false));
            //add target
            nodes.add(new Node(target, false, true));
        }

        nodes.forEach(System.out::println);
    }

    public double getDistance(double x1, double x2, double y1, double y2, double z1, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        //d = sqrt[ (x2-x1)^2 + (y2-y1)^2 + (z2-z1)^2 ]
    }
}

class Star {
    private String name, classification;
    private double magnitude;
    private double x, z, y;

    public Star(String name, String classification, double magnitude, double x, double y, double z) {
        this.name = name;
        this.classification = classification;
        this.magnitude = magnitude;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getMagnitude() {
        return magnitude;
    }

    @Override
    public String toString() {
        return "Star: " + name + "\nClassification: " + classification + "\nMagnitude: " + magnitude + "\nx = " + x + " y = " + y + " z = " + z + "\n";
    }
}

class Node {
    private boolean isStart, isTarget, visited;
    private Star star;
    private ArrayList<Star> edges;

    public Node(Star star, boolean isStart, boolean isTarget) {
        this.star = star;
        this.isStart = isStart;
        this.isTarget = isTarget;
        visited = false;
    }

    public void visit() {
        visited = true;
    }

    public boolean isVisited() {
        return visited;
    }

    @Override
    public String toString() {
        return    "---------------Node Overview---------------\n"
                + star + "\n"
                + (isStart? star.getName() + " is the START" : "")
                + (isTarget? star.getName() + " is the TARGET" : "")
                + ((!isStart && !isTarget)? star.getName() + " is an intermediate node.\n" : "\n")
                + (visited? star.getName() + " has been visited.\n" : star.getName() + " has NOT been visited.\n")
                + "-------------------------------------------\n";
    }
}
