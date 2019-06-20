package httptest.testservice;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import httptest.service.WeekReportService;

public class MyHttpTest {
	private static final String LOCAL_SAVE_URL = "http://127.0.0.1:8000/statistics/addpersplaclist/";

	@Test
	public void testPostSave() throws Exception {
		WeekReportService wrService = new WeekReportService();
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(LOCAL_SAVE_URL);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("persplaclist", wrService.getTodayWeekReportContent()));
		httpPost.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
		CloseableHttpResponse postReps = httpclient.execute(httpPost);
		try {
			System.out.println(postReps.getStatusLine());
			HttpEntity postEntity = postReps.getEntity();
			String repsStr = EntityUtils.toString(postEntity);
			System.out.println(JSON.parse(repsStr));
		} finally {
			postReps.close();
		}
	}

}
