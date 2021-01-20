package com.react.expenses.expense.controller;


import com.react.expenses.expense.model.Expense;
import com.react.expenses.expense.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://react-aws-first-s31.s3-website.us-east-2.amazonaws.com")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping("/expenses")
    Collection<Expense> getExpenses(){
      //  sendEmail();
        return expenseRepository.findAll();

    }

    @DeleteMapping("/expenses/{id}")
    ResponseEntity<?> deleteExpense(@PathVariable Long id){
        expenseRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/expenses")
    ResponseEntity<Expense> createExpense(@Validated @RequestBody Expense expense) throws URISyntaxException {
        System.out.println("expenses : "+expense);
        Expense result = expenseRepository.save(expense);
        return ResponseEntity.created(new URI("/api/expenses/"+result.getId())).body(result);

    }

    @Autowired
    private JavaMailSender javaMailSender;

    void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("yoganandjg003@gmail.com");

        msg.setSubject("Testing ...");
        msg.setText("Hello User GN");

        javaMailSender.send(msg);

    }
}
