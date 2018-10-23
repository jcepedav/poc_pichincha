
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTipoCuenta.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTipoCuenta"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ahorros"/&gt;
 *     &lt;enumeration value="Corriente"/&gt;
 *     &lt;enumeration value="CreditoRotativo"/&gt;
 *     &lt;enumeration value="Credito"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoCuenta")
@XmlEnum
public enum TipoTipoCuenta {

    @XmlEnumValue("Ahorros")
    AHORROS("Ahorros"),
    @XmlEnumValue("Corriente")
    CORRIENTE("Corriente"),
    @XmlEnumValue("CreditoRotativo")
    CREDITO_ROTATIVO("CreditoRotativo"),
    @XmlEnumValue("Credito")
    CREDITO("Credito");
    private final String value;

    TipoTipoCuenta(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoTipoCuenta fromValue(String v) {
        for (TipoTipoCuenta c: TipoTipoCuenta.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
