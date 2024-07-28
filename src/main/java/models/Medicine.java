package models;

import java.util.List;

public class Medicine {


    private Long id;
    private String brandName; // Nome comercial, ex: Dipirona

    private List<ActiveIngredient> activeIngredientList;
    private String dosage; // Dosagem
    private String frequency; // Frequência
    private String description; // D

}
