package com.sgai.pox.engine.service.sys;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sgai.pox.engine.common.core.base.BaseService;
import com.sgai.pox.engine.entity.sys.SysPostUser;

/**
 * 岗位和用户关系Service
 *
 * @author pox
 */
public interface SysPostUserService extends BaseService<SysPostUser> {
    /**
     * 分页查询岗位和用户关系
     *
     * @param page
     * @param sysPostUser
     * @return
     */
    IPage<SysPostUser> list(IPage<SysPostUser> page, SysPostUser sysPostUser);
}
