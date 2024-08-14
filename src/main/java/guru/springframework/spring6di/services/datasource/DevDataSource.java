package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("AppDataSource")
public class DevDataSource implements DataSource {

    @Override
    public String getDataSourceValue() {
        return "datasource - DEV";
    }
}
