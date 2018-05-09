/** 
 * <pre>项目名称:M-R 
 * 文件名称:ITestService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年3月23日下午4:55:09 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import com.jk.model.Tests;


/** 
 * <pre>项目名称：M-R    
 * 类名称：ITestService    
 * 类描述：    
 * 创建人：薛怡衡  
 * 创建时间：2018年3月23日 下午4:55:09    
 * 修改人：薛怡衡    
 * 修改时间：2018年3月23日 下午4:55:09    
 * 修改备注：       
 * @version </pre>    
 */
public interface ITestService {

	/** <pre>queryTestsList(这里用一句话描述这个方法的作用)   
	 * 创建人：薛怡衡
	 * 创建时间：2018年3月23日 下午5:21:07    
	 * 修改人:薛怡衡      
	 * 修改时间：2018年3月23日 下午5:21:07    
	 * 修改备注： 
	 * @param test
	 * @param offset
	 * @param limit
	 * @return</pre>    
	 */
	List<Tests> queryInfo(Tests test, Integer offset, Integer limit);

	/** <pre>queryCount(这里用一句话描述这个方法的作用)   
	 * 创建人：薛怡衡
	 * 创建时间：2018年3月23日 下午5:21:10    
	 * 修改人:薛怡衡      
	 * 修改时间：2018年3月23日 下午5:21:10    
	 * 修改备注： 
	 * @param test
	 * @return</pre>    
	 */
	long queryCount(Tests test);

	/** <pre>queryEchars(这里用一句话描述这个方法的作用)   
	 * 创建人：薛怡衡
	 * 创建时间：2018年3月25日 下午2:30:50    
	 * 修改人:薛怡衡      
	 * 修改时间：2018年3月25日 下午2:30:50    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Tests> queryEchars();

}
