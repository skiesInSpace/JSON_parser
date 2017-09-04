package DataBinding;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Artur_Barkou on 9/4/2017.
 */
public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String path = User.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        User user = null;
        try {
            user = objectMapper.readValue(new File(path + "/example.json"), User.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(user.getName().getFirst());
        System.out.println(user.getGender());
        System.out.println(user.isVerified());
    }
}
