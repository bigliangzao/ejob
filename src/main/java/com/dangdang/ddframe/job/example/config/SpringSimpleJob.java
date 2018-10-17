package com.dangdang.ddframe.job.example.config;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class SpringSimpleJob implements SimpleJob {
	
	private Log log = LogFactory.getLog(SpringSimpleJob.class);
	
	public void execute(ShardingContext shardingContext) {
		log.info("======================作业开始执行====================");
		int shardingTotalCount = shardingContext.getShardingTotalCount();
		log.info("shardingTotalCount:"+shardingTotalCount);
		int shardingItem = shardingContext.getShardingItem();
		log.info("shardingItem:"+shardingItem);
	}

}
