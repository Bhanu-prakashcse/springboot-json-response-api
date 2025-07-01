package com.first.demo.repository;

import com.first.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
}
