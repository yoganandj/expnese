package com.react.expenses.expense.repository;

import com.react.expenses.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category findByName(String name);
}
