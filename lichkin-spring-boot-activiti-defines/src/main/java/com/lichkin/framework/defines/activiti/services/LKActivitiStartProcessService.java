package com.lichkin.framework.defines.activiti.services;

import com.lichkin.framework.defines.activiti.beans.in.LKActivitiStartProcessIn;
import com.lichkin.framework.defines.activiti.beans.out.LKActivitiStartProcessOut;

/**
 * 启动流程服务类
 * @author SuZhou LichKin Information Technology Co., Ltd.
 */
public interface LKActivitiStartProcessService<StartProcessIn extends LKActivitiStartProcessIn, StartProcessOut extends LKActivitiStartProcessOut> {

	/**
	 * 启动流程
	 * @param in 入参
	 * @return 流程实例
	 */
	public StartProcessOut startProcess(StartProcessIn in);

}
