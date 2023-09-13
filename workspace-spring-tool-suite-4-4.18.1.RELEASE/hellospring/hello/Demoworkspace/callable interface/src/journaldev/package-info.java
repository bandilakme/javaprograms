package com. journaldev.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class MyCallable implements Callable<String> {
	public String call()throws Exception {
		Thread.sleep(1000);
		//return the thread name executing this callable task
		return Thread.currentThread.getName();
	}
	
		
		
	}
}



