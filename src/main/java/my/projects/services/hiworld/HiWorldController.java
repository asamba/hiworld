package my.projects.services.hiworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asamba on 8/31/19.
 */
@RestController
public class HiWorldController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi World!";
    }

}
