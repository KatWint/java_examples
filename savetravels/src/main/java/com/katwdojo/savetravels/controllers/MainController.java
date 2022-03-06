package com.katwdojo.savetravels.controllers;

import java.lang.reflect.Method;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.katwdojo.savetravels.models.Expense;
import com.katwdojo.savetravels.services.ExpenseServices;

@Controller
public class MainController {
	
	private final ExpenseServices expenseService;
	
	public MainController (ExpenseServices expenseService) {
		this.expenseService = expenseService;
	}

	@GetMapping("/")
	public String welcome(@ModelAttribute("expense") Expense expense) {
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String newExpense(@Valid @ModelAttribute("expense")Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/";
		}
		expenseService.saveExpense(expense);
		return "redirect:/";
	}
}
