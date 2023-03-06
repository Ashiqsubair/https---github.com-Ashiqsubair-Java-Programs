import java.util.ArrayList;
import java.util.List;

public class LinearProgramming {
    public static void main(String[] args) {
        // Objective function: maximize 3x + 4y
        // Constraints:
        //   2x + y <= 8
        //   x + y <= 5
        //   x, y >= 0

        // Create a list of the variables and their coefficients in the objective function
        List<Variable> variables = new ArrayList<>();
        variables.add(new Variable("x", 3));
        variables.add(new Variable("y", 4));

        // Create a list of the constraints and their coefficients
        List<Constraint> constraints = new ArrayList<>();
        constraints.add(new Constraint("c1", new Variable[]{new Variable("x", 2), new Variable("y", 1)}, 8));
        constraints.add(new Constraint("c2", new Variable[]{new Variable("x", 1), new Variable("y", 1)}, 5));

        // Find the feasible region
        List<Point> feasibleRegion = new ArrayList<>();
        for (Constraint c : constraints) {
            for (Variable v : variables) {
                feasibleRegion.add(new Point(c.getCoefficient(v.getName())/v.getCoefficient(), c.getValue()/v.getCoefficient()));
            }
        }

        // Find the vertices of the feasible region
        List<Point> vertices = new ArrayList<>();
        for (int i = 0; i < feasibleRegion.size(); i++) {
            for (int j = i+1; j < feasibleRegion.size(); j++) {
                Point p1 = feasibleRegion.get(i);
                Point p2 = feasibleRegion.get(j);
                if (p1.getX() == p2.getX()) {
                    vertices.add(new Point(p1.getX(), 0));
                } else if (p1.getY() == p2.getY()) {
                    vertices.add(new Point(0, p1.getY()));
                } else {
                    double slope = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
                    double yIntercept = p1.getY() - slope*p1.getX();
                    vertices.add(new Point(0, yIntercept));
                    vertices.add(new Point(-yIntercept/slope, 0));
                }
            }
        }

        // Find the optimal solution by testing each vertex
        double optimalValue = Double.NEGATIVE_INFINITY;
        Point optimalVertex = null;
        for (Point v : vertices) {
            double objectiveValue = 3*v.getX() + 4*v.getY();
            if (objectiveValue > optimalValue) {
                optimalValue = objectiveValue;
                optimalVertex = v;
            }
        }

        System.out.println("Optimal solution: " + optimalVertex);
        System.out.println("Optimal value: " + optimalValue);
    }
}