package com.example.miniprojet.Repository;

import com.example.miniprojet.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepo  extends JpaRepository<User,Integer> {

}
