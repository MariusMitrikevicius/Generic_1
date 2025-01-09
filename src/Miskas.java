import java.util.List;

public class Miskas {

    // Metodas, priimantis bet kokį medžių sąrašą
    public static <T extends Medis> void ivairusMiskas(List<T> medziai) {
        System.out.println("Ivairus miškas:");
        // Iteruojame per sąrašą ir iškviečiame "turi()" kiekvienam medžiui
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    // Metodas, priimantis sąrašą su bet kokiu tipu, paveldinčiu iš Spygliuotis
    public static void spygliuociuMiskas(List<? extends Spygliuotis> medziai) {
        System.out.println("Spygliuočių miškas:");
        // Iteruojame per sąrašą ir iškviečiame "turi()" kiekvienam spygliuočiui
        for (Spygliuotis medis : medziai) {
            medis.turi();
        }
    }

    // Metodas, priimantis sąrašą su bet kokiu tipu, paveldinčiu iš Berzas
    public static void berzuMiskas(List<? extends Berzas> medziai) {
        System.out.println("Beržų miškas:");
        // Iteruojame per sąrašą ir iškviečiame "turi()" kiekvienam beržui
        for (Berzas medis : medziai) {
            medis.turi();
        }
    }
}
