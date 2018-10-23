
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TipoInfoCHIP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoCHIP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codSeguridadEMV" type="{http://www.rbm.com.co/esb/}TipoCodSeguridadEMV"/&gt;
 *         &lt;element name="dataEMV" type="{http://www.rbm.com.co/esb/}TipoDataEMV"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoCHIP", propOrder = {
    "codSeguridadEMV",
    "dataEMV"
})
public class TipoInfoCHIP {

    @XmlElement(required = true)
    protected String codSeguridadEMV;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] dataEMV;

    /**
     * Gets the value of the codSeguridadEMV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSeguridadEMV() {
        return codSeguridadEMV;
    }

    /**
     * Sets the value of the codSeguridadEMV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSeguridadEMV(String value) {
        this.codSeguridadEMV = value;
    }

    /**
     * Gets the value of the dataEMV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDataEMV() {
        return dataEMV;
    }

    /**
     * Sets the value of the dataEMV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEMV(byte[] value) {
        this.dataEMV = value;
    }

}
