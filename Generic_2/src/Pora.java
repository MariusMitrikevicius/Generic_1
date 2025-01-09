// Klasė "Pora", kuri turi du atributus: raktas ir reikšmė.
// "K" yra tipo parametras, kuris gali būti bet koks objektas (rakto tipas).
// "V" yra tipo parametras, kuris gali būti bet koks objektas (reikšmės tipas).
public class Pora<K, V> {

    // Raktas ir reikšmė, kuriuos saugosime kaip Pora objektą.
    private K raktas;  // Raktas gali būti bet koks tipas (pvz., String, Integer, etc.)
    private V reiksme; // Reikšmė gali būti bet koks tipas (pvz., String, DnsServer, etc.)

    // Konstruktoras, kuris priima rakto ir reikšmės reikšmes.
    // Kai sukuriame Pora objektą, privalome perduoti rakto ir reikšmės reikšmes.
    public Pora(K raktas, V reiksme) {
        this.raktas = raktas; // Nustatome šį objekto raktą
        this.reiksme = reiksme; // Nustatome šį objekto reikšmę
    }

    // Getteriai (metodai, kurie grąžina reikšmes)
    // Jie leidžia pasiekti raktą ir reikšmę iš kitos klasės.

    // Šis metodas grąžina raktą, kuris yra Pora objekto dalis.
    public K getRaktas() {
        return raktas; // Grąžiname rakto reikšmę
    }

    // Šis metodas grąžina reikšmę, kuri yra Pora objekto dalis.
    public V getReiksme() {
        return reiksme; // Grąžiname reikšmės reikšmę
    }
}
