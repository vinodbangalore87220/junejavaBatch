package Exception;

public class CustomException extends Exception{
    String message;
    CustomException(String message){
        this.message = message;
    }
}
