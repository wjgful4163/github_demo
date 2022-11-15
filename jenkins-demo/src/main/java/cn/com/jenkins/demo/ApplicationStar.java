package cn.com.jenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApplicationStar {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStar.class, args);
    }

    /**
     * 健康检查页
     *
     * @return
     */
    @GetMapping(value = "/monitor")
    public String home() {
        return "OK - Version 1.0.0";
    }
}
