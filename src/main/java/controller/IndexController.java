package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by kfrak on 20.01.2019.
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index", "index.html"})
    private String showIndexPage(Model model, HttpServletRequest request){
        model.addAttribute("user", request.getRemoteUser());
        return "index";
    }
}
