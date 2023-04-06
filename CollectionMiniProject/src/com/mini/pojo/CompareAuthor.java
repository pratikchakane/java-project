package com.mini.pojo;

//package BookProject;

import java.util.*;

public class CompareAuthor implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
	

}
