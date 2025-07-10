package desgin.prototype.framework;

import java.io.Serializable;

public interface Product extends Cloneable{
    void use();
    Product createCopy();
}
