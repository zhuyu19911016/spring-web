package com.zypcy.expend.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务，每隔5秒执行一次
 */
//@Component
public class UserScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     一个cron表达式有至少6个（也可能7个）有空格分隔的时间元素
     按顺序依次为
     1 秒（0~59）
     2 分钟（0~59）
     3 小时（0~23）
     4 天（0~31）
     5 月（0~11）
     6 星期（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
     7.年份（1970－2099）
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void timerToNow(){
        System.out.println("time:" + dateFormat.format(new Date()));
    }
}
