package com.prodapt.restcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.restcontroller.client.BookClient;
import com.prodapt.restcontroller.model.Book;

@RestController
@RequestMapping("/bookapiclient")
public class BookClientController {
	@Autowired
	private BookClient bookClient;
	
	//http://localhost:8081/bookapiclient/allbooks
	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		return bookClient.getAllBooks();
	}
}