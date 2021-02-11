package com.cheng.yumall.thirdparty;

import com.cheng.yumall.thirdparty.imgur.ImgurAPI;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest
class YumallThirdPartyApplicationTests {

	static final String PATH = "/Users/cheng/Pictures/潮流藝術/DSC_1333-1.png";

	@Test
	void contextLoads() {
	}

	@Test
	void test() throws IOException {
		File image = new File(PATH);
		OkHttpClient client = new OkHttpClient().newBuilder()
				.build();
		MediaType mediaType = MediaType.parse("text/plain");
		RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
				.addFormDataPart("image", "https://i0.wp.com/www.design-hu.com/wp-content/uploads/2018/04/domain-1-768x418.png")
				.build();
		Request request = new Request.Builder()
				.url("https://api.imgur.com/3/image")
				.method("POST", body)
				.addHeader("Authorization", "Client-ID 263510bc947600c")
				.build();
		Response response = client.newCall(request).execute();
	}

}
