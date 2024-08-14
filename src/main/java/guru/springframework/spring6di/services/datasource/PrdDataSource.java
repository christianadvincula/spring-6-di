package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PRD")
@Service("AppDataSource")
public class PrdDataSource implements DataSource {
    @Override
    public String getDataSourceValue() {
        return "datasource - PRD";
    }
}
