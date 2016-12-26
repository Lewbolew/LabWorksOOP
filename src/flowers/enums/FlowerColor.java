package flowers.enums;

/**
 * Enum fo different flower colors
 */
public enum FlowerColor {
    RED, GREEN, YELLOW, BLUE, PURPLE, PINK, ORANGE, WHITE, NON_COLOR;

    public String toString() {
        switch (this) {
            case RED: return "red";
            case GREEN: return "green";
            case YELLOW: return "yellow";
            case BLUE: return "blue";
            case PURPLE: return "purple";
            case PINK: return "pink";
            case ORANGE: return "orange";
            case NON_COLOR: return "nonColor";
            case WHITE: return "white";
        }
        return null;
    }
}
