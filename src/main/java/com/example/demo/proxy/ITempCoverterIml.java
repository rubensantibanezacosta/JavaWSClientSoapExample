package com.example.demo.proxy;

import com.name.server.cxf.CelsiusToFahrenheitRequest;
import com.name.server.cxf.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ITempCoverterIml implements ITempConverter {

@Autowired
    @Override
    public double convertCelsiusToFahrenheit(double celsius) {
    CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
    ObjectFactory factory = new ObjectFactory();


        return 0;
    }
}
