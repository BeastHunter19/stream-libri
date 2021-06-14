package org.ids.libri;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.ids.libri.Libro.Categoria;

public class StreamLibri {

    // mi appoggio ad un factory method che genera a rotazione
    // la stessa lista di libri
    public List<Libro> generaListaLibri(int n) {
        return Stream.generate(Libreria::gen)
            .limit(n)
            .collect(Collectors.toList());
    }

    public long contaLibriCyberpunk(List<Libro> list) {
        return list.stream()
                   .filter(l -> l.getCategoria() == Categoria.CYBERPUNK)
                   .count();
    }

    public List<Libro> prezzoCompresoTra12e15(List<Libro> list) {
        return list.stream()
                   .filter(l -> l.getPrezzo() <= 15)
                   .filter(l -> l.getPrezzo() >= 12)
                   .collect(Collectors.toList());
    }

    public List<String> filtraListaTitoliLibriCyberpunkOppureFantasy(List<Libro> list) {
        return list.stream()
                   .filter(l -> l.getCategoria() == Categoria.CYBERPUNK || l.getCategoria() == Categoria.FANTASY)
                   .map(Libro::getTitolo)
                   .collect(Collectors.toList());
    }

    public List<Libro> generaListaLibriCyberpunk(int n) {
        return null;
    }

    public boolean checkSePresenteBurningChrome(List<Libro> list) {
        return true;
    }

    public int sommaCosti_reduce(List<Libro> list) {
        return 0;
    }

    public int sommaCosti_sum(List<Libro> list) {
        return 0;
    }

    public double sommaCostiInDollari(double EUR_USD, List<Libro> list) {
        return 0.0;
    }

    public Optional<Libro> libroMenoCaroDa12InSu(List<Libro> list) {
        return null;
    }

    public List<Libro> libriOrdinatiPerPrezzo(List<Libro> list) {
        return null;
    }

    // Titolo: "Harry Potter 1" "Harry Potter 2"... "Harry Potter n"
    // categoria: fantasy, prezzo: 15 euro
    public List<Libro> generaLibriHarryPotterDa15Euro(int n) {
        return null;
    }

    public List<Libro> mescolaLista(List<Libro> list) {
        return null;
    }

    public Optional<Libro> primoPiuCaroDelPrecedente(List<Libro> list) {
        return null;
    }

}
