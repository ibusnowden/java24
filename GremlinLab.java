package java24hours;

// Program configured with arguments
public class GremlinLab {
    public static void main(String[] arguments) {
        int numGremlins= Integer.parseInt(arguments[0]);
        if (numGremlins > 0) {
            Gremlin[] gremlins = new Gremlin[numGremlins];
            for (int i = 0; i < numGremlins; i++) {
                gremlins[i] = new Gremlin();
            }
            System.out.println("There are " + Gremlin.getGremlinCount() + " gremlins.");
        }
    }
}
