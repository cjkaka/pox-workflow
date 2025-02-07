package  com.sgai.pox.engine.mapper.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sgai.pox.engine.entity.sys.SysConfig;

/**
 * 系统参数Mapper
 *
 * @author pox
 */
public interface SysConfigMapper extends BaseMapper<SysConfig> {
    /**
     * 查询系统参数列表
     *
     * @param page
     * @param entity
     * @return
     */
    public List<SysConfig> list(IPage<SysConfig> page, @Param("entity") SysConfig entity);
}
