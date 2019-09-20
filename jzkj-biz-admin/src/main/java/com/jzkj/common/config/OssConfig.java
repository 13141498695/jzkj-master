package com.jzkj.common.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix="spring.ossconfig")
public class OssConfig {

    private String accessKeyId;

    private String accessKeySecret;

    private String bucketName;

    private String endpoint;


    private String getUrl;





}
