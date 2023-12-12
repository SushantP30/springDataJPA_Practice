package in.sushit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sushit.entity.Book;
import in.sushit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		BookRepository bookRepo=context.getBean(BookRepository.class);
		Book b=new Book();
		b.setBookId(102);
		b.setBookName("C++");
		b.setBookPrice(600.008);
		bookRepo.save(b);
		
	}

}
