package adapter_pattern;

/**
 * Concrete class implementing the AdvancedAntivirus interface.
 */
public class MediumAntivirusVersion implements AdvancedAntivirus{

    @Override
    public void scanStrong(String diskName) {
        //do nothing
    }

    @Override
    public void scanMedium(String diskName) {
        System.out.println("Scanning on the medium level of care the disk " + diskName);
    }
}
