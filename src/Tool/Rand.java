package Tool;
import java.util.UUID;

public class Rand {

    public static String generateShortUUID() {

        String uuid = UUID.randomUUID().toString().replace("-", "");

        return uuid;
    }

}
