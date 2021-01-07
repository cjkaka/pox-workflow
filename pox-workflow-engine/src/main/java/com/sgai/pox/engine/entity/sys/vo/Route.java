package com.sgai.pox.engine.entity.sys.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pox
 * @date 2020年3月24日
 */
@Data
public class Route implements Serializable {
    private static final long serialVersionUID = 1L;

    private String routeId;
    private String path;
    private String component;
    private String redirect;
    private Boolean hidden;
    private String name;
    private String routeParentId;
    private Meta meta;
    private List<Route> children;

    public void addChildren(Route route) {
        if (children == null) {
            children = new ArrayList<Route>();
        }
        children.add(route);
    }
}
