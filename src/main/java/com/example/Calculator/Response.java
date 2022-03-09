package com.example.Calculator;

public class Response {
	
	private int x;
	private int y;
	
	private int result;

	// Constructor
	public Response(int x, int y, int result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}
	
	// Getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getResult() {
		return result;
	}
}
