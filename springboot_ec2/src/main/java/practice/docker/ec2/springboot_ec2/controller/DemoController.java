package practice.docker.ec2.springboot_ec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test_demo_docker_ec2")
    public String getDemo(){

        return "return from springboot docker container on ec2 ";
    }
}
