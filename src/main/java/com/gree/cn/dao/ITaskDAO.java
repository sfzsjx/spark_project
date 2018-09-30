package com.gree.cn.dao;

import com.gree.cn.domain.Task;

public interface ITaskDAO {
    /**
     * 根据主键查询任务
     * @param taskid 主键
     * @return 任务
     */
    Task findById(long taskid);
}
