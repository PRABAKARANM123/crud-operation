package com.example.Players;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.exception.PlayersNotFountException;

@Repository

public class PlayersDao {
	@Autowired
	PlayersRepository pr;
	public String post(List<Players> p) {
		pr.saveAll(p);
		return "Succesfully Posted";
	}
	public String post(Players p) {
		pr.save(p);
		// TODO Auto-generated method stub
		return "Succesfull";
	}
	public List<Players> getting() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}
	public Players getById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		return "Succesfully Deleted";
	}
	public String remove() {
		// TODO Auto-generated method stub
		pr.deleteAll();
		return "Deleted All";
	}
	public List<Players> getName(List<Players> p) {
		// TODO Auto-generated method stub
		return pr.findName(p);
	}
	public List<Players> getByName(String name) {
		// TODO Auto-generated method stub
		return pr.getByName(name);
	}
	
	public Players setPlayers(int id) {
		return pr.findById(id).orElseThrow(()-> new PlayersNotFountException());
	}
//	public List<Players> range(int age1, int age2) {
//		// TODO Auto-generated method stub
//		return pr.rang(age1, age2);
//	}

}
