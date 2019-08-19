package com.bdqn.web.admin.service.fallback;

import com.bdqn.common.web.constants.HttpStatusConstants;
import com.bdqn.common.web.dto.BaseResult;
import com.bdqn.common.web.utils.MapperUtils;
import com.bdqn.web.admin.service.UserService;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService {

    @Override
    public String login(String loginCode, String password) {
        BaseResult baseResult = BaseResult.notOk(Lists.newArrayList(
                new BaseResult.Error(String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                        HttpStatusConstants.BAD_GATEWAY.getContent())
                ));

        try {
            return MapperUtils.obj2json(baseResult);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
