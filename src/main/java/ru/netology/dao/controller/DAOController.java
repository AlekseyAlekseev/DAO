package ru.netology.dao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.dao.repository.DAORepository;

@RestController
public class DAOController {

    DAORepository daoRepository;

    public DAOController(DAORepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return daoRepository.getProductName(name);
    }
}
