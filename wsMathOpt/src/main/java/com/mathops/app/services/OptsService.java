package com.mathops.app.services;
import com.mathops.app.entities.*;

import java.util.Random;
public class OptsService {
	private static Random random = new Random();
	public static Result add(int a, int b) throws Exception {
		int i = random.nextInt(100 - 1 + 1) + 1;
		Thread.sleep(i);
		return new Result(a+"+"+b,Integer.toString(a+b));
	}
	public static Result sust(int a, int b) throws Exception {
		int i = random.nextInt(100 - 1 + 1) + 1;
		Thread.sleep(i);
		return new Result(a+"-"+b,Integer.toString(a-b));
	}
	public static Result mult(int a, int b) throws Exception {
		int i = random.nextInt(100 - 1 + 1) + 1;
		Thread.sleep(i);
		return new Result(a+"*"+b,Integer.toString(a*b));
	}
	public static Result div(int a, int b) throws Exception {
		int i = random.nextInt(100 - 1 + 1) + 1;
		Thread.sleep(i);
		return new Result(a+"/"+b,Double.toString(a/b));
	}




}
