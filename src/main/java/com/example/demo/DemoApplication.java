package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/resource")
  @ResponseBody
  public Map<String, Object> home() {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    return model;
  }


  @GetMapping("/new")
  @ResponseBody
  public Map<String, Object> newData() {
	  Map<String, Object> model = new HashMap<>();
	  model.put("id", "12345");
	  model.put("content", "Otra prueba");
	  return model;
  }

  @GetMapping("/test2")
  @ResponseBody
  public Map<String, Object> test() {
    return new HashMap<String,Object>() {{
      put("id", "54321");
      put("content", "test2");
    }};
  }
}
