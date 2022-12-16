package com.example.Players;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class PlayersService {
	@Autowired
	PlayersDao pd;
	
	

	public String post(List<Players> p) {
		// TODO Auto-generated method stub
		return pd.post(p);
	}



	public String put(Players p) {
		// TODO Auto-generated method stub
		return pd.post(p);
	}



	public List<Players> getting() {
		// TODO Auto-generated method stub
		return pd.getting();
	}



	public Players getById(int id) {
		// TODO Auto-generated method stub
		return pd.getById(id);
	}




	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return pd.deleteById(id);
	}



	public String remove() {
		// TODO Auto-generated method stub
		return pd.remove();
	}



	public List<Players> getName(List<Players> p) {
		// TODO Auto-generated method stub
		return pd.getName(p);
	}



	public List<Players> getByName(String name) {
		// TODO Auto-generated method stub
		return pd.getByName(name);
	}



//	public List<Players> rang(int age1, int age2) {
//		// TODO Auto-generated method stub
//		return pd.range( age1, age2);
//	}

	
	

}
