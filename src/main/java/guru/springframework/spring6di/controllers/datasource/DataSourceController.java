package guru.springframework.spring6di.controllers.datasource;

import guru.springframework.spring6di.services.datasource.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSource dataSource;

    @Autowired
    public DataSourceController(@Qualifier("AppDataSource") DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSourceValue() {
        return dataSource.getDataSourceValue();
    }
}
