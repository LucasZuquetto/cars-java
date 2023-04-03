package com.example.postapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postapi.DTO.CarsDTO;
import com.example.postapi.models.Cars;
import com.example.postapi.repositories.CarsRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarsRepository repository;

    @GetMapping
    public List<Cars> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody @Valid CarsDTO req) {
        repository.save(new Cars(req));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid CarsDTO req){
        repository.findById(id).map(car -> {
            car.setAnoModelo(req.anoModelo());
            car.setDataFabricacao(req.dataFabricacao());
            car.setFabricante(req.fabricante());
            car.setValor(req.valor());
            car.setModelo(req.modelo());
            return repository.save(car);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
