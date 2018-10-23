
package co.com.rbm.esb.comercio.compra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.TipoIdCuenta;
import co.com.rbm.esb.TipoIdTarjetaCredito;
import co.com.rbm.esb.TipoIdTarjetaCreditoPrivada;
import co.com.rbm.esb.TipoIdTarjetaDebitoPrivada;
import co.com.rbm.esb.TipoIdTrack;
import co.com.rbm.esb.TipoInfoAutenticacion;
import co.com.rbm.esb.TipoInfoCHIP;


/**
 * <p>Java class for TipoInfoMedioPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoMedioPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="idTrack" type="{http://www.rbm.com.co/esb/}TipoIdTrack"/&gt;
 *           &lt;element name="idTarjetaDebitoPrivada" type="{http://www.rbm.com.co/esb/}TipoIdTarjetaDebitoPrivada"/&gt;
 *           &lt;element name="idTarjetaCreditoPrivada" type="{http://www.rbm.com.co/esb/}TipoIdTarjetaCreditoPrivada"/&gt;
 *           &lt;element name="idTarjetaCredito" type="{http://www.rbm.com.co/esb/}TipoIdTarjetaCredito"/&gt;
 *           &lt;element name="idCuenta" type="{http://www.rbm.com.co/esb/}TipoIdCuenta"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="infoCHIP" type="{http://www.rbm.com.co/esb/}TipoInfoCHIP" minOccurs="0"/&gt;
 *         &lt;element name="infoAutenticacion" type="{http://www.rbm.com.co/esb/}TipoInfoAutenticacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoMedioPago", propOrder = {
    "idTrack",
    "idTarjetaDebitoPrivada",
    "idTarjetaCreditoPrivada",
    "idTarjetaCredito",
    "idCuenta",
    "infoCHIP",
    "infoAutenticacion"
})
public class TipoInfoMedioPago {

    protected TipoIdTrack idTrack;
    protected TipoIdTarjetaDebitoPrivada idTarjetaDebitoPrivada;
    protected TipoIdTarjetaCreditoPrivada idTarjetaCreditoPrivada;
    protected TipoIdTarjetaCredito idTarjetaCredito;
    protected TipoIdCuenta idCuenta;
    protected TipoInfoCHIP infoCHIP;
    protected TipoInfoAutenticacion infoAutenticacion;

    /**
     * Gets the value of the idTrack property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdTrack }
     *     
     */
    public TipoIdTrack getIdTrack() {
        return idTrack;
    }

    /**
     * Sets the value of the idTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdTrack }
     *     
     */
    public void setIdTrack(TipoIdTrack value) {
        this.idTrack = value;
    }

    /**
     * Gets the value of the idTarjetaDebitoPrivada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdTarjetaDebitoPrivada }
     *     
     */
    public TipoIdTarjetaDebitoPrivada getIdTarjetaDebitoPrivada() {
        return idTarjetaDebitoPrivada;
    }

    /**
     * Sets the value of the idTarjetaDebitoPrivada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdTarjetaDebitoPrivada }
     *     
     */
    public void setIdTarjetaDebitoPrivada(TipoIdTarjetaDebitoPrivada value) {
        this.idTarjetaDebitoPrivada = value;
    }

    /**
     * Gets the value of the idTarjetaCreditoPrivada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdTarjetaCreditoPrivada }
     *     
     */
    public TipoIdTarjetaCreditoPrivada getIdTarjetaCreditoPrivada() {
        return idTarjetaCreditoPrivada;
    }

    /**
     * Sets the value of the idTarjetaCreditoPrivada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdTarjetaCreditoPrivada }
     *     
     */
    public void setIdTarjetaCreditoPrivada(TipoIdTarjetaCreditoPrivada value) {
        this.idTarjetaCreditoPrivada = value;
    }

    /**
     * Gets the value of the idTarjetaCredito property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdTarjetaCredito }
     *     
     */
    public TipoIdTarjetaCredito getIdTarjetaCredito() {
        return idTarjetaCredito;
    }

    /**
     * Sets the value of the idTarjetaCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdTarjetaCredito }
     *     
     */
    public void setIdTarjetaCredito(TipoIdTarjetaCredito value) {
        this.idTarjetaCredito = value;
    }

    /**
     * Gets the value of the idCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdCuenta }
     *     
     */
    public TipoIdCuenta getIdCuenta() {
        return idCuenta;
    }

    /**
     * Sets the value of the idCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdCuenta }
     *     
     */
    public void setIdCuenta(TipoIdCuenta value) {
        this.idCuenta = value;
    }

    /**
     * Gets the value of the infoCHIP property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoCHIP }
     *     
     */
    public TipoInfoCHIP getInfoCHIP() {
        return infoCHIP;
    }

    /**
     * Sets the value of the infoCHIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoCHIP }
     *     
     */
    public void setInfoCHIP(TipoInfoCHIP value) {
        this.infoCHIP = value;
    }

    /**
     * Gets the value of the infoAutenticacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoAutenticacion }
     *     
     */
    public TipoInfoAutenticacion getInfoAutenticacion() {
        return infoAutenticacion;
    }

    /**
     * Sets the value of the infoAutenticacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoAutenticacion }
     *     
     */
    public void setInfoAutenticacion(TipoInfoAutenticacion value) {
        this.infoAutenticacion = value;
    }

}
