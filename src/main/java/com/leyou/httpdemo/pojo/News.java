package com.leyou.httpdemo.pojo;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @program: SpringBoot_Demo2
 * @description: 实体类
 * @author: 张军
 * @create: 2019-09-29 20:12
 **/

public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer newsId;
    private String newsTitle;
    private String newsContent;
    private Timestamp newsTime;//设置字段类型为timestamp。然后下面默认值填写CURRENT_TIMESTAMP 下面那个根据当前时间戳更新 勾上
    private String adminName;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Timestamp getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Timestamp newsTime) {
        this.newsTime = newsTime;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsTime=" + newsTime +
                ", adminName='" + adminName + '\'' +
                '}';
    }
}
