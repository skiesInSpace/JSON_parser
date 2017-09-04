package StreamingAPI;




import DataBinding.User;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artur_Barkou on 9/4/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String path = User.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        JsonFactory f = new JsonFactory();
        JsonParser g=null;
        try {
             g = f.createParser(new File(path + "/example.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
