package me.jmll.utm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController
{
    /**
     * Ruta principal del programa, en ella se ejecutara el dashboard del aplicativo
     * MicroMatt estuvo aqui
     */
    @RequestMapping("/")
    public View index() {
        return new RedirectView("/dashboard/home", true, false);
    }
}
