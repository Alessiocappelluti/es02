package it.apuliadigitalmaker.es02.BRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public class BRepository  extends JpaRepository<Book,String>{

    @Query("SELECT l FROM Book l WHERE l.titolo = ?1")
    List<Book> findBookByTitle (String titolo);
}

