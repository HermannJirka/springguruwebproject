package cz.guru.spring.springwebproject.repository;

import cz.guru.spring.springwebproject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
