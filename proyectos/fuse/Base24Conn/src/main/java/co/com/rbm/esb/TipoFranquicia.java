
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFranquicia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoFranquicia"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MasterCard"/&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="AmEx"/&gt;
 *     &lt;enumeration value="DinersClub"/&gt;
 *     &lt;enumeration value="UnionPay"/&gt;
 *     &lt;enumeration value="CMRFalabella"/&gt;
 *     &lt;enumeration value="JCB"/&gt;
 *     &lt;enumeration value="Codensa"/&gt;
 *     &lt;enumeration value="sociosbbva"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoFranquicia")
@XmlEnum
public enum TipoFranquicia {

    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    VISA("VISA"),
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub"),
    @XmlEnumValue("UnionPay")
    UNION_PAY("UnionPay"),
    @XmlEnumValue("CMRFalabella")
    CMR_FALABELLA("CMRFalabella"),
    JCB("JCB"),
    @XmlEnumValue("Codensa")
    CODENSA("Codensa"),
    @XmlEnumValue("sociosbbva")
    SOCIOSBBVA("sociosbbva");
    private final String value;

    TipoFranquicia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoFranquicia fromValue(String v) {
        for (TipoFranquicia c: TipoFranquicia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
