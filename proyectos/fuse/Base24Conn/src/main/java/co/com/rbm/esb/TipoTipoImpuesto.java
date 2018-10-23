
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTipoImpuesto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTipoImpuesto"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IVA"/&gt;
 *     &lt;enumeration value="Consumo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoImpuesto")
@XmlEnum
public enum TipoTipoImpuesto {

    IVA("IVA"),
    @XmlEnumValue("Consumo")
    CONSUMO("Consumo");
    private final String value;

    TipoTipoImpuesto(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoTipoImpuesto fromValue(String v) {
        for (TipoTipoImpuesto c: TipoTipoImpuesto.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
