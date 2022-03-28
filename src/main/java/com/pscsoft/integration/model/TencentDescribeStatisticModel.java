package com.pscsoft.integration.model;

import com.pscsoft.tencent.cloud.model.DescribeCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.util.List;

@ApiModel
public class TencentDescribeStatisticModel {
    @NotBlank(message = "secretId不能为空")
    @ApiModelProperty(value = "密钥id", required = true)
    private String secretId;
    @NotBlank(message = "secretKey不能为空")
    @ApiModelProperty(value = "密钥", required = true)
    private String secretKey;
    @NotBlank(message = "region不能为空")
    @ApiModelProperty(value = "区域编号", required = true, example = "ap-shanghai")
    private String region;
    @NotBlank(message = "endpoint不能为空")
    @ApiModelProperty(value = "需要访问的域名", required = true, example = "monitor.tencentcloudapi.com")
    private String endpoint;
    @NotBlank(message = "module不能为空")
    @ApiModelProperty(value = "所属模块", required = true)
    private String module;
    @NotBlank(message = "namespace不能为空")
    @ApiModelProperty(value = "业务命名空间", required = true)
    private String namespace = "QCE/CVM";
    @NotBlank(message = "metricName不能为空")
    @ApiModelProperty(value = "指标数组", required = true)
    private List<String> metricName;
    @ApiModelProperty(value = "统计粒度。默认取值为300，单位为s")
    private Long period;
    @ApiModelProperty(value = "起始时间，默认为当前时间，类型Timestamp ISO8601，如2020-12-08T19:51:23+08:00")
    private String startTime;
    @ApiModelProperty(value = "结束时间，默认为当前时间，类型Timestamp ISO8601，如2020-12-08T19:51:23+08:00")
    private String EndTime;
    @ApiModelProperty(value = "维度条件")
    private List<DescribeCondition> describeConditionList;
    @ApiModelProperty(value = "按指定维度groupBy")
    private List<String> groupBys;

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

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<String> getMetricName() {
        return metricName;
    }

    public void setMetricName(List<String> metricName) {
        this.metricName = metricName;
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
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public List<String> getGroupBys() {
        return groupBys;
    }

    public void setGroupBys(List<String> groupBys) {
        this.groupBys = groupBys;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public List<DescribeCondition> getDescribeConditionList() {
        return describeConditionList;
    }

    public void setDescribeConditionList(List<DescribeCondition> describeConditionList) {
        this.describeConditionList = describeConditionList;
    }

}
