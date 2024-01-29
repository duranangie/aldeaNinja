package com.aldeaninja.DAO;

import java.util.List;

public interface getallDao<T> extends IDao {

    List<T> getAll();
    
}