package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    private final DataSourceService service;

    public DataSourceController(@Qualifier(value = "dataSourceService") DataSourceService service) {
        this.service = service;
    }

    public String getDataSource() {
        return service.getDataSource();
    }
}
