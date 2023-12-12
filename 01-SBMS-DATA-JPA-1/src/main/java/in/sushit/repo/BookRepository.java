package in.sushit.repo;

import org.springframework.data.repository.CrudRepository;

import in.sushit.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{

}
