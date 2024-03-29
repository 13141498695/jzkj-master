package com.jzkj.modules.jvm.Service.impl;


import com.jzkj.modules.jvm.Service.SystemInfoService;
import com.jzkj.modules.jvm.entity.SystemBean;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * @author tycoding
 * @date 2019-05-10
 */
@Service
public class SystemInfoServiceImpl implements SystemInfoService {

    @Override
    public SystemBean get() {
        return init();
    }

    private SystemBean init() {
        SystemBean bean = new SystemBean();
        OperatingSystemMXBean mxBean = ManagementFactory.getOperatingSystemMXBean();
        bean.setName(mxBean.getName());
        bean.setProcessCount(mxBean.getAvailableProcessors());
        // System.getProperty("os.arch");
        bean.setOsArchName(mxBean.getArch());
        bean.setLoadAverage(mxBean.getSystemLoadAverage());
        // System.getProperty("os.version");
        bean.setVersion(mxBean.getVersion());
        return bean;
    }
}
