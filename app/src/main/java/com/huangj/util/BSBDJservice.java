package com.huangj.util;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by HuangJ on 2016/10/28.9:54
 */
public interface BSBDJservice {

  @GET
  Call<ResponseBody> getSPJson(@Url String url);

  @GET
  Call<ResponseBody> getTextJson(@Url String url);

  @GET
  Call<ResponseBody> getTextInfoJson(@Url String url);


}
