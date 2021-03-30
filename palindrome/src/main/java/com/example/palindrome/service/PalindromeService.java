package com.example.palindrome.service;

import com.example.palindrome.entity.PalindromeEntity;
import com.example.palindrome.model.PalindromeRequest;

import java.util.List;

public interface PalindromeService {
    List<PalindromeEntity> getAllPalindrome();

    PalindromeEntity savePalindrome(PalindromeRequest palindromeRequest);

    PalindromeEntity getPalindromeById(Integer id);
}
