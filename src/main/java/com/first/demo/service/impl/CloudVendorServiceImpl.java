package com.first.demo.service.impl;

import com.first.demo.model.CloudVendor;
import com.first.demo.repository.CloudVendorRepo;
import com.first.demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepo cloudVendorRepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }

    @Override
    public String createCloudVendor(CloudVendor cd) {
        cloudVendorRepo.save(cd);
        return "Successfully created cloud vendor";
    }

    @Override
    public String updateCloudVendor(CloudVendor cd) {
        cloudVendorRepo.save(cd);
        return "Successfully updated cloud vendor";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepo.deleteById(vendorId);
        return "Successfully deleted cloud vendor";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepo.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepo.findAll();
    }
}
