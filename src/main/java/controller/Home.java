package controller;

import model.BlogReaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @Autowired
    BlogReaction blogReaction;
    @GetMapping("/home")
    public ModelAndView getHome() {
        System.out.println(blogReaction.getContent());
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("sy", 1);
        return modelAndView;
    }

    @Bean
    public BlogReaction blogReaction(){
        return new BlogReaction(1, 2, "nove");
    }
    @GetMapping("/")
    public ModelAndView showHome() {
        return new ModelAndView("/home");
    }
}
