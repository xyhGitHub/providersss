/** 
 * <pre>项目名称:M-R 
 * 文件名称:Tests.java 
 * 包名:com.jk.model 
 * 创建日期:2018年3月23日下午4:59:32 
 * Copyright (c) 2018, lxm_man@163.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：M-R    
 * 类名称：Tests    
 * 类描述：    
 * 创建人：薛怡衡  
 * 创建时间：2018年3月23日 下午4:59:32    
 * 修改人：薛怡衡    
 * 修改时间：2018年3月23日 下午4:59:32    
 * 修改备注：       
 * @version </pre>    
 */
public class Tests implements Serializable{

	private static final long serialVersionUID = -7131549335064629614L;
	private Integer userid;
	private String username;
	private String useradr;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseradr() {
		return useradr;
	}
	public void setUseradr(String useradr) {
		this.useradr = useradr;
	}
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "Tests [userid=" + userid + ", username=" + username + ", useradr=" + useradr + "]";
	}
	
	
	
}
