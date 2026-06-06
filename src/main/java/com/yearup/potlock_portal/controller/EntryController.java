package com.yearup.potlock_portal.controller;

import com.yearup.potlock_portal.model.Entry;
import com.yearup.potlock_portal.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/entries")
@CrossOrigin(origins = "*")
public class EntryController {

    @Autowired
    private EntryRepository repository;

    // GET - Connor gets all entries
    @GetMapping
    public List<Entry> getAllEntries() {
        return repository.findAll();
    }

    // POST - Connor adds new entry
    @PostMapping
    public Entry createEntry(@RequestBody Entry entry) {
        return repository.save(entry);
    }

    // PUT - Connor updates an entry
    @PutMapping("/{id}")
    public Entry updateEntry(@PathVariable String id, 
                             @RequestBody Entry entry) {
        entry.setId(id);
        return repository.save(entry);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable String id) {
        repository.deleteById(id);
    }
}
