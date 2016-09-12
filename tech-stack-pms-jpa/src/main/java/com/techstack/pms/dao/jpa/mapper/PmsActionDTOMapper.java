package com.techstack.pms.dao.jpa.mapper;

import com.techstack.pms.dao.dto.PmsActionDTO;
import com.techstack.pms.dao.jpa.entity.Action;

public class PmsActionDTOMapper {

	public static Action toPmsAction(PmsActionDTO pmsActionDTO) {
		Action action = null;
		if (pmsActionDTO != null) {
			action = new Action();
			action.setId(pmsActionDTO.getId());
			action.setVersion(pmsActionDTO.getVersion());
			action.setCreateTime(pmsActionDTO.getCreateTime());
			action.setAction(pmsActionDTO.getAction());
			action.setActionName(pmsActionDTO.getActionName());
			action.setActionType(pmsActionDTO.getActionType());
			action.setRemark(pmsActionDTO.getRemark());
			if(pmsActionDTO.getParentActionId() != null){
				Action parentAction = new Action();
				parentAction.setId(pmsActionDTO.getParentActionId());
				action.setParentAction(parentAction);
			}
		}
		return action;
	}

	public static PmsActionDTO toPmsActionDTO(Action action) {
		PmsActionDTO pmsActionDTO = null;
		if (action != null) {
			pmsActionDTO = new PmsActionDTO();
			pmsActionDTO.setId(action.getId());
			pmsActionDTO.setVersion(action.getVersion());
			pmsActionDTO.setCreateTime(action.getCreateTime());
			pmsActionDTO.setAction(action.getAction());
			pmsActionDTO.setActionName(action.getActionName());
			pmsActionDTO.setActionType(action.getActionType());
			pmsActionDTO.setRemark(action.getRemark());
			if(action.getParentAction()!=null){
				pmsActionDTO.setParentActionId(action.getParentAction().getId());
			}
		}
		return pmsActionDTO;
	}
}
