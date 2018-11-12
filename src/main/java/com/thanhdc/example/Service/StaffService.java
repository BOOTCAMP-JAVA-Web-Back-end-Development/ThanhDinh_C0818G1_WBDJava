package com.thanhdc.example.Service;


import com.thanhdc.example.Model.Staff;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface StaffService {
    Page<Staff> findAll(Pageable pageable);

    void save(Staff staff);

    Staff findById(int id);

    void update(int id, Staff staff);

    void remove(int id);
}



