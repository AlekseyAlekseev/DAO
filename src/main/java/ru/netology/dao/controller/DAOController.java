package ru.netology.dao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dao.repository.DAORepository;

@RestController
public class DAOController {

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return DAORepository.getProductName(name);
    }

//    @GetMapping("/products/fetch-product")
//    public String getProductName() {
//        return DAORepository.read("select.sql");
//    }
}
