package com.example.palindrome.dao;

import com.example.palindrome.entity.PalindromeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PalindromeRepository extends JpaRepository<PalindromeEntity, Integer>{

}
