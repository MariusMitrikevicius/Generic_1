import java.util.ArrayList;
import java.util.List;

// Klasė "Mapas", kuri saugo Pora objektus.
// K - raktas (gali būti bet koks tipas)
// V - reikšmė (gali būti bet koks tipas)
public class Mapas<K, V> {

    // Sukuriame sąrašą, kuriame laikysime visas poras.
    private List<Pora<K, V>> sarasasPoru;

    // Konstruktoras, kuris inicializuoja sarasasPoru sąrašą.
    // Tai leidžia mums sukurti Mapas objektą su tuščiu sąrašu.
    public Mapas() {
        this.sarasasPoru = new ArrayList<>(); // Sukuriame tuščią sąrašą
    }

    // Metodas "ideti", kuris prideda naują Pora objektą į sąrašą.
    // Šis metodas priima rakto ir reikšmės parametrus, tada sukuria naują Pora objektą.
    public void ideti(K raktas, V reiksme) {
        // Sukuriame naują Pora objektą, naudodami perduotus raktą ir reikšmę
        Pora<K, V> pora = new Pora<>(raktas, reiksme);

        // Pridedame sukurta Pora objektą į sarasasPoru sąrašą
        sarasasPoru.add(pora);
    }

    // Metodas "gauti", kuris ieško reikšmės pagal raktą.
    // Jei raktas yra sąraše, grąžina atitinkamą reikšmę.
    public V gauti(K raktas) {
        // Peržvelgiame visus Pora objektus sąraše
        for (Pora<K, V> pora : sarasasPoru) {
            // Jei raktas sutampa su ieškomu raktu
            if (pora.getRaktas().equals(raktas)) {
                return pora.getReiksme(); // Grąžiname atitinkamą reikšmę
            }
        }
        return null; // Jei nerandame rakto, grąžiname null
    }
}
