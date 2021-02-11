package com.cheng.yumall.thirdparty;

import com.cheng.yumall.thirdparty.imgur.ImageResponse;
import com.cheng.yumall.thirdparty.imgur.ImgurAPI;
import okhttp3.*;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName Test
 * @Description TODO
 * @Author cheng
 * @Date 2020/12/26 00:53
 * @Version 1.0
 **/
public class Test {

    static final String PATH = "/Users/cheng/Pictures/潮流藝術/DSC_1333-1.png";
    static final ImgurAPI imgurApi = createImgurAPI();

    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("image", "R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7")
                .build();
        Request request1 = new Request.Builder()
                .url("https://api.imgur.com/3/image")
                .method("POST", body)
                .addHeader("Authorization", "Client-ID 263510bc947600c")
                .build();
        try {
            okhttp3.Response response = client.newCall(request1).execute();
            System.out.println("response.isSuccessful() = " + response.isSuccessful());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            File image = new File(PATH);
            System.out.println("image.getAbsolutePath() = " + image.getAbsolutePath());
            RequestBody request = RequestBody.create(MediaType.parse("image/*"), image);
            System.out.println("request.contentType() = " + request.contentType());
            Call<ImageResponse> call =  imgurApi.postImage(request);
            Response<ImageResponse> res = call.execute();
            System.out.println("res.message() = " + res.message());
            System.out.println("是否成功: " + res.isSuccessful());
            System.out.println(res.body().data.link);
        }catch(Exception err){
            err.printStackTrace();
        }
    }

    static ImgurAPI createImgurAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ImgurAPI.SERVER)
                .build();
        return retrofit.create(ImgurAPI.class);
    }
}
