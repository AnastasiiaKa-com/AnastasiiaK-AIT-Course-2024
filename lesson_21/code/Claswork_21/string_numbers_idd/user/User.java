package Claswork_21.string_numbers_idd.user;

public class User {

    private String emeil;
    private String password;
//constructor
    public User(String emeil, String password) {
        setEmeil(emeil);
        setPassword(password);
    }

    public String getEmeil() {
        return emeil;
    }

    public void setEmeil(String emeil) {
      if (isEmailValid(emeil)){
          this.emeil = emeil;

      }else{
          System.out.println(emeil + " is NOT valid.");

      }
    }

    private boolean isEmailValid(String emeil) {
        int indexAt = emeil.indexOf('@'); // index where @ placed
        if(indexAt == -1 || indexAt != emeil.lastIndexOf('@')){
            return false;
        }
        if(emeil.indexOf('.', indexAt) == -1){
            return false;
        }
        if(emeil.lastIndexOf('.') >= emeil.length() - 2) {
            return false;
        }
        for (int i = 0; i < emeil.length(); i++) {
            char c = emeil.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
