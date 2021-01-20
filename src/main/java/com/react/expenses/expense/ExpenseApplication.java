package com.react.expenses.expense;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEncryptableProperties
public class ExpenseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseApplication.class, args);
	}
// https://github.com/dockersamples/atsea-sample-shop-app
//	https://github.com/devdcores/BookStoreApp-Distributed-Application
//	https://github.com/senolatac/react-springboot-microservices/tree/master/client-side/src
//	https://github.com/sqshq/piggymetrics
//	https://github.com/afermon/PiggyMetrics-Kubernetes
	//  "proxy": "http://ec2-35-154-72-135.ap-south-1.compute.amazonaws.com:8081",
//sudo rpm --import https://yum.corretto.aws/corretto.key
//	sudo curl -L -o /etc/yum.repos.d/corretto.repo https://yum.corretto.aws/corretto.repo

//	sudo yum install -y java-11-amazon-corretto
//	https://www.youtube.com/watch?v=jCxtm7mLaa8
//	https://www.youtube.com/watch?v=CsgtYvlR7xk
//	https://www.youtube.com/watch?v=-mFXqOaqgZk
//	https://www.youtube.com/watch?v=U-iz8b4RExA


}
