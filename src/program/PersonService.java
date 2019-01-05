package program;

import java.io.*;

public class PersonService {

    public static void savePerson(Person obj, String filePath)
    {
        try {
            FileOutputStream p1 = new
                    FileOutputStream(filePath);
            ObjectOutputStream s = new
                    ObjectOutputStream(p1);

            s.writeObject(obj);

            s.close();
        }catch (Exception e){
            System.err.println(e);
        }

    }

    public static Person loadPerson(String filePath)
    {
        try {
            FileInputStream p2 = new
                    FileInputStream(filePath);
            ObjectInputStream s = new
                    ObjectInputStream(p2);

            Person obj = (Person) s.readObject();

            return obj;
        }catch (Exception e)
        {
            return null;
        }
    }

}
