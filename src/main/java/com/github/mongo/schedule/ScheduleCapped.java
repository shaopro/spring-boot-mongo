package com.github.mongo.schedule;

import com.github.mongo.repository.ICappedDataDoRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 19:24 2019-05-20
 * 项目名称 spring-boot-mongo
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class ScheduleCapped {

    @Resource
    private ICappedDataDoRepository repository;

    @Scheduled(fixedDelay = 1000)
    public void task() {
//        repository.save(CappedDataDO.builder().date(new Date()).build());
    }

}
