package com.sgai.pox.engine.wapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgai.pox.engine.common.ResponseFactory;

/**
 * @author 庄金明
 * @date 2020年3月22日
 */
@Component
public class CommentListWrapper implements IListWrapper {

    @Autowired
    private ResponseFactory responseFactory;

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public List execute(List list) {
        return responseFactory.createCommentResponseList(list);
    }
}
