package adapter_pattern;

/**
 * Adapter class implementing the MediaPlayer interface.
 */
public class AntivirusAdapter implements Antivirus {
    AdvancedAntivirus advancedAntivirus;

    public AntivirusAdapter(String scanType) {
        if(scanType.equalsIgnoreCase("strong")) {
            advancedAntivirus = new StrongAntivirusVersion();
        } else if (scanType.equalsIgnoreCase("medium")) {
            advancedAntivirus = new MediumAntivirusVersion();
        }
    }
    @Override
    public void scan(String diskName, String scanType) {
        if(scanType.equalsIgnoreCase("strong")) {
            advancedAntivirus.scanStrong(diskName);
        } else if (scanType.equalsIgnoreCase("medium")) {
            advancedAntivirus.scanMedium(diskName);
        }
    }
}
