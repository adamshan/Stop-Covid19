package com.metier.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.metier.Interface.SymptomeInterface;
import com.metier.entities.SingletonConnecction;
import com.metier.entities.Symtome;

public class SymptomeImpl implements SymptomeInterface{

	//recovery of the connection to the database
	Connection connection = SingletonConnecction.getConnexion();
	
	@Override
	public void create_symptome(Symtome symptome) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = connection.prepareStatement("insert into SYMPTOMS(name,description) values (?,?)");
			ps.setString(1, symptome.getName());
			ps.setString(2, symptome.getDescription());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update_symptome(Symtome symptome) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = connection.prepareStatement("update SYMPTOMS set name = ? , description = ? where id=?");
			ps.setString(1, symptome.getName());
			ps.setString(2, symptome.getDescription());
			ps.setInt(3, symptome.getId());
			ps.executeUpdate();
			System.out.println("la modification c bien passer");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete_symptome(Symtome symptome) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = connection.prepareStatement("delete from SYMPTOMS where id=?");
			ps.setInt(1, symptome.getId());
			ps.executeUpdate();
			System.out.println("la suppression c bien passer");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public Symtome find_symptome(int symptome_id) {
		// TODO Auto-generated method stub
		Symtome symptome = null;
		try {
			PreparedStatement ps = connection.prepareStatement("select * from SYMPTOMS where id=?");
			ps.setInt(1, symptome_id);
			
			//results recovery
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//if the object exist in the database
				symptome = new Symtome();
				
				//attribute recovery
				symptome.setId(rs.getInt("id"));
				symptome.setName(rs.getString("name"));
				symptome.setDescription(rs.getString("description"));
				
				System.out.println("success");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return symptome;
	}

	@Override
	public List<Symtome> list_symptome() {
		// TODO Auto-generated method stub
		List<Symtome> list_symptome = new ArrayList<Symtome>();
		Symtome symptome = null;
		try {
			PreparedStatement ps = connection.prepareStatement("select * from SYMPTOMS");
			
			//results recovery
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				//if the object exist in the database
				symptome = new Symtome();
				
				//attribute recovery
				symptome.setId(rs.getInt("id"));
				symptome.setName(rs.getString("name"));
				symptome.setDescription(rs.getString("description"));
				
				list_symptome.add(symptome);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return list_symptome;

	}

}
