package com.marvellous.Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    //Field Injection
    @Autowired
    Hardisk hobj;
    @Autowired
    Ram robj;

    @GetMapping("Laptop")
    public String LaptopInformation()
    {
        String h = hobj.GetHarddisk();
        String r = robj.GetRam();

        String data = "Laptop Configuration :"+h+"&"+r;
        return data;
    }
}
