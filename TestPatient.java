public class TestPatient {
    public static void main(String[] args) {
        // default constructor
        Patient patient = new Patient();
        System.out.println("Default Constructor:");
        System.out.println("ID : " + patient.getID());
        System.out.println("Age : " + patient.getAge());

        // constructor with inputs
        BloodData bloodData = new BloodData("AB" , "-");
        Patient patient1 = new Patient(1234, 28, bloodData);
        System.out.println();
        System.out.println("Constructor with inputs:");
        System.out.println("ID : "  +  patient1.getID());
        System.out.println("Age : " +  patient1.getAge());
    }
}

