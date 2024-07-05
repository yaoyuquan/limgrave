package cn.toguide.limgrave.system.registry.service;

import cn.toguide.limgrave.system.registry.dao.RegistryDao;
import cn.toguide.limgrave.system.registry.entity.AccountQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistryService {

    @Autowired
    private RegistryDao registryDao;


    public Long count(AccountQuery query) {
        return registryDao.count(query);
    }
}
