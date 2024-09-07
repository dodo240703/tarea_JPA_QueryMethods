package com.example.tareagtics.Controllers;

import com.example.tareagtics.Models.Entities.Employee;
import com.example.tareagtics.Models.Repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeesController {

    final EmployeeRepository employeesRepository;

    public EmployeesController(EmployeeRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }


    @GetMapping("/listar")
    public String showEmployees(Model model) {
        List<Employee> listaEmployees = employeesRepository.findAll();
        model.addAttribute("listaEmployees", listaEmployees);
        return "listaEmpleados";
    }
}
