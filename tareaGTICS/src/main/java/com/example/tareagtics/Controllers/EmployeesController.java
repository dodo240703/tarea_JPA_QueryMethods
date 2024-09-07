package com.example.tareagtics.Controllers;

import com.example.tareagtics.Models.Entities.Employee;
import com.example.tareagtics.Models.Repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/editar")
    public String editarEmployees(Model model,
                                  @RequestParam("idEmployee") int id) {
        Optional<Employee> optionalEmployee = employeesRepository.findById(id);

        if(optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            model.addAttribute("employee", employee);
            return "infoEmpleado";
        }else{
            return "redirect:/employee/listar";
        }
    }

    @PostMapping("/guardar")
    public String guardar (Employee employee) {
        employeesRepository.save(employee);
        return "redirect:/employee/listar";
    }


}
