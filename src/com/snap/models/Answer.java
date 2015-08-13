package com.snap.models;

public class Answer {// Answer/choice
	private int ansId; // answer id
	private int qId; // corresponding question id
	String cValue; // choice value
	

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getcValue() {
		return cValue;
	}

	public void setcValue(String cValue) {
		this.cValue = cValue;
	}
}
