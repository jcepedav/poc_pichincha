
package co.com.rbm.esb.comercio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoModoCapturaPAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoModoCapturaPAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Banda"/&gt;
 *     &lt;enumeration value="Barras"/&gt;
 *     &lt;enumeration value="OCR"/&gt;
 *     &lt;enumeration value="CHIP"/&gt;
 *     &lt;enumeration value="ContactlessBanda"/&gt;
 *     &lt;enumeration value="ContactlessChip"/&gt;
 *     &lt;enumeration value="Fallback"/&gt;
 *     &lt;enumeration value="E-commerce"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoModoCapturaPAN")
@XmlEnum
public enum TipoModoCapturaPAN {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Banda")
    BANDA("Banda"),
    @XmlEnumValue("Barras")
    BARRAS("Barras"),
    OCR("OCR"),
    CHIP("CHIP"),
    @XmlEnumValue("ContactlessBanda")
    CONTACTLESS_BANDA("ContactlessBanda"),
    @XmlEnumValue("ContactlessChip")
    CONTACTLESS_CHIP("ContactlessChip"),
    @XmlEnumValue("Fallback")
    FALLBACK("Fallback"),
    @XmlEnumValue("E-commerce")
    E_COMMERCE("E-commerce");
    private final String value;

    TipoModoCapturaPAN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoModoCapturaPAN fromValue(String v) {
        for (TipoModoCapturaPAN c: TipoModoCapturaPAN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
