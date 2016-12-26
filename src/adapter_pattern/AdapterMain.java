package adapter_pattern;

/**
 * Adapter labaratory
 */
public class AdapterMain {
    public static void main(String[] args) {
        Antivirus antivirus = new ConcreteAntivirus();
        antivirus.scan("C", "strong");
        antivirus.scan("D", "simple");
        antivirus.scan("F", "medium");
    }
}
