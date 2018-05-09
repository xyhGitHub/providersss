/** 
 * <pre>项目名称:M-R 
 * 文件名称:TestServiceImpl.java 
 * 包名:com.jk.service.impl 
 * 创建日期:2018年3月23日下午4:56:58 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service.impl;

import com.jk.dao.ITestDao;
import com.jk.model.Tests;
import com.jk.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** 
 * <pre>项目名称：M-R    
 * 类名称：TestServiceImpl    
 * 类描述：    
 * 创建人：薛怡衡  
 * 创建时间：2018年3月23日 下午4:56:58    
 * 修改人：薛怡衡    
 * 修改时间：2018年3月23日 下午4:56:58    
 * 修改备注：       
 * @version </pre>    
 */
@Service("testService")
public class TestServiceImpl implements ITestService {

	
	@Autowired
	private ITestDao testDao;

	/* (non-Javadoc)    
	 * @see com.jk.service.ITestService#queryTestsList(com.jk.model.Tests, java.lang.Integer, java.lang.Integer)    
	 */

	public List<Tests> queryInfo(Tests test, Integer offset, Integer limit) {
		
//		value  	缓存的名称，在 spring 配置文件中定义，必须指定至少一个
//		例如：@Cacheable(value=”mycache”) 或者 @Cacheable(value={”cache1”,”cache2”}
		
//		key  缓存的 key，可以为空，如果指定要按照 SpEL 表达式编写，如果不指定，则缺省按照方法的所有参数进行组合
//		例如：@Cacheable(value=”testcache”,key=”#userName”)
		
//		condition  缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存  例如：
//		@Cacheable(value=”testcache”,condition=”#userName.length()>2”)

//		allEntries	是否清空所有缓存内容，缺省为 false，如果指定为 true，则方法调用后将立即清空所有缓存	例如：
//		@CachEvict(value=”testcache”,allEntries=true)
//		beforeInvocation	是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存	例如：
//		@CachEvict(value=”testcache”，beforeInvocation=true)
		
		List<Tests> list = testDao.queryInfo(test,offset,limit);
		
		return list;
	}

	/* (non-Javadoc) 
	 * @see com.jk.service.ITestService#queryCount(com.jk.model.Tests)    
	 */

	public long queryCount(Tests test) {

		
		
		Long a = testDao.queryCount(test);
		
		return a;
	}

	/* (non-Javadoc)    
	 * @see com.jk.service.ITestService#queryEchars()    
	 */
	@Override
	public List<Tests> queryEchars() {

		List<Tests> list = testDao.queryEchars();
		
		return list;
	}
	
}
