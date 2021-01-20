package com.react.expenses.expense.repository;

import com.react.expenses.expense.model.Category;
import com.react.expenses.expense.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}
