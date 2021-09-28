package it.apuliadigitalmaker.es02.BService;

import it.apuliadigitalmaker.es02.BookDTO.BookDTO;
import it.apuliadigitalmaker.es02.RicercaDTO.RicercaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BRepository bookRepository;

    @Autowired
    public BookService(BRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> verificaTitolo (RicercaDTO titolo){
        List<Book> T = new ArrayList<Book>(this.bookRepository.findBookByTitle(titolo.getTitolo()));
        return T;
    }

    public void saveBook (BookDTO libro){
        Book L = new Book (libro.titolo, libro.autore, libro.annoPB, libro.link);
        this.bookRepository.save(L);
    }

    public List <Book> getAllBooks(){
        return new ArrayList(this.bookRepository.findAll());
    }
}
