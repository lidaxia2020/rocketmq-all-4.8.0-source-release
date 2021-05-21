package org.apache.rocketmq.test.test;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.Arrays;

/**
 * @author lijiannan
 * @version 1.0
 * @date 2021/5/20 10:08
 */
public class ProducerTest {

    public final static String NAME_SRV_ADDR = "127.0.0.1:9876";

    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer("testProducerGroup");
        defaultMQProducer.setNamesrvAddr(NAME_SRV_ADDR);
        defaultMQProducer.start();


        Message message = new Message("aa","hello".getBytes());

        SendResult send = defaultMQProducer.send(message);
        System.out.println("send = " + send);
    }

}
