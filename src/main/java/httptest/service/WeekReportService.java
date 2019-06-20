package httptest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

import httptest.pagemodel.WeekReport;

public class WeekReportService {

	public String getTodayWeekReportContent() {
		return JSON.toJSONString(mockWeekReportList());
	}

	private List<WeekReport> mockWeekReportList() {

		List<WeekReport> mockList = new ArrayList<WeekReport>();
		for (int i = 0; i < 4; i++) {
			mockList.add(new WeekReport("WB2898", "宋桢熙", 619, new Date(), 8.000, "测试数据"));
		}
		return mockList;
	}
}
