import java.util.List;

// Generinė klasė, kuri priima bet kokį medžių sąrašą
public class Miskas {

    // Metodas, priimantis bet kokį medžių sąrašą
    public static <T extends Medis> void ivairusMiskas(List<T> medziai) {
        System.out.println("Ivairus miškas:");
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    // Metodas, priimantis tik spygliuotis
    public static void spygliuociuMiskas(List<Spygliuotis> medziai) {
        System.out.println("Spygliuočių miškas:");
        for (Spygliuotis medis : medziai) {
            medis.turi();
        }
    }

    // Metodas, priimantis tik beržų sąrašą
    public static void berzuMiskas(List<Berzas> medziai) {
        System.out.println("Beržų miškas:");
        for (Berzas medis : medziai) {
            medis.turi();
        }
    }
}
