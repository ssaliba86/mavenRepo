package com.example.demo.controller;

import com.example.demo.emp.Emp;
import com.example.demo.repo.EmpRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    final private EmpRepository empRepository;

    public Controller(final EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    @PostMapping("/addEmp")
    public String saveEmp(@RequestBody Emp emp) {
        empRepository.save(emp);
        return "Added successfully " + emp.getId();
    }

    @GetMapping("findAllEmp")
    public List<Emp> getEmps() {
        return empRepository.findAll();
    }

    @GetMapping("/findEmp/{id}")
    public Optional<Emp> getEmp(@PathVariable int id) {
        return empRepository.findById(id);
    }

    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id) {
        empRepository.deleteById(id);
        return "Delete successfully" + id;
    }

}
