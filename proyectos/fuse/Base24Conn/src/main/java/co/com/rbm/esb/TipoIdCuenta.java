
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoIdCuenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoIdCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoCuenta" type="{http://www.rbm.com.co/esb/}TipoTipoCuenta"/&gt;
 *         &lt;element name="numCuenta" type="{http://www.rbm.com.co/esb/}TipoNumCuenta"/&gt;
 *         &lt;element name="codBanco" type="{http://www.rbm.com.co/esb/}TipoCodBanco"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoIdCuenta", propOrder = {
    "tipoCuenta",
    "numCuenta",
    "codBanco"
})
public class TipoIdCuenta {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoCuenta tipoCuenta;
    @XmlElement(required = true)
    protected String numCuenta;
    @XmlElement(required = true)
    protected String codBanco;

    /**
     * Gets the value of the tipoCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoCuenta }
     *     
     */
    public TipoTipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoCuenta }
     *     
     */
    public void setTipoCuenta(TipoTipoCuenta value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the numCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Sets the value of the numCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuenta(String value) {
        this.numCuenta = value;
    }

    /**
     * Gets the value of the codBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBanco() {
        return codBanco;
    }

    /**
     * Sets the value of the codBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBanco(String value) {
        this.codBanco = value;
    }

}
