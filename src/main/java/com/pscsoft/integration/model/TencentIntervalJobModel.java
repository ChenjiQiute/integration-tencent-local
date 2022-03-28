package com.pscsoft.integration.model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.util.Map;

public class TencentIntervalJobModel {
    @NotBlank(message = "instanceId不能为空")
    @ApiModelProperty(value = "实例id", required = true)
    private String instanceId;
    @NotBlank(message = "type不能为空")
    @ApiModelProperty(value = "实例类型", required = true)
    private String type;
    @NotBlank(message = "bootstrapServers名称不能为空")
    @ApiModelProperty(value = "kafka的bootstrapServers", required = true)
    private String bootstrapServers;
    @NotBlank(message = "topic不能为空")
    @ApiModelProperty(value = "topic", required = true)
    private String topic;
    @ApiModelProperty(value = "指定kafka partition的key，选填")
    private String key;
    @ApiModelProperty(value = "任务间隔时间，单位秒", required = true)
    private int intervalSeconds;
    @NotBlank(message = "param不能为空")
    @ApiModelProperty(value = "监控数据的必要入参，json格式", required = true)
    private Map<String, Object> param;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIntervalSeconds() {
        return intervalSeconds;
    }

    public void setIntervalSeconds(int intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    public Map<String, Object> getParam() {
        return param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }
}
