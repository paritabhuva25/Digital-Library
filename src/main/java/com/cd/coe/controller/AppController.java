package com.cd.coe.controller;



import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cd.coe.model.User;
import com.cd.coe.model.Author;
import com.cd.coe.model.Book;
import com.cd.coe.model.Category;
import com.cd.coe.model.Edition;
import com.cd.coe.model.Publisher;
import com.cd.coe.service.BookService;
import com.cd.coe.service.UserService;


@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	UserService service;
	@Autowired
	BookService service2;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/","/login" }, method = RequestMethod.GET)
	public String loginUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
//		model.addAttribute("message",message)
		return "login";
	}
	
		@RequestMapping(value = { "/" ,"/login"}, method = RequestMethod.POST)
	public String entryUser(HttpServletRequest request, @Valid User user, BindingResult result,
			ModelMap model) {
		System.out.println(user);
		
		
		
		boolean userExists = service.checkLogin(user.getUsername(),
                user.getUserPwd());
		if(userExists){
			model.put("user", user);
			System.out.println("Success!!!!");
			return "homepage";
		}else{
			System.out.println("Failure!!!!");
			String msg = "Incorrect User!";
			request.setAttribute("error-msg", msg);
			request.setAttribute("error", Boolean.TRUE);
			//model.put("error", msg);
			return "login";
		}
		}
		
	
		
		
	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "loginWrong";
		}

		
		service.saveUser(user);

		model.addAttribute("success", "user" +user.getUserFirstName() + " registered successfully");
		return "redirect:/login";
	}

	@RequestMapping(value = { "/add-book" }, method = RequestMethod.GET)
	public String newBook(ModelMap model) {
		Book book= new Book();
		//Publisher publisher = new Publisher();
		Category category = new Category();
		//Edition edition = new Edition();
		System.out.println("in get method");
		model.addAttribute("book", book);
	//	model.addAttribute("publisher",publisher);
		model.addAttribute("category", category);
	//	model.addAttribute("edition", edition);
		return "add-book";
	}
	
	@RequestMapping(value = { "/add-book" }, method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book")Book book,BindingResult result/*,@ModelAttribute("publisher")Publisher publisher,BindingResult result2,
			*/,@ModelAttribute("category")Category category,BindingResult result3/*,@ModelAttribute("edition")Edition edition,BindingResult result4,
			*/,ModelMap model ) {

		if (result.hasErrors()||result3.hasErrors()) {
			System.out.println("exception!");
	        return "fail-add-book";
	    }
		System.out.println("here in post!!!!");
		System.out.println(book);
		System.out.println(category);
		//int bookID,String bookName, String categoryName, Set<Author> authors1, String publisherName,
		//String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity
		boolean bookAdded = false;//service2.addBook(book.getBookname(),category.getCategoryName(),book.getAuthors(),publisher.getPublisherName()
			//							,edition.getISBN(),edition.getBookPrice(),edition.getBookPage(),edition.getPurchaseDate(),edition.getEdition(),edition.getRent(),edition.getTotalQuantity());

		if(bookAdded){
//			model.put("user", user);
			System.out.println("Success in adding book!!!!");
			return "success-add-book";
		}else{
			System.out.println("Failure adding book!!!!");
			//String msg = "Incorrect User!";
			//request.setAttribute("error-msg", msg);
			//request.setAttribute("error", Boolean.TRUE);
			//model.put("error", msg);
			return "add-book";
		}
	}





}
