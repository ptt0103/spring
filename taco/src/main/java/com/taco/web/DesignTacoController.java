package com.taco.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.taco.Ingredient;
import com.taco.Ingredient.Type;
import com.taco.Taco;
import com.taco.database.IngredientRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	private RestTemplate rest = new RestTemplate();
	
	@ModelAttribute 
	public void addIngredientsToModel(Model model) {
		List <Ingredient> ingredients =  Arrays.asList(rest.getForObject("http://localhost:8080/ingredients",Ingredient[].class));
		


		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}
	}
	@GetMapping 
	public String showDesinForm(Model model) {
		model.addAttribute("taco", new Taco());
		return "design";
	}
	
	public List<Ingredient> filterByType(List <Ingredient> ingredients, Type type){
		List <Ingredient> ingList = new ArrayList<>();
		for(Ingredient ingredient : ingredients) {
			if(ingredient.getType().equals(type)) {
				ingList.add(ingredient);
			}
		}
		return ingList;
	}
	
	@PostMapping
	public String processDesign(@Valid Taco taco, Errors errors) {
		if (errors.hasErrors()) {
			return "design";
		}
		log.info("Processing design " + taco);
		return "redirect:/orders/current";
	}
}
