
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoIdPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoIdPersona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.rbm.com.co/esb/}TipoTipoDocumento"/&gt;
 *         &lt;element name="numDocumento" type="{http://www.rbm.com.co/esb/}TipoNumDocumento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoIdPersona", propOrder = {
    "tipoDocumento",
    "numDocumento"
})
public class TipoIdPersona {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTipoDocumento tipoDocumento;
    protected long numDocumento;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoDocumento }
     *     
     */
    public TipoTipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoTipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the numDocumento property.
     * 
     */
    public long getNumDocumento() {
        return numDocumento;
    }

    /**
     * Sets the value of the numDocumento property.
     * 
     */
    public void setNumDocumento(long value) {
        this.numDocumento = value;
    }

}
