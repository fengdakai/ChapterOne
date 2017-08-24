package com.fk.ChapterOne;

import com.fk.ChapterOne.controller.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * rabbitMq
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterOneApplicationTestsTwo {

	@Autowired
	private Sender sender;

	@Test
	public void testUserController() throws Exception {
		sender.send();
	}

}
