package com.name.server.cxf;

import org.junit.jupiter.api.Test;

import javax.xml.ws.BindingProvider;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterEndpointTest {

    @Test
    void celsiusToFahrenheit() {

        TempConverterEndpoint service = new TempConverterEndpointService().getTempConverterEndpointPort();
        String url = "http://learnwebservices.com/services/tempconverter";
        BindingProvider bindingProvider = (BindingProvider) service;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
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