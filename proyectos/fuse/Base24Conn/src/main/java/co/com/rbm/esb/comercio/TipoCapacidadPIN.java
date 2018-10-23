
package co.com.rbm.esb.comercio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCapacidadPIN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCapacidadPIN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Desconocido"/&gt;
 *     &lt;enumeration value="Permitido"/&gt;
 *     &lt;enumeration value="NoPermitido"/&gt;
 *     &lt;enumeration value="FueraDeServicio"/&gt;
 *     &lt;enumeration value="Verificado"/&gt;
 *     &lt;enumeration value="NoPermitidoBatch"/&gt;
 *     &lt;enumeration value="Virtual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoCapacidadPIN")
@XmlEnum
public enum TipoCapacidadPIN {

    @XmlEnumValue("Desconocido")
    DESCONOCIDO("Desconocido"),
    @XmlEnumValue("Permitido")
    PERMITIDO("Permitido"),
    @XmlEnumValue("NoPermitido")
    NO_PERMITIDO("NoPermitido"),
    @XmlEnumValue("FueraDeServicio")
    FUERA_DE_SERVICIO("FueraDeServicio"),
    @XmlEnumValue("Verificado")
    VERIFICADO("Verificado"),
    @XmlEnumValue("NoPermitidoBatch")
    NO_PERMITIDO_BATCH("NoPermitidoBatch"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual");
    private final String value;

    TipoCapacidadPIN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoCapacidadPIN fromValue(String v) {
        for (TipoCapacidadPIN c: TipoCapacidadPIN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
