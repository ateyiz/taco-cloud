package tacos.data.interfaces;

import tacos.Ingredient;

public interface IngredientRepository {
	Iterable<Ingredient> findAll();
	
	Ingredient findONe(String id);
	
	Ingredient save(Ingredient ingredient);

}
