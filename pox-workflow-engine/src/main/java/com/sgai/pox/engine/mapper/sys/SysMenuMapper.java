package  com.sgai.pox.engine.mapper.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sgai.pox.engine.entity.sys.SysMenu;

/**
 * 菜单Mapper
 *
 * @author pox
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     * 查询菜单列表
     *
     * @param page
     * @param entity
     * @return
     */
    public List<SysMenu> list(IPage<SysMenu> page, @Param("entity") SysMenu entity);
}
