package com.first.demo.controller;

import com.first.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cd;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cd;  //CloudVendor("S1", "XXXXX", "Vedayapalem one", "Bhanu");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cd){
        this.cd=cd;
        return "CloudVendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cd){
        this.cd=cd;
        return "CloudVendor Updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cd=null;
        return "CloudVendor Deleted successfully";
    }
}
