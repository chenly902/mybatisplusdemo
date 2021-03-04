package com.easybiidemo.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.easybiidemo.mybatisplusdemo.entity.Task;
import com.easybiidemo.mybatisplusdemo.mapper.TaskMapper;
import com.easybiidemo.mybatisplusdemo.service.TaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 跟进任务表 服务实现类
 * </p>
 *
 * @author linyu902
 * @since 2021-03-04
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public IPage<Task> selectPage(IPage<Task> taskIPage) {

        IPage<Task> iPage = taskMapper.selectPage(taskIPage, new QueryWrapper<>());

        return iPage;
    }
}
