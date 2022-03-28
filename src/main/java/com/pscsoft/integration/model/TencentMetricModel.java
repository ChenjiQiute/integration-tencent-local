package com.pscsoft.integration.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * 查询指标入参
 */
@ApiModel
public class TencentMetricModel {
    @NotBlank(message = "secretId不能为空")
    @ApiModelProperty(value = "密钥id", required = true)
    private String secretId;
    @NotBlank(message = "secretKey不能为空")
    @ApiModelProperty(value = "密钥密码", required = true)
    private String secretKey;
    @NotBlank(message = "region不能为空")
    @ApiModelProperty(value = "区域编号", required = true)
    private String region = "ap-shanghai";
    @NotBlank(message = "namespace不能为空")
    @ApiModelProperty(value = "业务命名空间", required = true)
    private String namespace = "QCE/CVM";
    @ApiModelProperty(value = "指标名称", required = true)
    private String metricName;
    @NotBlank(message = "endpoint不能为空")
    @ApiModelProperty(value = "需要访问的域名", required = true)
    private String endpoint = "monitor.tencentcloudapi.com";

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
