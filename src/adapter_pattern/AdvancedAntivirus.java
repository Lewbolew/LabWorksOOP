package adapter_pattern;

/**
 * Advanced antivirus interface.
 */
public interface AdvancedAntivirus {
    public void scanStrong(String diskName);
    public void scanMedium(String diskName);
}
