
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoInfoAdicional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoAdicional"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoInfo" type="{http://www.rbm.com.co/esb/}TipoTipoInfo"/&gt;
 *         &lt;element name="descripcion" type="{http://www.rbm.com.co/esb/}TipoDescripcion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoAdicional", propOrder = {
    "tipoInfo",
    "descripcion"
})
public class TipoInfoAdicional {

    @XmlElement(required = true)
    protected String tipoInfo;
    @XmlElement(required = true)
    protected String descripcion;

    /**
     * Gets the value of the tipoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInfo() {
        return tipoInfo;
    }

    /**
     * Sets the value of the tipoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInfo(String value) {
        this.tipoInfo = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
