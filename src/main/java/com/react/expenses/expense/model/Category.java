package com.react.expenses.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    private Long id;

    private String name;
}
