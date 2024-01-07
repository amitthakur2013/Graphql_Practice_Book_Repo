package com.practice.graphql;

import com.practice.graphql.entity.Book;
import com.practice.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Book1");
		b1.setAuthor("Author1");
		b1.setDesc("Description1");
		b1.setPrice(100);
		b1.setPages(500);

		Book b2 = new Book();
		b2.setTitle("Book2");
		b2.setAuthor("Author2");
		b2.setDesc("Description2");
		b2.setPrice(100);
		b2.setPages(500);

		Book b3 = new Book();
		b3.setTitle("Book3");
		b3.setAuthor("Author3");
		b3.setDesc("Description3");
		b3.setPrice(100);
		b3.setPages(500);

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
