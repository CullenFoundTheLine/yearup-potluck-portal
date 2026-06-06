package com.yearup.potlock_portal.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document(collection = "entries")
public class Entry {

    @Id
    private String id;

    private String name;
    private String email;
    private boolean attending;
    private String foodItem;
    private String foodType;
    private int servings;
    private List<String> allergies;
    private String notes;

}
