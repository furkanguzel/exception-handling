package com.furkanguzel.exceptionhandling.service;

import com.furkanguzel.exceptionhandling.dto.CarDto;
import com.furkanguzel.exceptionhandling.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final static List<CarDto> carList = new ArrayList<>();

    @PostConstruct
    public void init() {
        carList.add(new CarDto("Car A", "Brand 1"));
        carList.add(new CarDto("Car B", "Brand 2"));
        carList.add(new CarDto("Car C", "Brand 3"));
    }

    public CarDto getCar(String name) {
        if(name.startsWith("1")){
            throw new IllegalArgumentException();
        }
        return carList.stream().filter(item -> item.getName().equals(name)).findFirst()
                .orElseThrow(() -> new EntityNotFoundException(name ));
    }
}
