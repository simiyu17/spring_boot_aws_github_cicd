package com.crud.spring_boot_aws_github_cicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/v1/hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hello From CI/CD !!!!!!!!!!!!", HttpStatus.OK);
    }
}
