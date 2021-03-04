package com.easybiidemo.mybatisplusdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easybiidemo.mybatisplusdemo.entity.Task;
import com.easybiidemo.mybatisplusdemo.param.TaskParam;
import com.easybiidemo.mybatisplusdemo.service.TaskService;
import com.easybiidemo.mybatisplusdemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 跟进任务表 前端控制器
 * </p>
 *
 * @author linyu902
 * @since 2021-03-04
 */
@Api(tags = "跟进任务相关Api")
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @ApiOperation(value="跟进任务列表")
    @PostMapping(value = "/list")
    public Result list(@RequestBody TaskParam taskParam) {

        Integer page = taskParam.getPage();
        Integer size = taskParam.getSize();

        IPage<Task> taskIPage = new Page<>(page,size);

        taskIPage = taskService.selectPage(taskIPage);

        return Result.success(taskIPage);
    }

    @ApiOperation(value="添加跟进任务")
    @PostMapping(value = "/add")
    public Result add(@RequestBody Task task) {

        boolean save = taskService.save(task);

        return Result.success(save);
    }

}

