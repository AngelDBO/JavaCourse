package clase_math;

public class claseRandom {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("random = " + random);

        random *=7;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);
    }
}
