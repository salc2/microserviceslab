package com.words.app.services;

import java.lang.StringBuilder;

import com.words.app.entities.*;
public class WordsService {
	public static Result reverse(String word){
		return new Result("reverse",new StringBuilder(word).reverse().toString());
	}
	public static Result count(String word){
		return new Result("count",new Integer(word.length()).toString());
	}

}
