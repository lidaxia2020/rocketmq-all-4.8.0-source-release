package org.apache.rocketmq.test.test;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.tools.admin.DefaultMQAdminExt;

/**
 * @author lijiannan
 * @version 1.0
 * @date 2021/5/20 10:45
 */
public class DefaultMQAdminExtTest {

    public static void main(String[] args) throws MQClientException {
        DefaultMQAdminExt defaultMQAdminExt = new DefaultMQAdminExt("testAdminExt");
        defaultMQAdminExt.setNamesrvAddr(ProducerTest.NAME_SRV_ADDR);
        defaultMQAdminExt.start();

        defaultMQAdminExt.createTopic("testTopic", "topic", 4);
    }
}
