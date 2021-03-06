package com.hu.zhcc.shiro.service;


import com.hu.zhcc.shiro.entity.dto.AvailableResourceDTO;
import com.hu.zhcc.shiro.entity.dto.ResourceDTO;
import com.hu.zhcc.shiro.entity.dto.ResourcePermissionDTO;
import com.hu.zhcc.shiro.entity.bo.Resource;

import java.util.List;

/**
 * 资源服务接口
 * 
 * @author hulichao
 * @date 2018/3/25
 */
public interface ResourceService {
	
	/**
	 * 得到所有可用的资源
	 * @return
	 */
	List<AvailableResourceDTO> listAllAvailable();
	
	/**
	 * 得到用户授权的资源
	 * @param userId 用户Id
	 * @return
	 */
	List<ResourceDTO> listAuthorizedByUserId(int userId);
	
	/**
	 * 根据路由id得到资源列表
	 * @param routerId
	 * @return
	 */
	List<ResourceDTO> listByRouterId(int routerId);
	
	/**
	 * 根据id得到资源
	 * @param id
	 * @return
	 */
	ResourceDTO getById(int id);
	
	/**
	 * 添加资源
	 * @param dto
	 * @return 新增资源的主键值
	 */
	int saveResource(ResourceDTO dto);
	
	/**
	 * 更新资源
	 * @param dto
	 * @return 数据库中受影响的行数
	 */
	int updateResource(ResourceDTO dto);
	
	/**
	 * 删除资源
	 * @param id
	 * @return 数据库中受影响的行数
	 */
	int removeResource(int id);
	
	   /**
     * 得到用户资源权限
     * 
     * @param userId
     *            用户Id
     * @return
     */
    List<Resource> listPermissionByUserId(int userId);
    
    /**
     * 根据路由id得到资源权限
     * @param userId
     * @param routerId
     * @return
     */
    List<ResourcePermissionDTO> listPermission(int userId, int routerId);

    /**
     * 得到用户资源权限代码
     * 
     * @param userId
     *            用户Id
     * @return
     */
    List<String> listPermissionCodeByUserId(int userId);

}