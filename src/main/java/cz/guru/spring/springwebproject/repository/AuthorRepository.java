package cz.guru.spring.springwebproject.repository;

import cz.guru.spring.springwebproject.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
