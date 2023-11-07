package global.goit.edu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Human denis = new Human("Denis", "Bunak");
        Gson json = new GsonBuilder().setPrettyPrinting().create();
        String denisJson = json.toJson(denis);
        System.out.println(denisJson);
    }
}