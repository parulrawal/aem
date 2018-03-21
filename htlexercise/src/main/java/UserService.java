import org.apache.sling.scripting.sightly.pojo.Use;


import javax.script.Bindings;
import java.util.HashMap;
import java.util.Map;

public class UserService implements Use {

    private Map<String, String> map;

    @Override
    public void init(Bindings bindings) {

        map = new HashMap<String, String>();

        map.put("1", "aajk");
        map.put("2" , "kjkjbka");
        map.put("3" , "bcuisds");
        map.put("4" , "jkbdfsb");
        map.put("5" , "jbkevl");
        map.put("6" , "vjfdk");

    }

    public Map<String, String> getMap() {
        return map;
    }
}

