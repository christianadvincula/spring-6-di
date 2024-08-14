package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("AppDataSource")
public class UatDataSource implements DataSource {
    @Override
    public String getDataSourceValue() {
        return "datasource - UAT";
    }
}
