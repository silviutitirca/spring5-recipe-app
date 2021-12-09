package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author Silviu_Titirca on 12/9/2021
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idExpectedValue = 4l;
        category.setId(idExpectedValue);
        assertEquals(idExpectedValue, category.getId());
    }

    @Test
    public void getDescription() {
        String descriptionExpectedValue = "Romanian dish";
        category.setDescription(descriptionExpectedValue);
        assertEquals(descriptionExpectedValue, category.getDescription());
    }

    @Test
    public void getRecipes() {
        Set<Recipe> recipesExpected = new HashSet<>();
        category.setRecipes(recipesExpected);
        assertEquals(recipesExpected.size(), category.getRecipes().size());
    }
}