package com.mathops.app.services;
import com.mathops.app.entities.*;

public class OptsService {

	public static Result add(int a, int b){
		return new Result(a+"+"+b,Integer.toString(a+b));
	}
	public static Result sust(int a, int b){
		return new Result(a+"-"+b,Integer.toString(a-b));
	}
	public static Result mult(int a, int b){
		return new Result(a+"*"+b,Integer.toString(a*b));
	}
	public static Result div(int a, int b){
		return new Result(a+"/"+b,Double.toString(a/b));
	}




}
