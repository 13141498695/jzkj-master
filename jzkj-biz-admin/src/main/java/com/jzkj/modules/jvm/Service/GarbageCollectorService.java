package com.jzkj.modules.jvm.Service;


import com.jzkj.modules.jvm.entity.GarbageCollectorBean;
import com.jzkj.modules.jvm.entity.MemoryPoolBean;

import java.util.List;

/**
 * @author tycoding
 * @date 2019-05-11
 */
public interface GarbageCollectorService {

    GarbageCollectorBean get();

    List<MemoryPoolBean> getPools();
}
