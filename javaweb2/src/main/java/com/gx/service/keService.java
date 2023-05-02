package com.gx.service;

import com.gx.domain.ke;

import java.util.List;

public interface keService {
    // 查询所有账户
    public List<ke> findAll();

    // 保存帐户信息
    public int saveke(ke ke);

    public int updateke(ke ke);

    public List<ke> find(String ke_name);

    public int deleteke(String ke_name);

}

