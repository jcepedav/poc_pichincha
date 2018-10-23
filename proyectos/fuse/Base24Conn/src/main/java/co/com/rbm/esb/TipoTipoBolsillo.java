
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTipoBolsillo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTipoBolsillo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Lealtad"/&gt;
 *     &lt;enumeration value="CuotaMonetaria"/&gt;
 *     &lt;enumeration value="CupoCredito"/&gt;
 *     &lt;enumeration value="BonoEfectivo"/&gt;
 *     &lt;enumeration value="CreditoRotativoBolsillo"/&gt;
 *     &lt;enumeration value="BonoRegalo"/&gt;
 *     &lt;enumeration value="BonoDescuento"/&gt;
 *     &lt;enumeration value="BolsilloCredito"/&gt;
 *     &lt;enumeration value="BolsilloDebito"/&gt;
 *     &lt;enumeration value="Ahorros"/&gt;
 *     &lt;enumeration value="Corriente"/&gt;
 *     &lt;enumeration value="Credito"/&gt;
 *     &lt;enumeration value="Desconocida"/&gt;
 *     &lt;enumeration value="CreditoRotativo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoTipoBolsillo")
@XmlEnum
public enum TipoTipoBolsillo {

    @XmlEnumValue("Lealtad")
    LEALTAD("Lealtad"),
    @XmlEnumValue("CuotaMonetaria")
    CUOTA_MONETARIA("CuotaMonetaria"),
    @XmlEnumValue("CupoCredito")
    CUPO_CREDITO("CupoCredito"),
    @XmlEnumValue("BonoEfectivo")
    BONO_EFECTIVO("BonoEfectivo"),
    @XmlEnumValue("CreditoRotativoBolsillo")
    CREDITO_ROTATIVO_BOLSILLO("CreditoRotativoBolsillo"),
    @XmlEnumValue("BonoRegalo")
    BONO_REGALO("BonoRegalo"),
    @XmlEnumValue("BonoDescuento")
    BONO_DESCUENTO("BonoDescuento"),
    @XmlEnumValue("BolsilloCredito")
    BOLSILLO_CREDITO("BolsilloCredito"),
    @XmlEnumValue("BolsilloDebito")
    BOLSILLO_DEBITO("BolsilloDebito"),
    @XmlEnumValue("Ahorros")
    AHORROS("Ahorros"),
    @XmlEnumValue("Corriente")
    CORRIENTE("Corriente"),
    @XmlEnumValue("Credito")
    CREDITO("Credito"),
    @XmlEnumValue("Desconocida")
    DESCONOCIDA("Desconocida"),
    @XmlEnumValue("CreditoRotativo")
    CREDITO_ROTATIVO("CreditoRotativo");
    private final String value;

    TipoTipoBolsillo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoTipoBolsillo fromValue(String v) {
        for (TipoTipoBolsillo c: TipoTipoBolsillo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
