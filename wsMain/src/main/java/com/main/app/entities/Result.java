package com.main.app.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Result {
	private String operation;
	private String result;
	public Result(String operation,String result){
		this.operation = operation;
		this.result = result;
	}
	public Result(){}

	public String getOperation(){
		return operation;
	}
	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}
	public void setOperation(String operation){
		this.operation = operation;
	} 



}
