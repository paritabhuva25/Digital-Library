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
		Publisher p = new Publisher();
		Category c = new Category();
		Edition e = new Edition();
		model.addAttribute("book", book);
		model.addAttribute("publisher", p);
		model.addAttribute("category", c);
		model.addAttribute("edition", e);
		return "add-book";
	}
	
	@RequestMapping(value = { "/add-book" }, method = RequestMethod.POST)
	public String saveBook(@Valid Book book,@Valid Publisher p,@Valid Edition e,@Valid Category c, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "fail-add-book";
		}

		//int bookID,String bookName, String categoryName, Set<Author> authors1, String publisherName,
		//String isbn, double price, int pages, Date purchaseDate, int edition, double rent, int quantity
		boolean bookAdded = service2.addBook(book.getBookID(),book.getBookname(),c.getCategoryName(),book.getAuthors(),p.getPublisherName()
										,e.getISBN(),e.getBookPrice(),e.getBookPage(),e.getPurchaseDate(),e.getEdition(),e.getRent(),e.getTotalQuantity());

		if(bookAdded){
//			model.put("user", user);
			System.out.println("Success!!!!");
			return "success-add-book";
		}else{
			System.out.println("Failure!!!!");
			//String msg = "Incorrect User!";
			//request.setAttribute("error-msg", msg);
			//request.setAttribute("error", Boolean.TRUE);
			//model.put("error", msg);
			return "fail-add-book";
		}
	}





}
