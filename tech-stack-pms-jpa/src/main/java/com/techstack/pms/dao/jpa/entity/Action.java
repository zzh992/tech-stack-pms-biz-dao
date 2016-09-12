package com.techstack.pms.dao.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "PMS_ACTION")
public class Action extends BaseEntity {

	private String actionName; 

	/** Permission identification */
	private String action;
	
	private String remark;
	
	private List<Role> roles = new ArrayList<Role>();

	private String actionType;  //GROUP, PERMISSION
	
	private Action parentAction;

	@Column(name="ACTION_NAME")
	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	@Column(name="ACTION")
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name="REMARK")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@ManyToMany(mappedBy = "actions")
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Column(name="ACTION_TYPE")
	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@ManyToOne
	@JoinColumn(name = "PARENT_ID", nullable=true, referencedColumnName = "ID")	
	@NotFound(action = NotFoundAction.IGNORE)
	public Action getParentAction() {
		return parentAction;
	}

	public void setParentAction(Action parentAction) {
		this.parentAction = parentAction;
	}

}
