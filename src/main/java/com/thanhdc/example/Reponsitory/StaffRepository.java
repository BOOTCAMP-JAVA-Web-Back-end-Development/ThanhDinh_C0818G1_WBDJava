package com.thanhdc.example.Reponsitory;

import com.thanhdc.example.Model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {
}
