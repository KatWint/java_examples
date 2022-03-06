package com.katwdojo.savetravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katwdojo.savetravels.models.Expense;
import com.katwdojo.savetravels.repositories.ExpenseRepo;

@Service
public class ExpenseServices {
	@Autowired
	private final ExpenseRepo expenseRepo;
	
	public ExpenseServices(ExpenseRepo expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	public List<Expense> allExpenses(){
		return expenseRepo.findAll();
	}
	public Expense saveExpense(Expense e) {
		return expenseRepo.save(e);
	}
	public Expense updateExpense(Expense e) {
		return expenseRepo.save(e);
	}
}
