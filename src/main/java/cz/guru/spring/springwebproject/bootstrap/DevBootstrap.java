package cz.guru.spring.springwebproject.bootstrap;

import cz.guru.spring.springwebproject.model.Author;
import cz.guru.spring.springwebproject.model.Book;
import cz.guru.spring.springwebproject.model.Publisher;
import cz.guru.spring.springwebproject.repository.AuthorRepository;
import cz.guru.spring.springwebproject.repository.BookRepository;
import cz.guru.spring.springwebproject.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Eric", "Events");

        Publisher p = new Publisher("foo", "address");
        publisherRepository.save(p);
        Book ddd = new Book("Domain driven development", "132654", p);
        eric.getBook().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author pepik = new Author("Pepic", "Petrol");
        Book jdw = new Book("Java driven Webaplications", "32423", p);
        pepik.getBook().add(jdw);
        jdw.getAuthors().add(pepik);
        authorRepository.save(pepik);
        bookRepository.save(jdw);
    }
}
