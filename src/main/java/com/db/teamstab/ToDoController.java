package com.db.teamstab;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ToDoController {
    private final RestTemplate restTemplate;

    public ToDoController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/{id}")
    public ModelAndView getTodoById(@RequestParam(value = "id", required = true) Integer id) {
        String url = "https://jsonplaceholder.typicode.com/todos/{id}";
        ToDo todo = this.restTemplate.getForObject(url, ToDo.class, id);

        ModelAndView modelAndView = new ModelAndView("details");
        modelAndView.addObject("todo", todo);

        return modelAndView;
//        return "todoDetails";
    }

}
