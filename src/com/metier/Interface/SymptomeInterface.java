package com.metier.Interface;

import java.util.List;

import com.metier.entities.Symtome;

public interface SymptomeInterface {
	
	public void create_symptome(Symtome symptome);
	public void update_symptome(Symtome symptome);
	public void delete_symptome(Symtome symptome);
	public Symtome find_symptome(int symptome_id);
	public List<Symtome> list_symptome();
}
