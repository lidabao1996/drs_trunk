package com.kingyee.drs_trunk.price.controller;

import com.kingyee.drs_trunk.base.response.BaseResponse;
import com.kingyee.drs_trunk.common.utils.ObjectUtil;
import com.kingyee.drs_trunk.price.entity.DrugWeightEntity;
import com.kingyee.drs_trunk.price.service.PriceWeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.util.Date;

@Controller
@RequestMapping("/price")
public class DrugWeightController {
    @Autowired
    private PriceWeightService priceWeightService;

    @Transactional
    @RequestMapping(value = "/drugWeightSave", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse drugWeightSave(@RequestParam(value = "jsonStr") String jsonStr) {
        BaseResponse baseResponse = new BaseResponse();

        if (ObjectUtil.isNull(jsonStr)) {
            baseResponse.setSuccess(false);
            baseResponse.setMsg("json不能为空");
            return baseResponse;
        }

        try {
            String json = URLDecoder.decode(jsonStr, "UTF-8");
            JSONObject jsonObj = new JSONObject(json);
            String userIdStr = jsonObj.optString("userId");// 用户id
            String searchText = jsonObj.optString("searchText");
            String searchResult = jsonObj.optString("searchResult");
            String drugTypeName = jsonObj.optString("drugTypeName");
            String drugType = jsonObj.optString("drugType");
            String drugName = jsonObj.optString("drugName");// 药品名称
            String whetherHistroyLog = jsonObj.optString("whetherHistroyLog");// 默认否
            String dosage = jsonObj.optString("dosage");// 剂型
            String versionName = jsonObj.optString("versionName");
            String deviceType = jsonObj.optString("deviceType");

            if (ObjectUtil.isNull(userIdStr)) {
                baseResponse.setSuccess(false);
                baseResponse.setMsg("用户没有登录");
                return baseResponse;
            }

            DrugWeightEntity drugWeightEntity = new DrugWeightEntity();
            Long userId = Long.parseLong(userIdStr);
            drugWeightEntity.setUserId(userId);
            drugWeightEntity.setSearchText(searchText);
            drugWeightEntity.setSearchResult(searchResult);
            drugWeightEntity.setCreateTime(new Date().getTime());
            drugWeightEntity.setDeviceType(deviceType);
            drugWeightEntity.setDrugTypeName(drugTypeName);
            drugWeightEntity.setDrugType(drugType);
            drugWeightEntity.setDrugName(drugName);
            drugWeightEntity.setDosage(dosage);
            drugWeightEntity.setWhetherHistoryLog(whetherHistroyLog);
            drugWeightEntity.setVersionName(versionName);

            priceWeightService.drugWeightSave(drugWeightEntity);
            baseResponse.setSuccess(true);
            baseResponse.setMsg("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseResponse;
    }
}
