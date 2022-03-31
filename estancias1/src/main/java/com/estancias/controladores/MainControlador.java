
package com.estancias.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControlador {
    
     @GetMapping("index")
    public String index(){
        return "index";
    }
    
}
