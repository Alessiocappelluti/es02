package it.apuliadigitalmaker.es02.RicercaDTO;

import lombok.Data;

@Data
public class RicercaDTO {

    String titolo;

    public RicercaDTO(){

    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
