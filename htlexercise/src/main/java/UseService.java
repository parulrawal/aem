import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.script.Bindings;
import javax.servlet.ServletRequest;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.scripting.sightly.pojo.Use;

public class UseService  implements Use{

    ServletRequest req ;
    List<Resource> childs=new ArrayList<>();
    @Override
    public void init(Bindings arg0) {
         req = (ServletRequest) arg0.get("request");
         ResourceResolver resolver=(ResourceResolver) arg0.get("resolver");
         Resource r=resolver.getResource(req.getParameter("path"));
         Iterator<Resource> res=r.listChildren();
        while(res.hasNext()) {
            childs.add(res.next());
        }
    }
   
    public List<Resource> getChild(){
        return childs;
    }

}


