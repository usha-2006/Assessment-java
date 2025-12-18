import java.util.Scanner;

abstract class Vaccine {
    int age;
    String nationality;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    abstract void firstDose();
    abstract void secondDose();

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    boolean firstDoseTaken = false;

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("Your first dose Successfully Done. Now you have to pay 250 Rs");
            firstDoseTaken = true;
        } else {
            System.out.println("Not eligible for first dose");
        }
    }

    void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Your second dose Successfully Done");
        } else {
            System.out.println("Take first dose first");
        }
    }

    void boosterDose() {
        System.out.println("Your Booster Dose Successfully Done");
    }
}

public class Vaccination
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nationality: ");
        String nationality = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();

        VaccinationSuccessful vaccination = new VaccinationSuccessful(age, nationality);
        vaccination.firstDose();
        vaccination.secondDose();
        vaccination.boosterDose();
    }
}
