package com.san.stum.service;

import com.github.pagehelper.PageInfo;
import com.san.stum.common.Page;
import com.san.stum.entity.GtClass;

public interface IClassService {
    PageInfo<GtClass> selectByCondition(Page page, GtClass gtClass);
}
