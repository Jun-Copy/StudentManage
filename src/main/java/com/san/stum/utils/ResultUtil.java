package com.san.stum.utils;

import com.san.stum.common.SysResult;

public class ResultUtil {
	/**
	 * 返回是否成功的结果类
	 */
	public static SysResult getSysResult(int result) {
		SysResult sysResult = new SysResult();
		if (result > 0) {
			sysResult.setResult(true);
			sysResult.setData("操作成功");
		}else{
			sysResult.setResult(false);
			sysResult.setData("操作失败");
		}
		return sysResult;
	}
}
