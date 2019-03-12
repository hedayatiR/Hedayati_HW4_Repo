import java.util.Scanner;

public class FormLetterWriter {
    private String letterBody = "Thank you for your recent order.";
    //------------------------------------------------------------------
    public void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    //------------------------------------------------------------------
    public void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
    }
    //------------------------------------------------------------------
	public void displayBody(){
        System.out.println(letterBody);
    }
    //------------------------------------------------------------------
    public void getBody(){
        System.out.println("Enter body of letter:");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        this.letterBody = input.next();
    }
    //------------------------------------------------------------------
    
}