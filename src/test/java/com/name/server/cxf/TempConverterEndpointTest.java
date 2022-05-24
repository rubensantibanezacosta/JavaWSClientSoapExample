package com.name.server.cxf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterEndpointTest {

    @Test
    void celsiusToFahrenheit() {
        TempConverterEndpoint service = new TempConverterEndpointService().getTempConverterEndpointPort();
        CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
        request.setTemperatureInCelsius(0);
        CelsiusToFahrenheitResponse response = service.celsiusToFahrenheit(request);
        assertEquals(response.getTemperatureInFahrenheit(), 32.0);
    }

    @Test
    void fahrenheitToCelsius() {
    }
}