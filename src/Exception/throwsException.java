package Exception;

import java.io.IOException;

public class throwsException {
    public static void main(String[] args)  {
    ExceptionMain ex = new ExceptionMain();
        try {
        ex.print();
    }
        catch (
    IOException e){

    }
}

    public void print() throws IOException
    {
        System.out.println("printing");
    }
}
