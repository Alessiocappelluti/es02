package it.apuliadigitalmaker.es02.LibroConfig;

import it.apuliadigitalmaker.es02.BRepository.BRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;
import java.util.List;

public class Configura {

    @Bean
    CommandLineRunner comandLineRunner(BRepository repository){
        return args -> {
            Book libro1 = new Book("libro1","nome1",2000,"link1");
            Book libro2 = new Book("libro2","nome2",2002,"link2");

            repository.deleteAll();
            repository.saveAll(
                    List.of(libro1,libro2));
        };
    }
}
