package com.mai.profiles_example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("STAGING")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DemoTestConf.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@MockBean(MaiDao.class)
public class MaiServiceTest {

    @MockBean
    MaiDao maiDao;

    @Autowired
    private MaiService maiService;

    @Autowired
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        Mockito.when(maiDao.data()).thenReturn("blablablabl");
    }

    @Test
    public void work() {
        maiService.work();

    }
}