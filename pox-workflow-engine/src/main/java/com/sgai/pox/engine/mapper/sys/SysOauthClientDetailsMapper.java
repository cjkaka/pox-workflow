package  com.sgai.pox.engine.mapper.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sgai.pox.engine.entity.sys.SysOauthClientDetails;

/**
 * 应用客户端Mapper
 *
 * @author pox
 */
public interface SysOauthClientDetailsMapper extends BaseMapper<SysOauthClientDetails> {
    /**
     * 查询应用客户端列表
     *
     * @param page
     * @param entity
     * @return
     */
    public List<SysOauthClientDetails> list(IPage<SysOauthClientDetails> page,
                                            @Param("entity") SysOauthClientDetails entity);
}
