public class TestBloodData {
    public static void main(String[] args) {
        // Default Constructor
        BloodData bloodData1 = new BloodData();
        System.out.println("Default Constructor:");
        System.out.println("Blood type : " + bloodData1.getBloodType());
        System.out.println("Blood RH : " + bloodData1.getRH());


        // 2 input Constructor
        BloodData bloodData2 = new BloodData("AB" , "-");
        System.out.println();
        System.out.println("Constructor with 2 input:");
        System.out.println("Blood type : " + bloodData2.getBloodType());
        System.out.println("Blood RH : " + bloodData2.getRH());

    }
}
