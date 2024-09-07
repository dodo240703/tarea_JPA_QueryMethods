package com.example.tareagtics.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeesController {

    @GetMapping("/lista")
    public String showEmployees(Model model) {
        return "listaEmpleados";
    }
}
