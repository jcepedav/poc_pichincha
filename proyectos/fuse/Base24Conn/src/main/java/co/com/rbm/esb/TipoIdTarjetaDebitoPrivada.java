
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoIdTarjetaDebitoPrivada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoIdTarjetaDebitoPrivada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="franquicia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numTarjeta" type="{http://www.rbm.com.co/esb/}TipoNumTarjeta"/&gt;
 *         &lt;element name="tipoBolsillo" type="{http://www.rbm.com.co/esb/}TipoTipoBolsillo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoIdTarjetaDebitoPrivada", propOrder = {
    "franquicia",
    "numTarjeta",
    "tipoBolsillo"
})
public class TipoIdTarjetaDebitoPrivada {

    @XmlElement(required = true)
    protected String franquicia;
    @XmlElement(required = true)
    protected String numTarjeta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoBolsillo tipoBolsillo;

    /**
     * Gets the value of the franquicia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranquicia() {
        return franquicia;
    }

    /**
     * Sets the value of the franquicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranquicia(String value) {
        this.franquicia = value;
    }

    /**
     * Gets the value of the numTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Sets the value of the numTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
    }

    /**
     * Gets the value of the tipoBolsillo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoBolsillo }
     *     
     */
    public TipoTipoBolsillo getTipoBolsillo() {
        return tipoBolsillo;
    }

    /**
     * Sets the value of the tipoBolsillo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoBolsillo }
     *     
     */
    public void setTipoBolsillo(TipoTipoBolsillo value) {
        this.tipoBolsillo = value;
    }

}
