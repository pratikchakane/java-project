package com.mini.dao;

import java.util.ArrayList;

import com.mini.pojo.Book;



public interface BookDAO {
	public boolean addBook(Book b);
	public boolean updateBook(Book b);
	public boolean deleteBook(int id);
	
	public Book showById(int id);
	public Book showByName(String name);
	public ArrayList<Book> showAllBooks();

}