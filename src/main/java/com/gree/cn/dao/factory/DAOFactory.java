package com.gree.cn.dao.factory;

import com.gree.cn.dao.ITaskDAO;
import com.gree.cn.dao.impl.TaskDAOImpl;

/**
 * DAO工厂类
 */
public class DAOFactory {
    public static ITaskDAO getTaskDAO(){
        return new TaskDAOImpl();
    }
}
