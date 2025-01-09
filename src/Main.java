import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sukuriame įvairių medžių sąrašus
        List<Medis> medziai = List.of(new Berzas(), new Azuolas(), new Kadagys(), new Egle(), new Pusis());
        // Sukuriame spygliuočių sąrašą
        List<Spygliuotis> spygliuociai = List.of(new Kadagys(), new Egle(), new Pusis());
        // Sukuriame eglių sąrašą
        List<Egle> egles = List.of(new Egle(), new Egle());
        // Sukuriame beržų sąrašą
        List<Berzas> berzai = List.of(new Berzas(), new Berzas(), new Berzas());

        // Iškviečiame metodus su skirtingais sąrašais
        Miskas.ivairusMiskas(medziai);          // Priima bet kokį medžių sąrašą
        Miskas.spygliuociuMiskas(spygliuociai); // Priima tik spygliuočius
        Miskas.spygliuociuMiskas(egles);        // Priima tik eglių sąrašą
        Miskas.berzuMiskas(berzai);             // Priima tik beržų sąrašą
    }
}
