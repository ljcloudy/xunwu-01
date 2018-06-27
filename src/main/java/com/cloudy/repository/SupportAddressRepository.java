package com.cloudy.repository;

import com.cloudy.entity.SupportAddress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ljy_cloudy on 2018/6/10.
 */
public interface SupportAddressRepository extends CrudRepository<SupportAddress, Long> {
    /**
     * 获取所有对应行政级别的信息
     * @param level
     * @return
     */
    List<SupportAddress> findAllByLevel(String level);

    List<SupportAddress> findAllByLevelAndBelongTo(String level,String cityEnName);

    SupportAddress findByEnNameAndLevel(String cityEnName,String level);

    SupportAddress findByEnNameAndBelongTo(String regionEnName,String  cityEnName);
}
