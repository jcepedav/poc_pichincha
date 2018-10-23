
package co.com.rbm.esb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoInfoImpuestos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoImpuestos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoImpuesto" type="{http://www.rbm.com.co/esb/}TipoTipoImpuesto"/&gt;
 *         &lt;element name="monto" type="{http://www.rbm.com.co/esb/}TipoMonto"/&gt;
 *         &lt;element name="baseImpuesto" type="{http://www.rbm.com.co/esb/}TipoMonto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoImpuestos", propOrder = {
    "tipoImpuesto",
    "monto",
    "baseImpuesto"
})
public class TipoInfoImpuestos {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoImpuesto tipoImpuesto;
    @XmlElement(required = true)
    protected BigDecimal monto;
    protected BigDecimal baseImpuesto;

    /**
     * Gets the value of the tipoImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoImpuesto }
     *     
     */
    public TipoTipoImpuesto getTipoImpuesto() {
        return tipoImpuesto;
    }

    /**
     * Sets the value of the tipoImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoImpuesto }
     *     
     */
    public void setTipoImpuesto(TipoTipoImpuesto value) {
        this.tipoImpuesto = value;
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

    /**
     * Gets the value of the baseImpuesto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseImpuesto() {
        return baseImpuesto;
    }

    /**
     * Sets the value of the baseImpuesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseImpuesto(BigDecimal value) {
        this.baseImpuesto = value;
    }

}
