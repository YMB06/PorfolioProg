package com.youssef.porfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*esta clase de java va a ser un controlador, por ser controlador su funcion exclusiva
es recibir peticiones http tipo GET, PATCH, POST, DELETE*/ 
// Framework --> mvc, decoradores
// el decorador del framework()SPB @controller dota a la clase para recibir peticiones HTTP
@Controller
public class HomeController {
    // con este decorador tomcat va a ejecutar la raiz del sitio 
    // y va a interpretar el index.html
    @GetMapping("/")
    public String home(){
        return "/www/site/index";
    }
    
    @GetMapping("/form")
    public String qSomos(){
        return "/www/site/form";
    }
    
    @GetMapping("/Contacto")
    public String contacto(){
        return "/www/site/Contacto";
    }
}
