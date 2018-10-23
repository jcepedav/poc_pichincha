
package co.com.rbm.esb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoMontoDetallado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoMontoDetallado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoMontoDetallado" type="{http://www.rbm.com.co/esb/}TipoTipoMontoDetallado"/&gt;
 *         &lt;element name="monto" type="{http://www.rbm.com.co/esb/}TipoMonto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoMontoDetallado", propOrder = {
    "tipoMontoDetallado",
    "monto"
})
public class TipoMontoDetallado {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoMontoDetallado tipoMontoDetallado;
    @XmlElement(required = true)
    protected BigDecimal monto;

    /**
     * Gets the value of the tipoMontoDetallado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoMontoDetallado }
     *     
     */
    public TipoTipoMontoDetallado getTipoMontoDetallado() {
        return tipoMontoDetallado;
    }

    /**
     * Sets the value of the tipoMontoDetallado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoMontoDetallado }
     *     
     */
    public void setTipoMontoDetallado(TipoTipoMontoDetallado value) {
        this.tipoMontoDetallado = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

}
