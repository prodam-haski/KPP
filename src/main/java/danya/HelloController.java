package danya;
import com.fasterxml.jackson.databind.util.JSONPObject;

import com.sun.tools.javac.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;


@RestController
    public class HelloController {

        @RequestMapping(value="/",method = RequestMethod.POST)
        public String index(@RequestBody List<Information> value) {

            java.util.List<Integer> list =  value.stream().map(x->x.getResult()).collect(Collectors.toList());

            return "Greetings from Spring Boot!"+list.toString();
        }
    }

