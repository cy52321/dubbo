package com.cheny.model.service;

import com.cheny.model.domain.User;

public interface Userservice {
    User query(Integer id);
    Integer count();
}
