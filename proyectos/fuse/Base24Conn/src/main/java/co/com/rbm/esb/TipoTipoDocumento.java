
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTipoDocumento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTipoDocumento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="TI"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="NI"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoDocumento")
@XmlEnum
public enum TipoTipoDocumento {

    CC,
    TI,
    CE,
    NI,
    PS;

    public String value() {
        return name();
    }

    public static TipoTipoDocumento fromValue(String v) {
        return valueOf(v);
    }

}
