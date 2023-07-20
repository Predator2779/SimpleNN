import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException 
    {
        dots();
    }

    private static void dots() 
    {
        FormDots f = new FormDots();
        
        new Thread(f).start();
    }
	}