package com.dangdang.ddframe.job.example.config;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class SpringSimpleJob implements SimpleJob {

	public void execute(ShardingContext shardingContext) {
		
		//getShardingTotalCount(), getShardingItem()
		int shardingTotalCount = shardingContext.getShardingTotalCount();
		int shardingItem = shardingContext.getShardingItem();
		System.out.println(shardingItem);
		System.out.println("分片总数为:"+shardingTotalCount);
		System.out.println("作业开始执行=============================================");
	}

}
