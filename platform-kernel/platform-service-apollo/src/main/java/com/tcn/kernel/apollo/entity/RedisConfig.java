package com.tcn.kernel.apollo.entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Configuration
@ConfigurationProperties(prefix = "redis.cache")
@Component("RedisConfig")
@RefreshScope
public class RedisConfig {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);

    private int expireSeconds;
    private String clusterNodes;
    private int commandTimeout;

    @PostConstruct
    private void initialize() {
        logger.info(
                "SampleRedisConfig initialized - expireSeconds: {}, clusterNodes: {}, commandTimeout: {}",
                expireSeconds, clusterNodes, commandTimeout);
    }

    public void setExpireSeconds(int expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public void setClusterNodes(String clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    public void setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
    }

    public int getExpireSeconds() {
        return expireSeconds;
    }

    public String getClusterNodes() {
        return clusterNodes;
    }

    public int getCommandTimeout() {
        return commandTimeout;
    }

    @Override
    public String toString() {
        return "SampleRedisConfig{" +
                "expireSeconds=" + expireSeconds +
                ", clusterNodes='" + clusterNodes + '\'' +
                ", commandTimeout=" + commandTimeout +
                '}';
    }
}
