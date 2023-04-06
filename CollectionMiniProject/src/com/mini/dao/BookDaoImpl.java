package com.mini.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.mini.pojo.Book;




public class BookDaoImpl implements BookDAO {
	ArrayList<Book> blist=new ArrayList<>();
	
	int id=101;

	@Override
	public boolean addBook(Book b) {
		if(b!=null) {
			b.setId(id);
			blist.add(b);
			id=id+2;
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBook(Book b) {
		for(int i=0; i<blist.size(); i++) {
			Book b1=blist.get(i);
			if(b1.getId()==b.getId()) {
				blist.set(i, b);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteBook(int id) {
		Iterator<Book> i=blist.iterator();
		while(i.hasNext()) {
			Book b1=i.next();
			if(b1.getId()==id) {
				i.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public Book showById(int id) {
		for(int i=0; i<blist.size(); i++) {
			Book b1=blist.get(i);
			if(b1.getId()==id) {
				return b1;
			}
		}
		return null;
	}

	@Override
	public Book showByName(String name) {
		for(int i=0; i<blist.size(); i++) {
			Book b1=blist.get(i);
			if(b1.getName().equals(name)) {
				return b1;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> showAllBooks() {
		if(blist.isEmpty())
		return null;
		else
			return blist;
	}
	
	
	
	

}