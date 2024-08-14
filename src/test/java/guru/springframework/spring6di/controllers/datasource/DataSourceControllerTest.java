package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@ActiveProfiles("DEV")
@SpringBootTest
class DataSourceControllerTest {

    private final DataSourceController dataSourceController;

    @Autowired
    DataSourceControllerTest(DataSourceController dataSourceController) {
        this.dataSourceController = dataSourceController;
    }

    @Test
    void getDataSourceValue() {
        System.out.println(this.dataSourceController.getDataSourceValue());
    }
}