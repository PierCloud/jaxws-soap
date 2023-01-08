
package jaxwsExample.ws.jaxws;

import jakarta.xml.bind.annotation.*;


@XmlRootElement(name = "sayHello", namespace = "http://ws.jaxwsExample/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", namespace = "http://ws.jaxwsExample/")
public class SayHello {

    @XmlElement(name = "name", namespace = "")
    private String name;

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

}
