package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("dataSourceService")
public class DataSourceServiceQa implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA datasource";
    }
}
