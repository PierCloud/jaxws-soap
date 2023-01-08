package jaxwsExample.ws;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class HelloWs {

  public String sayHello(@WebParam(name="name")String name) {
    if (name == null) {
      return "Hello";
    }

    return "Hello, " + name + "!";
  }
}