package com.techstack.pms.dao.dto;



/**
 * @Title: PmsAction.java 
 * @Description: 权限实体类
 * @author zzh
 */
public class PmsActionDTO extends PmsBaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**	权限名称	*/
	private String actionName; 
	
	/**	权限标识	*/
	private String action;
	
	/**	权限描述	*/
	private String remark;
	
	private Long parentActionId;
	
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

	public Long getParentActionId() {
		return parentActionId;
	}

	public void setParentActionId(Long parentActionId) {
		this.parentActionId = parentActionId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
