package com.hospital.service;

import com.hospital.model.Bed;
import com.hospital.repository.BedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedService {

    private final BedRepository repo;

    public BedService(BedRepository repo) {
        this.repo = repo;
    }

    public List<Bed> getAllBeds() {
        return repo.findAll();
    }

    public Bed saveBed(Bed bed) {
        return repo.save(bed);
    }
}
