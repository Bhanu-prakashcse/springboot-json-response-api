package com.first.demo.service;

import com.first.demo.model.CloudVendor;
import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cd);
    public String updateCloudVendor(CloudVendor cd);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendors();
}
