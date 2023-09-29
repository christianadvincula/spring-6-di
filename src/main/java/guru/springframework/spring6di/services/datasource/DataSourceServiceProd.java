package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PRD")
@Service("dataSourceService")
public class DataSourceServiceProd implements DataSourceService {
    @Override
    public String getDataSource() {
        return "PRD datasource";
    }
}
