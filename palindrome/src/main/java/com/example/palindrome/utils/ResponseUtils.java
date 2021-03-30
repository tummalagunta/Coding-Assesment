package com.example.palindrome.utils;

import com.example.palindrome.exception.ResponseMessage;
import com.example.palindrome.exception.ServiceException;

import java.util.Collection;
import java.util.Optional;

public class ResponseUtils {

    public static Object orElseGet(Optional optional){
        if(!optional.isPresent()){
            throw new ServiceException(ResponseMessage.DATA_NOT_FOUND);
        }
        return optional.get();
    }

    public static Object orElseGet(Collection collection){
        if(collection.isEmpty()){
            throw new ServiceException(ResponseMessage.DATA_NOT_FOUND);
        }
        return collection;
    }
}
