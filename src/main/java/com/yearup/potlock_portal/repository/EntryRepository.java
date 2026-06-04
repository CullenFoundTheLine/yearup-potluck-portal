package com.yearup.potlock_portal.repository;

import com.yearup.potlock_portal.model.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository 
    extends MongoRepository<Entry, String> {
    
    // Spring automatically gives you:
    // findAll()      - get all entries
    // findById()     - get one entry
    // save()         - create or update
    // deleteById()   - delete one entry
}
