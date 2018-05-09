/** 
 * <pre>项目名称:M-R 
 * 文件名称:ITestDao.java 
 * 包名:com.jk.dao 
 * 创建日期:2018年3月23日下午4:57:54 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.dao;

import com.jk.model.Tests;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/** 
 * <pre>项目名称：M-R    
 * 类名称：ITestDao    
 * 类描述：    
 * 创建人：薛怡衡  
 * 创建时间：2018年3月23日 下午4:57:54    
 * 修改人：薛怡衡    
 * 修改时间：2018年3月23日 下午4:57:54    
 * 修改备注：       
 * @version </pre>    
 */
public interface ITestDao {

	/** <pre>queryTestsList(这里用一句话描述这个方法的作用)   
	 * 创建人：薛怡衡
	 * 创建时间：2018年3月23日 下午5:23:05    
	 * 修改人:薛怡衡      
	 * 修改时间：2018年3月23日 下午5:23:05    
	 * 修改备注： 
	 * @param test
	 * @param offset
	 * @param limit
	 * @return</pre>    
	 */
	List<Tests> queryInfo(@Param("test") Tests test, @Param("offset") Integer offset, @Param("limit") Integer limit);

	/** <pre>queryCount(这里用一句话描述这个方法的作用)   
	 * 创建人：薛怡衡
	 * 创建时间：2018年3月23日 下午5:23:41    
	 * 修改人:薛怡衡      
	 * 修改时间：2018年3月23日 下午5:23:41    
	 * 修改备注： 
	 * @param test
	 * @return</pre>    
	 */
	Long queryCount(@Param("test") Tests test);

	/** <pre>queryEchars(这里用一句话描述这个方法的作用)   
	 * 创建人：薛怡衡
	 * 创建时间：2018年3月25日 下午2:31:44    
	 * 修改人:薛怡衡      
	 * 修改时间：2018年3月25日 下午2:31:44    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Tests> queryEchars();

}
