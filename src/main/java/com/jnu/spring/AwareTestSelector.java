package com.jnu.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class AwareTestSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        if (importingClassMetadata.hasAnnotation("org.springframework.boot.autoconfigure.SpringBootApplication")) {
            // 判断是否包含某个注解
            log.info("包含这个注解");
        }

        return new String[]{"com.jnu.spring.AwareTest"};
    }
}
