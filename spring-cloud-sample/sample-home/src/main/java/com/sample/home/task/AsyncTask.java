package com.sample.home.task;

import java.util.concurrent.Future;

import lombok.extern.slf4j.Slf4j;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AsyncTask {

	@Async
	 public void dealNoReturnTask(){
	  log.info("Thread {} deal No Return Task start", Thread.currentThread().getName());
	  try {
	   Thread.sleep(3000);
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	  log.info("Thread {} deal No Return Task end at {}", Thread.currentThread().getName(), System.currentTimeMillis());
	 }
	
	 @Async
	 public Future<String> dealHaveReturnTask() throws JSONException {
		  try {
		   Thread.sleep(3000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		  JSONObject jsonObject = new JSONObject();
		  jsonObject.put("thread", Thread.currentThread().getName());
		  jsonObject.put("time", System.currentTimeMillis());
		  return new AsyncResult<String>(jsonObject.toString());
	 }
}
