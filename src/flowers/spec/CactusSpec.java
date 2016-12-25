package flowers.spec;

import flowers.enums.CactusShape;
import flowers.parent.Spec;

/**
 * Created by bohdan on 10/25/16.
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
