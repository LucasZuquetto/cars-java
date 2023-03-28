package com.example.postapi.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postapi.DTO.CarsDTO;

@RestController
@RequestMapping("/cars")
public class carsController {
    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        System.out.println("modelo = "+req.modelo());
        System.out.println("fabricante = "+req.fabricante());
        System.out.println("data de fabricação = "+req.dataFabricacao());
        System.out.println("valor = "+req.valor());
        System.out.println("ano do modelo = "+req.anoModelo());
    }
}
