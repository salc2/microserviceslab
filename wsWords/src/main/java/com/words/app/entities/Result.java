package com.words.app.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Result {
	public final String operation;
	public final String result;
	public Result(String operation,String result){
		this.operation = operation;
		this.result = result;
	}


}
