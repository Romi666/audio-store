package com.enigmacamp.audiostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enigmacamp.audiostore.entity.userEntity;

public interface userRepository extends JpaRepository<userEntity, Long> {
	
}
