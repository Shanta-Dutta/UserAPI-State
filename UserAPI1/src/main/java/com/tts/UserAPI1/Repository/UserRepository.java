package com.tts.UserAPI1.Repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.UserAPI1.Model.User;



@Repository
	public interface UserRepository extends CrudRepository<User,Long> {

//	@Query("select u from user u where u.state=?1")
//	List<User> findByState(String state);
	User findById(long id);
	
	
	List<User> findByState(String state);
		    
	    
	    
}
