
package co.com.rbm.esb.comercio.compra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.comercio.TipoInfoPuntoInteraccion;


/**
 * <p>Java class for TipoCabeceraSolicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoCabeceraSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoPuntoInteraccion" type="{http://www.rbm.com.co/esb/comercio/}TipoInfoPuntoInteraccion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCabeceraSolicitud", propOrder = {
    "infoPuntoInteraccion"
})
public class TipoCabeceraSolicitud {

    @XmlElement(required = true)
    protected TipoInfoPuntoInteraccion infoPuntoInteraccion;

    /**
     * Gets the value of the infoPuntoInteraccion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoPuntoInteraccion }
     *     
     */
    public TipoInfoPuntoInteraccion getInfoPuntoInteraccion() {
        return infoPuntoInteraccion;
    }

    /**
     * Sets the value of the infoPuntoInteraccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoPuntoInteraccion }
     *     
     */
    public void setInfoPuntoInteraccion(TipoInfoPuntoInteraccion value) {
        this.infoPuntoInteraccion = value;
    }

}
