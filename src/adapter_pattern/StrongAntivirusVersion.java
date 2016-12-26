package adapter_pattern;

/**
 * Concrete class implementing the AdvancedAntivirus interface.
 */
public class StrongAntivirusVersion implements AdvancedAntivirus{
    @Override
    public void scanStrong(String diskName) {
        System.out.println("Scanning very strongly disk " + diskName);
    }

    @Override
    public void scanMedium(String diskName) {
        //do nothing
    }
}
