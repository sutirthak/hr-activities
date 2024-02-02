package com.projects.controller;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qinvent.hr.controller.EmpController;

/**
 * Test class for EmpController
 */
@SpringBootTest(classes = {EmpController.class})
class EmpControllerTest {

	@Autowired
	private EmpController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
