public class CalculatorSimulator {

    public static void main(String[] args) {

        TaxCalculator tc = new TaxCalculator();

        // ---------- Test Case 1 ----------
        try {
            System.out.println("Test Case 1:");
            double tax = tc.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------- Test Case 2 ----------
        try {
            System.out.println("\nTest Case 2:");
            double tax = tc.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------- Test Case 3 ----------
        try {
            System.out.println("\nTest Case 3:");
            double tax = tc.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------- Test Case 4 ----------
        try {
            System.out.println("\nTest Case 4:");
            double tax = tc.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* ---------------- TaxCalculator Class ---------------- */

class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException();
        }

        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException();
        }

        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException();
        }
    }
}

/* ---------------- Custom Exceptions ---------------- */

class CountryNotValidException extends Exception {
    public String getMessage() {
        return "The employee should be an Indian citizen for calculating tax";
    }
}

class EmployeeNameInvalidException extends Exception {
    public String getMessage() {
        return "The employee name cannot be empty";
    }
}

class TaxNotEligibleException extends Exception {
    public String getMessage() {
        return "The employee does not need to pay tax";
    }
}
