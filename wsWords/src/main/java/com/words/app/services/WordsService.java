package com.words.app.services;

import java.lang.StringBuilder;
import java.util.Random;
import com.words.app.entities.*;
public class WordsService {
	private static Random random = new Random();
	public static Result reverse(String word) throws Exception {
		int i = random.nextInt(100 - 1 + 1) + 1;
		Thread.sleep(i);
		return new Result("reverse",new StringBuilder(word).reverse().toString());
	}
	public static Result count(String word) throws Exception {
		int i = random.nextInt(100 - 1 + 1) + 1;
		Thread.sleep(i);
		return new Result("count",new Integer(word.length()).toString());
	}

}
