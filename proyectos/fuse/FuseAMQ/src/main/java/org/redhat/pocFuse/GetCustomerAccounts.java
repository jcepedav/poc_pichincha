
package org.redhat.pocFuse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCustomerAccounts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCustomerAccounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerAccounts", propOrder = {
    "customerID"
})
public class GetCustomerAccounts {

    protected int customerID;

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

}
