package  com.sgai.pox.engine.mapper.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sgai.pox.engine.entity.sys.SysCodeType;

/**
 * 代码类别Mapper
 *
 * @author pox
 */
public interface SysCodeTypeMapper extends BaseMapper<SysCodeType> {
    /**
     * 查询代码类别列表
     *
     * @param page
     * @param entity
     * @return
     */
    public List<SysCodeType> list(IPage<SysCodeType> page, @Param("entity") SysCodeType entity);
}
