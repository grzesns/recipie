package gns.software.recipie.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipieNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipieNotes() {
        return recipieNotes;
    }

    public void setRecipieNotes(String recipieNotes) {
        this.recipieNotes = recipieNotes;
    }


}
