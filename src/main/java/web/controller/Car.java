package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Car {
    private String name;
    private String series;
    private int speed;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam String local) {
        String myTitle = null;
        if (local.contains("en")){
            myTitle = "Cars";
        }
        if (local.contains("ru")){
            myTitle = "Машины";
        }

        List<String> messages = new ArrayList<>();
        messages.add("Lexus");
        messages.add("Mazda");
        messages.add("Honda");
        model.addAttribute("messages", messages);
        model.addAttribute("myTitle" , myTitle);

        return "cars";
    }
}
