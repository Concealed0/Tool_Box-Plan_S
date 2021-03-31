package com.tcn.kernel.apollo.entity;/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.apollo.entity
 * @ClassName: DemoConfig
 * @Author: dongsong
 * @Description:
 * @Date: 2019/11/14 17:16
 * @Version: 1.0
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 *@program: song-project-server-case
 *@description:
 *@author: by song
 *@create: 2019-11-14 17:16
 */

@ConfigurationProperties(prefix = "song")
@Component("DemoConfig")
@RefreshScope
public class DemoConfig {

    private String song1;
    private String song2;
    private String song3;


    public String getSong1() {
        return song1;
    }

    public void setSong1(String song1) {
        this.song1 = song1;
    }

    public String getSong2() {
        return song2;
    }

    public void setSong2(String song2) {
        this.song2 = song2;
    }

    public String getSong3() {
        return song3;
    }

    public void setSong3(String song3) {
        this.song3 = song3;
    }

    @Override
    public String toString() {
        return "SongConfig{" +
                "song1=" + song1 +
                ", song2='" + song2 + '\'' +
                ", song3=" + song3 +
                '}';
    }
}
