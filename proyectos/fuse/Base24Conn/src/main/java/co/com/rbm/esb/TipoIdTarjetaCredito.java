
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TipoIdTarjetaCredito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoIdTarjetaCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="franquicia" type="{http://www.rbm.com.co/esb/}TipoFranquicia"/&gt;
 *         &lt;element name="numTarjeta" type="{http://www.rbm.com.co/esb/}TipoNumTarjeta"/&gt;
 *         &lt;element name="fechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "TipoIdTarjetaCredito", propOrder = {
    "franquicia",
    "numTarjeta",
    "fechaExpiracion",
    "codVerificacion"
})
public class TipoIdTarjetaCredito {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoFranquicia franquicia;
    @XmlElement(required = true)
    protected String numTarjeta;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaExpiracion;
    protected String codVerificacion;

    /**
     * Gets the value of the franquicia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFranquicia }
     *     
     */
    public TipoFranquicia getFranquicia() {
        return franquicia;
    }

    /**
     * Sets the value of the franquicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFranquicia }
     *     
     */
    public void setFranquicia(TipoFranquicia value) {
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
     * Gets the value of the fechaExpiracion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Sets the value of the fechaExpiracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpiracion(XMLGregorianCalendar value) {
        this.fechaExpiracion = value;
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
