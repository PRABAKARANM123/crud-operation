 package com.example.Players;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayersRepository extends JpaRepository<Players, Integer>{
	
	@Query(value="select * from Players",nativeQuery=true)
	List<Players> findName(List<Players> p);
    
	@Query(value="select * from Players where name like %:name%",nativeQuery=true)


//    @Query(value="select * from Players where name like ?",nativeQuery=true)
	List<Players> getByName(String name);

	
//	@Query(value=select * from Players where age>? and age<? nativeQuery=true)
//	List<Players> rang(int age1, int age2);
//    
    
}
