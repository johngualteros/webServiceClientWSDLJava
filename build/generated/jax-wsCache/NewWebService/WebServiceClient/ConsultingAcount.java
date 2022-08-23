
package WebServiceClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultingAcount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultingAcount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numerocuenta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultingAcount", propOrder = {
    "numerocuenta"
})
public class ConsultingAcount {

    protected int numerocuenta;

    /**
     * Obtiene el valor de la propiedad numerocuenta.
     * 
     */
    public int getNumerocuenta() {
        return numerocuenta;
    }

    /**
     * Define el valor de la propiedad numerocuenta.
     * 
     */
    public void setNumerocuenta(int value) {
        this.numerocuenta = value;
    }

}
