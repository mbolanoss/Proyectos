package businessLogic;

import javax.swing.JTextField;

public class ExceptionManager {
    
    public static boolean checkIntegerValue(JTextField textField){
        int value;
        String stringValue = textField.getText();
        try{
            value = Integer.parseInt(stringValue);
        }catch(NumberFormatException ex){
            return true;
        }
        return false;
    } 
    
}
