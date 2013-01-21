package com.wondersgroup.cuteflow.engine;

import org.springframework.test.*;

public class AbstractWorkflowTestCase extends AbstractTransactionalDataSourceSpringContextTests {

	protected String[] getConfigLocations() {
		return new String[] { "classpath*:*Context.xml" };
	}

	public void onTearDownInTransaction() {
	}

}
