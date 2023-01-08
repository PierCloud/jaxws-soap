
package jaxwsExample.ws.jaxws;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "sayHelloResponse", namespace = "http://ws.jaxwsExample/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHelloResponse", namespace = "http://ws.jaxwsExample/")
public class SayHelloResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
