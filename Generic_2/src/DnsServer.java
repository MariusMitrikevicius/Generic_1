// Klasė "DnsServer", kuri turi du atributus: ip1 ir ip2.
// Tai paprasta klasė, kuri saugo DNS serverio IP adresus.
public class DnsServer {

    private String ip1; // Pirmas IP adresas
    private String ip2; // Antras IP adresas

    // Konstruktoras, kuris priima abu IP adresus ir nustato juos
    public DnsServer(String ip1, String ip2) {
        this.ip1 = ip1; // Nustatome pirmą IP adresą
        this.ip2 = ip2; // Nustatome antrą IP adresą
    }

    // Getteriai, kurie leidžia pasiekti IP adresus
    public String getIp1() {
        return ip1; // Grąžiname pirmą IP adresą
    }

    public String getIp2() {
        return ip2; // Grąžiname antrą IP adresą
    }
}
