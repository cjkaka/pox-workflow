package com.sgai.pox.engine.service.sys;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sgai.pox.engine.common.core.base.BaseService;
import com.sgai.pox.engine.entity.sys.SysCodeType;

/**
 * 代码类别Service
 *
 * @author pox
 */
public interface SysCodeTypeService extends BaseService<SysCodeType> {

    /**
     * 分页查询代码类别
     *
     * @param page
     * @param sysCodeType
     * @return
     */
    IPage<SysCodeType> list(IPage<SysCodeType> page, SysCodeType sysCodeType);

    /**
     * 删除数据字典信息
     *
     * @param ids
     */
    void deleteSysCodeType(String ids);
}
