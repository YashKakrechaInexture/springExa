package com.inexture.stackexa;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class CustomStack {
	private int array[];
	private int size;

	public CustomStack() {
		array = new int[1024];
		size = -1;
	}

	public void push(int number) {
		size++;
		array[size] = number;
	}
	
	public void pop() {
		if(size>=0) {
			size--;
		}
	}
	
	public void add(int index,int number) {
		if(index>size) {
			System.out.println("index out of bound.");
		}else {
			size++;
			for(int i=size ; i>=index ; i--) {
				if(i==index) {
					array[i] = number;
				}else {
					array[i] = array[i-1];
				}
			}
		}
	}
	
	public void remove(int index) {
		if(index>size) {
			System.out.println("index out of bound.");
		}else {
			for(int i=index ; i<size ; i++) {
				array[i] = array[i+1];
			}
			size--;
		}
	}
	
	public void swap(int index1,int index2) {
		if(index1>size || index2>size) {
			System.out.println("index out of bound.");
		}else {
			array[index1] = array[index1] + array[index2];
			array[index2] = array[index1] - array[index2];
			array[index1] = array[index1] - array[index2];
		}
	}
	
	public void replace(int index,int number) {
		if(index>size) {
			System.out.println("index out of bound.");
		}else {
			array[index] = number;
		}
	}
	
	@Override
	public String toString() {
		int arr[] = new int[size+1];
		
		for(int i=0; i<=size ; i++) {
			arr[i] = array[i];
		}
		
		return "Stack = " + Arrays.toString(arr) + "\n";
	}
	
	
}
