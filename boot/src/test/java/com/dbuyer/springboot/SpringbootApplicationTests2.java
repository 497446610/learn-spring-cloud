package com.dbuyer.springboot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbuyer.springboot.jpa.order.MemberInfo;
import com.dbuyer.springboot.jpa.order.MemberInfoRepository;
import com.dbuyer.springboot.jpa.report.TradeOrder;
import com.dbuyer.springboot.jpa.report.TradeOrderRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class SpringbootApplicationTests2 {
	@Autowired
	private MemberInfoRepository userRepository;
	@Autowired
	private TradeOrderRepository messageRepository;
	
	
	@Test
	public void test() throws Exception {
		List<MemberInfo> memberList = userRepository.findAll();
		for (MemberInfo memberInfo : memberList) {
			System.out.println(memberInfo.getRealCd());
		}
		
		List<TradeOrder> tradeOrderList = messageRepository.findAll();
		for (TradeOrder memberInfo : tradeOrderList) {
			System.out.println(memberInfo.getTableName());
		}
		
	}
}

