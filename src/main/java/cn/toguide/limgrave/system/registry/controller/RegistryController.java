package cn.toguide.limgrave.system.registry.controller;

import cn.toguide.limgrave.base.DataResponse;
import cn.toguide.limgrave.system.registry.entity.AccountQuery;
import cn.toguide.limgrave.system.registry.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registry")
public class RegistryController {

    @Autowired
    private RegistryService registryService;


    @GetMapping("/email")
    public DataResponse<Long> checkEmailExists(@RequestParam String email) {

        AccountQuery query = new AccountQuery(email);

        return DataResponse.success(registryService.count(query));
    }

}
