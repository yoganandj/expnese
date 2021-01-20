package com.react.expenses.expense.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class InstanceInfoService {

    private static final String HOST_NAME ="HOSTNAME";
    private static final String DEFAULT_ENV_INSTANCE_GUID= "LOCAL";

    @Value("${"+HOST_NAME+":"+DEFAULT_ENV_INSTANCE_GUID+"}")
    private String hostName;

    public String getInstanceInfo(){
        log.info("Instance info : "+hostName+"  : "+hostName.length() + " : "+hostName.substring(hostName.length()-5));
        return hostName.substring(hostName.length()-5);
    }


}
