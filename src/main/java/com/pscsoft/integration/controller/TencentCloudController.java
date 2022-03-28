package com.pscsoft.integration.controller;

import com.pscsoft.integration.model.StandardView;
import com.pscsoft.integration.model.TencentDescribeStatisticModel;
import com.pscsoft.integration.model.TencentMetricModel;
import com.pscsoft.integration.model.TencentMonitorModel;
import com.pscsoft.integration.service.TencentCloudService;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "腾讯云API")
@RestController
@RequestMapping("/integration/tencent")
public class TencentCloudController {

    @Autowired
    TencentCloudService tencentCloudService;

    @ApiOperation("获取云监控服务列表")
    @GetMapping("/serverList")
    public String getServerList(@RequestParam(value = "secretId") String secretId,
                                @RequestParam(value = "secretKey") String secretKey,
                                @RequestParam(value = "region", defaultValue = "ap-shanghai") String region,
                                @RequestParam(value = "endpoint", defaultValue = "monitor.tencentcloudapi.com")
                                        String endpoint
    ) throws TencentCloudSDKException {
        return tencentCloudService.getServerList(secretId, secretKey, region, endpoint);
    }

    @ApiOperation("根据metricName查询监控指标")
    @PostMapping("/metric")
    public String getMetric(@Validated @RequestBody TencentMetricModel model) throws TencentCloudSDKException {
        return tencentCloudService.getMetric(model);
    }

    @ApiOperation("根据维度条件查询K8S监控数据")
    @PostMapping("/describeStatistic")
    public String getDescribeStatistic(@Validated @RequestBody TencentDescribeStatisticModel model) throws TencentCloudSDKException {
        return tencentCloudService.getDescribeStatistic(model);
    }

    @ApiOperation("拉取指标监控数据")
    @PostMapping("/monitor")
    public StandardView getMonitor(@Validated @RequestBody TencentMonitorModel model) throws Exception {
        return tencentCloudService.getMonitor(model);
    }
}
