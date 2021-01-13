package com.cheny.service;

import com.cheny.domain.User;

public interface myservice {
    User query(Integer id);
    Integer count();
}
