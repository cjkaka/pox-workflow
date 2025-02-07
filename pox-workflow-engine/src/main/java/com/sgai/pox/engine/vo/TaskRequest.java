package com.sgai.pox.engine.vo;

import java.util.Map;

import lombok.Data;

/**
 * @author pox
 * @date 2020年3月24日
 */
@Data
public class TaskRequest {
    private String taskId;
    private String userId;
    private String message;
    private String activityId;
    private String activityName;
    private Map<String, Object> values;
    private CcToVo[] ccToVos;
    private String[] taskIds;
}
