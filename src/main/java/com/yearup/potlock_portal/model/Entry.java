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
    // What they're bringing
    private List<String> categories; // Food, Drink, Utensil, Misc

    // Food fields
    private String foodItem;
    private String foodType;
    private int servings;
    private List<String> allergies;

    // Drink fields
    private String drinkItem;       // Water, Juice, Soda
    private String drinkType;       // flavor/type
    private String packSize;        // 12 or 24 pack (for soda)
    private int drinkQuantity;

    private String notes;
}
