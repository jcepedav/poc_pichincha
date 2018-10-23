
package co.com.rbm.esb.comercio.compra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.TipoIdPersona;


/**
 * <p>Java class for TipoSolicitudCompra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoSolicitudCompra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabeceraSolicitud" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoCabeceraSolicitud"/&gt;
 *         &lt;element name="idPersona" type="{http://www.rbm.com.co/esb/}TipoIdPersona" minOccurs="0"/&gt;
 *         &lt;element name="infoMedioPago" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoInfoMedioPago"/&gt;
 *         &lt;element name="infoCompra" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoInfoCompra"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoSolicitudCompra", propOrder = {
    "cabeceraSolicitud",
    "idPersona",
    "infoMedioPago",
    "infoCompra"
})
public class TipoSolicitudCompra {

    @XmlElement(required = true)
    protected TipoCabeceraSolicitud cabeceraSolicitud;
    protected TipoIdPersona idPersona;
    @XmlElement(required = true)
    protected TipoInfoMedioPago infoMedioPago;
    @XmlElement(required = true)
    protected TipoInfoCompra infoCompra;

    /**
     * Gets the value of the cabeceraSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCabeceraSolicitud }
     *     
     */
    public TipoCabeceraSolicitud getCabeceraSolicitud() {
        return cabeceraSolicitud;
    }

    /**
     * Sets the value of the cabeceraSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCabeceraSolicitud }
     *     
     */
    public void setCabeceraSolicitud(TipoCabeceraSolicitud value) {
        this.cabeceraSolicitud = value;
    }

    /**
     * Gets the value of the idPersona property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdPersona }
     *     
     */
    public TipoIdPersona getIdPersona() {
        return idPersona;
    }

    /**
     * Sets the value of the idPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdPersona }
     *     
     */
    public void setIdPersona(TipoIdPersona value) {
        this.idPersona = value;
    }

    /**
     * Gets the value of the infoMedioPago property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoMedioPago }
     *     
     */
    public TipoInfoMedioPago getInfoMedioPago() {
        return infoMedioPago;
    }

    /**
     * Sets the value of the infoMedioPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoMedioPago }
     *     
     */
    public void setInfoMedioPago(TipoInfoMedioPago value) {
        this.infoMedioPago = value;
    }

    /**
     * Gets the value of the infoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoCompra }
     *     
     */
    public TipoInfoCompra getInfoCompra() {
        return infoCompra;
    }

    /**
     * Sets the value of the infoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoCompra }
     *     
     */
    public void setInfoCompra(TipoInfoCompra value) {
        this.infoCompra = value;
    }

}
