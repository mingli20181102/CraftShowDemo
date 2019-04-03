package com.tyj.craftshow;

import com.tyj.craftshow.http.BaseResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zcm on 2019/3/29.
 * 存放接口
 * 1.http://www.weather.com.cn/data/sk/101010100.html
 */
public interface ApiService {


    //todo 获取角色权限数据信息
    @FormUrlEncoded
    @POST("Login!getRolePermission.action")
    Observable<BaseResponse> queryUserPermissionInfo(@FieldMap Map<String, Object> map);
}
