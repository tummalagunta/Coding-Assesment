package com.example.palindrome.service.impl;

import com.example.palindrome.dao.PalindromeRepository;
import com.example.palindrome.entity.PalindromeEntity;
import com.example.palindrome.exception.ResponseMessage;
import com.example.palindrome.exception.ServiceException;
import com.example.palindrome.model.PalindromeRequest;
import com.example.palindrome.service.PalindromeService;
import com.example.palindrome.utils.ResponseUtils;
import com.example.palindrome.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PalindromeServiceImpl implements PalindromeService {
	
	@Autowired
	PalindromeRepository palindromeRepository;

	/**
	 *
	 * @return
	 */
	@Override
	public List<PalindromeEntity> getAllPalindrome() {
		return (List<PalindromeEntity>) ResponseUtils.orElseGet(palindromeRepository.findAll());
	}

	/**
	 *
	 * @param palindromeRequest
	 */
	@Override
	public PalindromeEntity savePalindrome(PalindromeRequest palindromeRequest) {
		if(!Utils.isPalindrome(palindromeRequest.getName())){
			throw new ServiceException(ResponseMessage.NOT_A_PALINDROME);
		}
		PalindromeEntity palindromeEntity = new PalindromeEntity();
		palindromeEntity.setName(palindromeRequest.getName());
		palindromeEntity = palindromeRepository.save(palindromeEntity);
		return palindromeEntity;
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@Override
	public PalindromeEntity getPalindromeById(Integer id) {
		Optional<PalindromeEntity> palindromeEntityOptional = palindromeRepository.findById(id);
		return (PalindromeEntity) ResponseUtils.orElseGet(palindromeEntityOptional);
	}

}
