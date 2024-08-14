package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("AppDataSource")
public class QaDataSource implements DataSource {
    @Override
    public String getDataSourceValue() {
        return "datasource - QA";
    }
}
