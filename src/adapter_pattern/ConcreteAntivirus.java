package adapter_pattern;

/**
 * Concrete antivicus class that implements Antivirus interface.
 */
public class ConcreteAntivirus implements Antivirus {
    AntivirusAdapter antivirusAdapter;

    @Override
    public void scan(String diskName, String scanType) {
        if(scanType.equalsIgnoreCase("simple")) {
            System.out.println("Scanning simple. Disk: " + diskName);
        } else if (scanType.equalsIgnoreCase("medium") || scanType.equalsIgnoreCase("strong")) {
            AntivirusAdapter antivirusAdapter = new AntivirusAdapter(scanType);
            antivirusAdapter.scan(diskName, scanType);
        }
    }

}
