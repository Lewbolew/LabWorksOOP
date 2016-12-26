package flowers.spec;

import flowers.enums.CactusShape;
import flowers.parent.Spec;

/**
 * All fields and methods which can change we delivered into spec class
 */
public class CactusSpec extends Spec {
    CactusShape cactusShape = CactusShape.FORMLESS;

    public CactusSpec(int price, int stemLenght, String name, CactusShape cactusShape) {
        super(price, stemLenght, name);
        this.cactusShape = cactusShape;
    }

    public void setCactusShape(CactusShape cactusShape) {
        this.cactusShape = cactusShape;
    }
    public CactusShape getCactusShape() {
        return cactusShape;
    }

}
