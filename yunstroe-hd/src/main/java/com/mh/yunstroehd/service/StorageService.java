package com.mh.yunstroehd.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.yunstroehd.entity.Storage;


public interface StorageService extends IService<Storage> {

    IPage pageCC(IPage<Storage> page, Wrapper wrapper);
}
