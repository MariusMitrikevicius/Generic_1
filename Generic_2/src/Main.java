public class Main {
    public static void main(String[] args) {
        // Sukuriame Mapas objektą, kuris saugos DnsProvider -> DnsServer poras.
        // Tai reiškia, kad rakto tipas bus DnsProvider, o reikšmės tipas bus DnsServer.
        Mapas<DnsProvider, DnsServer> dnsMap = new Mapas<>();

        // Užpildome map'ą su poromis (raktas -> reikšmė).
        // Kuriame Pora objektus ir pridedame juos į dnsMap.
        dnsMap.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMap.ideti(DnsProvider.OPENDNS, new DnsServer("208.67.222.222", "208.67.220.220"));

        // Gaukime reikšmes pagal raktus.
        // Paieškosime pagal DNS paslaugų tiekėjus (Google, OpenDNS).
        DnsServer googleDns = dnsMap.gauti(DnsProvider.GOOGLE);
        if (googleDns != null) {
            System.out.println("GOOGLE DNS: " + googleDns.getIp1() + ", " + googleDns.getIp2());
        }

        // Sukuriame kitą Mapas objektą, kuris saugos String -> String poras.
        // Tai reiškia, kad rakto ir reikšmės tipai bus abu String.
        Mapas<String, String> stringMap = new Mapas<>();

        // Užpildome šį map'ą su String poromis.
        stringMap.ideti("raktas1", "reiksme1");
        stringMap.ideti("raktas2", "reiksme2");

        // Gaukime reikšmes pagal String raktus.
        String reiksme1 = stringMap.gauti("raktas1");
        if (reiksme1 != null) {
            System.out.println("raktas1 reikšmė: " + reiksme1);
        }
    }
}