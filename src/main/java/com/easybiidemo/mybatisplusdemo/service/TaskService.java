package com.easybiidemo.mybatisplusdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.easybiidemo.mybatisplusdemo.entity.Task;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 跟进任务表 服务类
 * </p>
 *
 * @author linyu902
 * @since 2021-03-04
 */
public interface TaskService extends IService<Task> {

    IPage<Task> selectPage(IPage<Task> taskIPage);
}
