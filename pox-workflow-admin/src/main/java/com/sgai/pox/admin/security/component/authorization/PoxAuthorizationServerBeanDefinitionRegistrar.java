package com.sgai.pox.admin.security.component.authorization;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author pox
 * @date 2020年7月18日
 */
@Slf4j
public class PoxAuthorizationServerBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /***
     * 资源服务器默认bean名称
     */
    String AUTHORIZATION_SERVER_CONFIGURER = "authorizationServerConfigurer";

    /**
     * 根据注解值动态注入资源服务器的相关属性
     *
     * @param metadata 注解信息
     * @param registry 注册器
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.genericBeanDefinition(PoxAuthorizationServerConfigurerAdapter.class);
        registry.registerBeanDefinition(AUTHORIZATION_SERVER_CONFIGURER, beanDefinitionBuilder.getBeanDefinition());
    }

}
