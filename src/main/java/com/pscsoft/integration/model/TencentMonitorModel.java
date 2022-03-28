package com.pscsoft.integration.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@ApiModel
public class TencentMonitorModel {
    @NotBlank(message = "secretId不能为空")
    @ApiModelProperty(value = "密钥id", required = true)
    private String secretId;
    @NotBlank(message = "secretKey不能为空")
    @ApiModelProperty(value = "密钥密码", required = true)
    private String secretKey;
    @NotBlank(message = "region不能为空")
    @ApiModelProperty(value = "区域编号", required = true, example = "ap-shanghai")
    private String region;
    @NotBlank(message = "endpoint不能为空")
    @ApiModelProperty(value = "需要访问的域名", required = true)
    private String endpoint;
    @NotBlank(message = "metricName不能为空")
    @ApiModelProperty(value = "指标名称", required = true)
    private String metricName;
    @NotBlank(message = "namespace不能为空")
    @ApiModelProperty(value = "业务命名空间", required = true)
    private String namespace;
    @NotNull
    @ApiModelProperty(value = "实例对象的维度组合，格式为key-value键值对形式的集合", required = true)
    private Map<String, String> instances;
    @ApiModelProperty(value = "统计粒度。默认取值为300，单位为s")
    private Long period;
    @ApiModelProperty(value = "起始时间，默认为当前时间，类型Timestamp ISO8601，如2020-12-08T19:51:23+08:00")
    private String startTime;
    @ApiModelProperty(value = "结束时间，默认为当前时间，类型Timestamp ISO8601，如2020-12-08T19:51:23+08:00")
    private String endTime;

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

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Map<String, String> getInstances() {
        return instances;
    }

    public void setInstances(Map<String, String> instances) {
        this.instances = instances;
    }

    public Long getPeriod() {
        return period;
    }

    public void setPeriod(Long period) {
        this.period = period;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
