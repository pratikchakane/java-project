package com.mini.pojo;


//package BookProject;

import java.util.*;

public class ComparePrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPrice()-o2.getPrice());
	}
	

}