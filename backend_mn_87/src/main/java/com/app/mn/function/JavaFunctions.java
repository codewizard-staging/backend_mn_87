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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.mn.repository.OrganizationRepository;
import com.app.mn.repository.EmployeePersonalInfoRepository;
import com.app.mn.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
