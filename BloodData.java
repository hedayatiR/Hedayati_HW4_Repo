public class BloodData {
    private String bloodType;
    private String RH;
	//--------------------------------------------
	    public BloodData() {
        this.bloodType = "O";
        this.RH = "+";
    }
	//--------------------------------------------
    public BloodData(String bloodType, String RH) {
        this.bloodType = bloodType;
        this.RH = RH;
    }
	//--------------------------------------------
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
	//--------------------------------------------
    public void setRH(String RH) {
        this.RH = RH;
    }
	//--------------------------------------------
    public String getBloodType() {
        return bloodType;
    }
	//--------------------------------------------
    public String getRH() {
        return RH;
    }
	//--------------------------------------------
}
