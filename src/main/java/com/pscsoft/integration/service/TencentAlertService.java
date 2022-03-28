package com.pscsoft.integration.service;

import com.pscsoft.integration.model.StandardView;
import com.pscsoft.integration.tools.KafkaTool;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class TencentAlertService {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    /**
     * 腾讯云告警回调，文档地址：https://cloud.tencent.com/document/product/248/50409
     * @param data
     * @return
     */
    public StandardView sendAlert(String data) {
        //发送数据
        KafkaTool kafkaTool = new KafkaTool(bootstrapServers, "");
        Properties producerProps = kafkaTool.getProducerProp();
        KafkaProducer<String, String> producer = new KafkaProducer<>(producerProps);
        ProducerRecord<String, String> producerRecord = new ProducerRecord<>("idc_qcloud_alert_callback_default", data);
        try {
            producer.send(producerRecord).get();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.close();
        }
        return new StandardView("");
    }
}