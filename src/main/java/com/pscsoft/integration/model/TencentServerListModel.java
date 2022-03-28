package com.pscsoft.integration.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

@ApiModel
public class TencentServerListModel {
    @NotBlank(message = "secretId不能为空")
    @ApiModelProperty(value = "密钥id", required = true)
    private String secretId;
    @NotBlank(message = "secretKey不能为空")
    @ApiModelProperty(value = "密钥密码", required = true)
    private String secretKey;
    @NotBlank(message = "region不能为空")
    @ApiModelProperty(value = "区域编号", required = true, example = "ap-shanghai")
    private String region;
    @ApiModelProperty(value = "需要访问的域名", required = true, example = "monitor.tencentcloudapi.com")
    private String endpoint;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
