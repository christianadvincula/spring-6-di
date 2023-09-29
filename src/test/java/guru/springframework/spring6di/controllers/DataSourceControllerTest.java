package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("default")
@SpringBootTest
class DataSourceControllerTest {

    @Autowired
    DataSourceController controller;

    @Test
    void getDataSource() {
        System.out.println(controller.getDataSource());
    }
}