package com.thanhdc.example.Service.impl;

import com.thanhdc.example.Model.Staff;
import com.thanhdc.example.Reponsitory.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service("StaffService")
public class StaffServiceImpl implements com.thanhdc.example.Service.StaffService {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return StaffRepository.findAll(pageable);;
    }

    @Override
    public void save(Staff staff) {

    }

    @Override
    public Staff findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Staff staff) {

    }

    @Override
    public void remove(int id) {

    }
}
