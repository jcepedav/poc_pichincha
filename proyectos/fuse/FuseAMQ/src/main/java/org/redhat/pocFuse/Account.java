
package org.redhat.pocFuse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountID",
    "accountType",
    "customerID",
    "accountBalance"
})
public class Account {

    protected int accountID;
    protected int accountType;
    protected int customerID;
    protected double accountBalance;

    /**
     * Obtiene el valor de la propiedad accountID.
     * 
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * Define el valor de la propiedad accountID.
     * 
     */
    public void setAccountID(int value) {
        this.accountID = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

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

    /**
     * Obtiene el valor de la propiedad accountBalance.
     * 
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define el valor de la propiedad accountBalance.
     * 
     */
    public void setAccountBalance(double value) {
        this.accountBalance = value;
    }

}
