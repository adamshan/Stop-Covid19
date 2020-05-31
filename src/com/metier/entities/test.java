package com.metier.entities;

import java.util.List;

import com.metier.implementation.SymptomeImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymptomeImpl symptomeImpl = new SymptomeImpl();

		
		//creating a symptom
		Symtome symptome = new Symtome("toux sec");
		symptome.setDescription("la toux est une maladie");
		//symptomeImpl.create_symptome(symptome);
		
		//updating a symptom
		symptome.setId(2);
		symptome.setName("nouvelle toux");
		symptome.setDescription("la toux n'est pas cool");
		//symptomeImpl.update_symptome(symptome);
		
		//deleting a symptom
		//symptomeImpl.delete_symptome(symptome);
		
		//symptom research
		//Symtome sym = symptomeImpl.find_symptome(2);
		//System.out.println("le nom est:"+sym.getName()+ " et la description est:"+sym.getDescription());
		
		//listing symptoms
		List<Symtome> listSymptome = symptomeImpl.list_symptome();
		//parcours de chaque symptome de la liste et on affiche
		for(Symtome s: listSymptome) {
			System.out.println("le nom est: " +s.getName()+ " et la description est: " +s.getDescription());
		}

	}

}
