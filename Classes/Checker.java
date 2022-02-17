package Classes;

public class Checker{
    public boolean sizeCheck(String password){
        int size = password.length();
        if (size >= 6){
            return true;
        }
            return false;

    }
    public boolean digitCheck(String password){
        boolean hasDigit = password.matches(".*\\d+.*");
        
        return hasDigit;
    }

    public boolean[] lowerUpperCaseCheck(String password){
        boolean[] result = new boolean[2];
        result[0] = false;
        result[1] = false;
        for(int i = 0 ; i < password.length(); i++){
            if(password.charAt(i)>= 'a' && password.charAt(i) <='z'){
                result[0] = true;
            }
            if(password.charAt(i)>= 'A' && password.charAt(i) <='Z'){
                result[1] = true;
            }
     
        }
        return result;
    }

    public boolean specialCheck(String password){
        String special = "@#$%^&*()-+";
        for(int i = 0 ; i < special.length(); i++){
            String temp = "" + special.charAt(i);
            if(password.contains(temp)){
                return true;
            }
        }
        return false;
    }
}