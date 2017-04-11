package com.huangj.util;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by HuangJ on 2016/10/30.15:08
 */
public interface XMService {
    @GET
    Call<ResponseBody> getXMJSON(@Url String url);
}
