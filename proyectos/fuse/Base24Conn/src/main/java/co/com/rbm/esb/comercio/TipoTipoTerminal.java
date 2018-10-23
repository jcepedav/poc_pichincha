
package co.com.rbm.esb.comercio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTipoTerminal.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTipoTerminal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEB"/&gt;
 *     &lt;enumeration value="OrdenTelefonico"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="Movil"/&gt;
 *     &lt;enumeration value="OrdenCorreo"/&gt;
 *     &lt;enumeration value="GlobalPay"/&gt;
 *     &lt;enumeration value="PEW"/&gt;
 *     &lt;enumeration value="SmartPhone"/&gt;
 *     &lt;enumeration value="Tablet"/&gt;
 *     &lt;enumeration value="TVDigital"/&gt;
 *     &lt;enumeration value="BilleteraImpresa"/&gt;
 *     &lt;enumeration value="BilleteraPOS"/&gt;
 *     &lt;enumeration value="BilleteraAPP"/&gt;
 *     &lt;enumeration value="BilleteraEComm"/&gt;
 *     &lt;enumeration value="BilleteraRBMovil"/&gt;
 *     &lt;enumeration value="DatafonoWeb"/&gt;
 *     &lt;enumeration value="APPRBM"/&gt;
 *     &lt;enumeration value="APPBanco"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoTerminal")
@XmlEnum
public enum TipoTipoTerminal {

    WEB("WEB"),
    @XmlEnumValue("OrdenTelefonico")
    ORDEN_TELEFONICO("OrdenTelefonico"),
    POS("POS"),
    @XmlEnumValue("Movil")
    MOVIL("Movil"),
    @XmlEnumValue("OrdenCorreo")
    ORDEN_CORREO("OrdenCorreo"),
    @XmlEnumValue("GlobalPay")
    GLOBAL_PAY("GlobalPay"),
    PEW("PEW"),
    @XmlEnumValue("SmartPhone")
    SMART_PHONE("SmartPhone"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet"),
    @XmlEnumValue("TVDigital")
    TV_DIGITAL("TVDigital"),
    @XmlEnumValue("BilleteraImpresa")
    BILLETERA_IMPRESA("BilleteraImpresa"),
    @XmlEnumValue("BilleteraPOS")
    BILLETERA_POS("BilleteraPOS"),
    @XmlEnumValue("BilleteraAPP")
    BILLETERA_APP("BilleteraAPP"),
    @XmlEnumValue("BilleteraEComm")
    BILLETERA_E_COMM("BilleteraEComm"),
    @XmlEnumValue("BilleteraRBMovil")
    BILLETERA_RB_MOVIL("BilleteraRBMovil"),
    @XmlEnumValue("DatafonoWeb")
    DATAFONO_WEB("DatafonoWeb"),
    APPRBM("APPRBM"),
    @XmlEnumValue("APPBanco")
    APP_BANCO("APPBanco");
    private final String value;

    TipoTipoTerminal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoTipoTerminal fromValue(String v) {
        for (TipoTipoTerminal c: TipoTipoTerminal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
