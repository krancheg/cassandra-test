package com.test.cassandrademo.controller;

import com.test.cassandrademo.model.EntityB;
import com.test.cassandrademo.repo.EntityBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entityB")
public class CreateNewEntityB {

    private final EntityBRepository entityBRepository;

    @Autowired
    public CreateNewEntityB(EntityBRepository entityBRepository) {
        this.entityBRepository = entityBRepository;
    }

    @GetMapping("/save")
    public Boolean saveNewEntityAHandler(@RequestParam String name, @RequestParam String description) {
        entityBRepository.insert(new EntityB(name,description));
        return true;
    }

    @GetMapping("/show")
    public List<EntityB> showAllEntities() {
        return entityBRepository.findAll();
    }

    @GetMapping("/show/{name}")
    public EntityB showAllEntities(@PathVariable String name) {
        return entityBRepository
                .findById(name)
                .orElse(new EntityB());
    }

}
