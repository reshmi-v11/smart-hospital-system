package com.hospital.controller;

import com.hospital.model.Bed;
import com.hospital.service.BedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beds")
@CrossOrigin
public class BedController {

    private final BedService service;

    public BedController(BedService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bed> getBeds() {
        return service.getAllBeds();
    }

    @PostMapping
    public Bed addBed(@RequestBody Bed bed) {
        return service.saveBed(bed);
    }
}
