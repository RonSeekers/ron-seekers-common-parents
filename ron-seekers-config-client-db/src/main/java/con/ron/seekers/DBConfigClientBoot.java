package con.ron.seekers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DBConfigClientBoot {
    public static void main(String[] args) {
        SpringApplication.run(DBConfigClientBoot.class);
    }

    @RefreshScope
    @RestController
    class TestController {

        @Value("${com.didispace.message}")
        private String message;

        @GetMapping("/test")
        public String test() {
            return message;
        }

    }

}
