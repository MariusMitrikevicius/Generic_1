import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sukuriame įvairių medžių sąrašus
        List<Medis> medziai = List.of(new Azuolas(), new Berzas(), new Egle(), new Kadagys(), new Pusis());
        List<Spygliuotis> spygliuociai = List.of(new Egle(), new Kadagys(), new Pusis());
        List<Berzas> berzai = List.of(new Berzas(), new Berzas());

        // Iškviečiame metodus su skirtingais sąrašais
        Miskas.ivairusMiskas(medziai);        // Priima bet kokį medžių sąrašą
        Miskas.spygliuociuMiskas(spygliuociai); // Priima tik spygliuočius
        Miskas.berzuMiskas(berzai);           // Priima tik beržų sąrašą
    }
}