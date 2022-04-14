package com.inexture.challenge;

import java.util.List;
import java.util.Map;

public class Student {
	private Map<Integer,List<Integer>> answer;
	private List<List<Integer>> mark;

	public Student() {
		
	}

	public Student(Map<Integer, List<Integer>> answer) {
		this.answer = answer;
	}

	public Map<Integer, List<Integer>> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<Integer, List<Integer>> answer) {
		this.answer = answer;
	}

	public List<List<Integer>> getMark() {
		return mark;
	}

	public void setMark(List<List<Integer>> mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [answer=" + answer + ", mark=" + mark + "]";
	}
	
}
