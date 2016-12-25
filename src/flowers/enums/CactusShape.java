package flowers.enums;

/**
 * Created by bohdan on 10/25/16.
 */
public enum CactusShape {
    SQUARE, TRIANGLE, TYOCHUN_YAZYK, PODOVHASTYY, ROUND, RECTANGULAR, FORMLESS;

    @Override
    public String toString() {
        switch (this) {
            case SQUARE: return "square";
            case TRIANGLE: return "triangle";
            case TYOCHUN_YAZYK: return "tyochun_yazyk";
            case PODOVHASTYY: return "podovhastyy";
            case ROUND: return "round";
            case RECTANGULAR: return "rectangular";
            case FORMLESS: return "formless";
        }
        return null;
    }
}
