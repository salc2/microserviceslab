package com.main.app.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class FinalResult {
	private Result wordOpt;
	private Result mathOpt;

	public FinalResult(Result wordOpt, Result mathOpt){
		this.wordOpt = wordOpt;
		this.mathOpt = mathOpt;	
	}
	public Result getWordOpt(){
		return wordOpt;
	}
	public void setWordOpt(Result wordOpt){
		this.wordOpt = wordOpt;		
	}


	public Result getMathOpt(){
		return mathOpt;
	}
	public void setMathOpt(Result mathOpt){
		this.mathOpt = mathOpt;		
	}


}
