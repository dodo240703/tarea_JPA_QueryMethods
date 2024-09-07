package com.example.tareagtics.Controllers;

import com.example.tareagtics.Models.Entities.Employee;
import com.example.tareagtics.Models.Entities.Job;
import com.example.tareagtics.Models.Repositories.EmployeeRepository;
import com.example.tareagtics.Models.Repositories.JobRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeesController {

    final EmployeeRepository employeesRepository;
    final JobRepository employeesJobRepository;

    public EmployeesController(EmployeeRepository employeesRepository, JobRepository employeesJobRepository) {
        this.employeesRepository = employeesRepository;
        this.employeesJobRepository = employeesJobRepository;
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
        List<Job> listaJobs = employeesJobRepository.findAll();
        model.addAttribute("listaJobs", listaJobs);
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

    @GetMapping("/borrar")
    public String borrarEmpleado(Model model, @RequestParam("idEmployee") int id, RedirectAttributes redirectAttributes) {
        try {
            employeesRepository.deleteById(id);
            redirectAttributes.addFlashAttribute("mensaje", "Se borró el empleado");
            redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("mensaje", "No se pudo borrar el empleado");
            redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        }
        return "redirect:/employee/listar";
    }
}
