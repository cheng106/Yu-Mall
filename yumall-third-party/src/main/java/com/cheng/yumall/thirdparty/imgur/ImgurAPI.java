package com.cheng.yumall.thirdparty.imgur;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @ClassName ImgurAPI
 * @Description TODO
 * @Author cheng
 * @Date 2020/12/26 00:46
 * @Version 1.0
 **/

public interface ImgurAPI {
    String SERVER = "https://api.imgur.com";
    String AUTH = "263510bc947600c";

    @Headers("Authorization: Client-ID " + AUTH)
    @POST("/3/upload")
    Call<ImageResponse> postImage(@Body RequestBody image);

}
