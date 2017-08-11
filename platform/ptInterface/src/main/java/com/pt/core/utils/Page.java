
package com.pt.core.utils;

import com.github.pagehelper.PageRowBounds;

/**
 * 分页
 *
 */
public class Page extends PageRowBounds {

	/**
	 * 
	 * @param pageSize
	 *            每页记录数
	 * @param _curPageNo
	 *            当前记录数
	 */
	public Page(final int curPageNo, final int pageSize) {
		super(curPageNo, pageSize);
	}

	/**
	 * 获得当前页的页号
	 */
	public int getCurrPage() {
		return this.getOffset();
	}

	/**
	 * 获得每页的记录数
	 */
	public int getPageSize() {
		return this.getLimit();
	}

	/**
	 * 取得总记录数
	 */
	public Long getTotalRecord() {
		return super.getTotal();
	}

	/**
	 * 根据pageSize与totalCount计算总页
	 */
	public Long getTotalPages() {
		if (getTotalRecord() < 0) {
			return 0L;
		}

		Long count = getTotalRecord() / getLimit();
		if (getTotalRecord() % getLimit() > 0) {
			count++;
		}
		return count;
	}
}
