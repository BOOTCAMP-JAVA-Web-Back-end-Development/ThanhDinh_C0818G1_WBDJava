package com.thanhdc.example.Reponsitory;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
}
