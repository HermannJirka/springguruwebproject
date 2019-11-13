package cz.guru.spring.springwebproject.repository;

import cz.guru.spring.springwebproject.model.Author;
import cz.guru.spring.springwebproject.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
