package com.name.server.cxf;

import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterEndpointTest {

    @Test
    void celsiusToFahrenheit() {
        URL url = getClass().getResource("/wsdl/service.wsdl");
        TempConverterEndpointService ss = new TempConverterEndpointService(url,  new QName("http://learnwebservices.com/services/tempconverter", "TempConverterEndpointService"));
        TempConverterEndpoint port = ss.getTempConverterEndpointPort();
        TempConverterEndpoint service = port;
      //  BindingProvider bindingProvider = (BindingProvider) service;
     //   bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
        CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
        request.setTemperatureInCelsius(0);
        CelsiusToFahrenheitResponse response = service.celsiusToFahrenheit(request);
        System.out.println(response.getTemperatureInFahrenheit());
        assertEquals(response.getTemperatureInFahrenheit(), 32.0);
    }

    @Test
    void fahrenheitToCelsius() {
    }
}