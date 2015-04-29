package com.ys.jUnit;

import static org.junit.Assert.*;

import java.text.ParseException;
import org.junit.Test;

import com.ys.junit.helper.DateFormatHelper;

public class TestMainController {

	@Test
	public void test() throws ParseException {
		DateFormatHelper dtHelper=new DateFormatHelper();
		assertEquals("Date should be equal to 2014-05-23", "2014-05-23", dtHelper.formateDateYYYYMMDD("05/23/2014"));
	}

}
