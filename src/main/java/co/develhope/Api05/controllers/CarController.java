package co.develhope.Api05.controllers;

import co.develhope.Api05.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RequestMapping("/cars")
@RestController
public class CarController {


    @GetMapping()
    public CarDTO carResponse(){
        return new CarDTO("1", "cabrio", 3453);
    }

    @PostMapping()
    public int getBodysCar(@Valid @RequestBody(required = false) CarDTO carDTO, HttpServletResponse response){
        return response.getStatus();
    }
}
