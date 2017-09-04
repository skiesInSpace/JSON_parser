package TreeModel;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artur_Barkou on 9/4/2017.
 */
public class Main {
    public static void main(String[] args) {
        String path = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        JsonNode rootNode=null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            rootNode = objectMapper.readTree(new File(path + "/example.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JsonNode nodeName = rootNode.path("name");
        String lastName = nodeName.path("last").textValue();
        System.out.println(lastName);

        // use put for data inserting
    }
}
