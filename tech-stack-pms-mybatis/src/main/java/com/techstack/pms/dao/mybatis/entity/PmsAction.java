package com.techstack.pms.dao.mybatis.entity;

import com.techstack.component.mybatis.annotation.Column;
import com.techstack.component.mybatis.annotation.Table;


/**
 * @Title: PmsAction.java 
 * @Description: 权限实体类
 * @author zzh
 */
@Table(name="PMS_ACTION")
public class PmsAction extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	/**	权限名称	*/
	@Column(name="ACTION_NAME")
	private String actionName; 
	
	/**	权限标识	*/
	@Column(name="ACTION")
	private String action;
	
	/**	权限描述	*/
	@Column(name="REMARK")
	private String remark;
	
	@Column(name="PARENT_ID")
	private Long parentId;
	
	@Column(name="ACTION_TYPE")
	private String actionType;

	/**
	 * @return 权限名称
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * @param 权限名称
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * @return 权限标识
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param 权限标识
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return 权限描述
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param 权限描述
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
