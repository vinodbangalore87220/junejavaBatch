package Exception;

import java.io.IOException;
import java.util.ArrayList;

public class ExceptionMain {
    public static void main(String[] args) throws CustomException {
        ExceptionMain ex = new ExceptionMain();
        int val = 18;
       if(val < 18){
           throw new CustomException("age is less than 18");
       }
    }

    public void print() throws IOException
    {
        System.out.println("printing");
    }
}
