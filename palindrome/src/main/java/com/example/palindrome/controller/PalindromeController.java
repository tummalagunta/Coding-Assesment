package com.example.palindrome.controller;

import com.example.palindrome.entity.PalindromeEntity;
import com.example.palindrome.model.PalindromeRequest;
import com.example.palindrome.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("palindrome")
public class PalindromeController {
	
	@Autowired
	PalindromeService palindromeService;
	
	@PostMapping
	public @ResponseBody PalindromeEntity savePalindrome(@Valid @RequestBody PalindromeRequest palindromeRequest){
		return palindromeService.savePalindrome(palindromeRequest);
	}
	
	@GetMapping("/all")
	public @ResponseBody List<PalindromeEntity> getAllPalindrome(){
		return palindromeService.getAllPalindrome();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody PalindromeEntity getPalindromeById(@PathVariable(value = "id") String id){
		return palindromeService.getPalindromeById(Integer.parseInt(id));
	}
}