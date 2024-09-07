/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.stw2.lab3.controller;

/**
 *
 * @author Oscar A. Díaz Barriga
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

 @RequestMapping(value = "/", method = RequestMethod.GET)
    public String irAlMain() {
        return "redirect:/employee";
    }
    
}

