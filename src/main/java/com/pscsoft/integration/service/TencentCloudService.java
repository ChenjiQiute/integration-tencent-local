package com.pscsoft.integration.service;

import com.pscsoft.integration.model.StandardView;
import com.pscsoft.integration.model.TencentDescribeStatisticModel;
import com.pscsoft.integration.model.TencentMetricModel;
import com.pscsoft.integration.model.TencentMonitorModel;
import com.pscsoft.tencent.cloud.tools.TencentAPI;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TencentCloudService {
    @Resource
    TencentAPI tencentAPI;

    public String getServerList(String secretId, String secretKey, String region, String endpoint)
            throws TencentCloudSDKException {
        return tencentAPI.getServerList(secretId, secretKey, region, endpoint);
    }

    public String getMetric(TencentMetricModel model) throws TencentCloudSDKException {
        return tencentAPI.getMetric(model.getSecretId(), model.getSecretKey(), model.getRegion(), model.getNamespace(),
                model.getMetricName(), model.getEndpoint());
    }

    public String getDescribeStatistic(TencentDescribeStatisticModel model) throws TencentCloudSDKException {
        return tencentAPI.getDescribeStatistic(model.getSecretId(), model.getSecretKey(), model.getRegion(),
                model.getEndpoint(), model.getModule(), model.getNamespace(), model.getMetricName(), model.getPeriod(),
                model.getStartTime(), model.getEndTime(), model.getDescribeConditionList(), model.getGroupBys());
    }

    public StandardView getMonitor(TencentMonitorModel model) throws Exception {
        if (!tencentAPI.conformStartTime(model.getStartTime())){
            return new StandardView("开始时间超过31天!", HttpStatus.SC_BAD_REQUEST);
        }
        String data = tencentAPI.getMonitorData(model.getSecretId(), model.getSecretKey(), model.getRegion(),
                model.getEndpoint(), model.getMetricName(), model.getNamespace(), model.getInstances(),
                model.getPeriod(), model.getStartTime(), model.getEndTime());
        return new StandardView(data);
    }
}
