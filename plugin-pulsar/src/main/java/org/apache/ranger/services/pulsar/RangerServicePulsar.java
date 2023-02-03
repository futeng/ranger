package org.apache.ranger.services.pulsar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.ranger.plugin.model.RangerService;
import org.apache.ranger.plugin.model.RangerServiceDef;
import org.apache.ranger.plugin.service.RangerBaseService;
import org.apache.ranger.plugin.service.ResourceLookupContext;

public class RangerServicePulsar extends RangerBaseService {


    public RangerServicePulsar() {
        super();
    }

    @Override
    public void init(RangerServiceDef serviceDef, RangerService service) {
        super.init(serviceDef, service);
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public HashMap<String, Object> validateConfig() throws Exception {
        HashMap<String, Object> responseData = new HashMap<String, Object>();
        responseData.put("connectivityStatus", true);
        return responseData;
    }

    /**
     * @param context
     * @return
     * @throws Exception
     */
    @Override
    public List<String> lookupResource(ResourceLookupContext context) throws Exception {
        ArrayList<String> testTopicList = new ArrayList<String>();
        testTopicList.add("test");
        testTopicList.add("p64");
        return testTopicList;
    }
}
