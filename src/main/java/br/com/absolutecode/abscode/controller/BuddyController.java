package br.com.absolutecode.abscode.controller;

import br.com.absolutecode.abscode.model.Buddy;
import br.com.absolutecode.abscode.service.BuddyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/buddy")
public class BuddyController {

    @Autowired
    private BuddyService buddyService;

    @GetMapping()
    public List<Buddy> getAll(){
        return buddyService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Buddy> getById(@PathVariable Long id){
        Optional<Buddy> buddy = buddyService.getById(id);
        return buddy.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Buddy create(@RequestBody Buddy buddy){
        return buddyService.create(buddy);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        buddyService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
