import java.util.*;

class Plane {
    void takeoff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane has landed");
    }
}

class Cargo extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo plane is flying at low height");
    }

    void specialCargo() {
        System.out.println("This is special cargo");
    }
}

class Passenger extends Cargo {
    @Override
    void land() {
        System.out.println("Passenger plane landed safely");
    }

    void gone() {
        System.out.println("Passengers have gone");
    }
}

class Fighter extends Passenger {
    @Override
    void takeoff() {
        System.out.println("Fighter plane took off safely");
    }

    void crash() {
        System.out.println("Fighter plane crashed");
    }
}

public class ExampleForInheritMethods {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.takeoff();
        f.fly();
        f.land();
        f.specialCargo();
        f.gone();
        f.crash();
    }
}
