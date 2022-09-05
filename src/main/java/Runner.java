public class Runner {

    public static void main(String[] args) {
        Planet Mars = new Planet("Mars", 420);
        System.out.println(Mars.getName() + " is " + Mars.getSize());
        Mars.printExplode();
    }
}
