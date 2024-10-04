package com.app.mn.function;

import com.app.mn.model.Organization;
import com.app.mn.model.EmployeePersonalInfo;
import com.app.mn.model.EmlpoyeeProfile;




import com.app.mn.enums.EmploymentType;
import com.app.mn.enums.OrgDept;
import com.app.mn.enums.OrgBranch;
import com.app.mn.converter.OrgBranchConverter;
import com.app.mn.converter.EmploymentTypeConverter;
import com.app.mn.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  