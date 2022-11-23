package org.lyd.openshift.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/sayhello")
    public String sayHello()
    {
        return "Hello there!";
    }
}
