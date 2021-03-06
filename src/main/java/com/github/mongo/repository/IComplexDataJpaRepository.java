package com.github.mongo.repository;

import com.github.mongo.pojo.doo.ComplexDataDO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * <p>
 * 创建时间为 上午11:41 2019/10/8
 * 项目名称 spring-boot-mongo
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IComplexDataJpaRepository extends PagingAndSortingRepository<ComplexDataDO, String> {


}
