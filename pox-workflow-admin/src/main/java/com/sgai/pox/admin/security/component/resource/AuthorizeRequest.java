package com.sgai.pox.admin.security.component.resource;

import com.sgai.pox.engine.common.core.constant.SecurityConstants;
import lombok.Data;

import java.util.List;

@Data
public class AuthorizeRequest {
    private String type = SecurityConstants.ANT_MATCHERS;
    private String httpMethod;
    private List<String> antPatterns;
    private String method = "authenticated";
    private String methodParams;
}
