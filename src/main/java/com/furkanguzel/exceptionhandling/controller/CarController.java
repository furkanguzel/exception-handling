package com.furkanguzel.exceptionhandling.controller;

import com.furkanguzel.exceptionhandling.dto.CarDto;
import com.furkanguzel.exceptionhandling.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<CarDto> getCar(@RequestParam String name){
        return ResponseEntity.ok(carService.getCar(name));
    }

    /* Local Exception Handler
    @ExceptionHandler({EntityNotFoundException.class})
    public String entityNotFound() {
        return "Record not found";
    }
    */

}
