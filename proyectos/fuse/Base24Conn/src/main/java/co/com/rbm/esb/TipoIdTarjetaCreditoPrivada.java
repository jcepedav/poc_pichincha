
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoIdTarjetaCreditoPrivada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoIdTarjetaCreditoPrivada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="franquicia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numTarjeta" type="{http://www.rbm.com.co/esb/}TipoNumTarjeta"/&gt;
 *         &lt;element name="tipoBolsillo" type="{http://www.rbm.com.co/esb/}TipoTipoBolsillo"/&gt;
 *         &lt;element name="codVerificacion" type="{http://www.rbm.com.co/esb/}TipoCodVerficacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoIdTarjetaCreditoPrivada", propOrder = {
    "franquicia",
    "numTarjeta",
    "tipoBolsillo",
    "codVerificacion"
})
public class TipoIdTarjetaCreditoPrivada {

    @XmlElement(required = true)
    protected String franquicia;
    @XmlElement(required = true)
    protected String numTarjeta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoBolsillo tipoBolsillo;
    protected String codVerificacion;

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

    /**
     * Gets the value of the codVerificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVerificacion() {
        return codVerificacion;
    }

    /**
     * Sets the value of the codVerificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVerificacion(String value) {
        this.codVerificacion = value;
    }

}
