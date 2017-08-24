package jchanghong;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jiang
 * \* Date: 2017/8/24 0024
 * \* Time: 15:50
 * \用hazelcast模拟分布式分片，复制，一致性。
 * key%size 得到桶。
 * 然后根据桶得到服务器地址。
 * 然后更新
 */
public class DMap {
    public static void main(String[] args) {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
    System.out.println(instance.getConfig().toString());

    }
    
}
