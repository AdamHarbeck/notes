package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Task;
import com.revature.models.User;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	List<Task> findAllByUsers_Id(int id);
}
