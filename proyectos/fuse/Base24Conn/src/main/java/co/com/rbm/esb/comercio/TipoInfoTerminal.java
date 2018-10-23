
package co.com.rbm.esb.comercio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.TipoInfoUbicacion;


/**
 * <p>Java class for TipoInfoTerminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoTerminal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreAdquiriente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="infoUbicacion" type="{http://www.rbm.com.co/esb/}TipoInfoUbicacion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoTerminal", propOrder = {
    "nombreAdquiriente",
    "infoUbicacion"
})
public class TipoInfoTerminal {

    @XmlElement(required = true)
    protected String nombreAdquiriente;
    @XmlElement(required = true)
    protected TipoInfoUbicacion infoUbicacion;

    /**
     * Gets the value of the nombreAdquiriente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAdquiriente() {
        return nombreAdquiriente;
    }

    /**
     * Sets the value of the nombreAdquiriente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAdquiriente(String value) {
        this.nombreAdquiriente = value;
    }

    /**
     * Gets the value of the infoUbicacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoUbicacion }
     *     
     */
    public TipoInfoUbicacion getInfoUbicacion() {
        return infoUbicacion;
    }

    /**
     * Sets the value of the infoUbicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoUbicacion }
     *     
     */
    public void setInfoUbicacion(TipoInfoUbicacion value) {
        this.infoUbicacion = value;
    }

}
