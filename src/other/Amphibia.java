package other;

class Amphibia implements Car, Boat {

    @Override
    public void printName() {
        System.out.println("Amfibia to trochę: ");
        Car.super.printName();
        System.out.println(" i trochę ");
        Boat.super.printName();
    }
}
