
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTipoMontoDetallado.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTipoMontoDetallado"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MontoAdicional"/&gt;
 *     &lt;enumeration value="Descuento"/&gt;
 *     &lt;enumeration value="BaseDevolucionIVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoMontoDetallado")
@XmlEnum
public enum TipoTipoMontoDetallado {

    @XmlEnumValue("MontoAdicional")
    MONTO_ADICIONAL("MontoAdicional"),
    @XmlEnumValue("Descuento")
    DESCUENTO("Descuento"),
    @XmlEnumValue("BaseDevolucionIVA")
    BASE_DEVOLUCION_IVA("BaseDevolucionIVA");
    private final String value;

    TipoTipoMontoDetallado(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoTipoMontoDetallado fromValue(String v) {
        for (TipoTipoMontoDetallado c: TipoTipoMontoDetallado.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
