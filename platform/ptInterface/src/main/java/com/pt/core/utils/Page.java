
package com.pt.core.utils;

import java.util.ArrayList;
import java.util.List;
/**
 * 分页
 *
 * @param <T>
 */
public class Page {

	/**
	 * 当前页码
	 */
	protected int currPage = 1;
	/**
	 * 每页显示的记录数
	 */
	protected int pageSize = 20;

	
	/**
	 * 上页记录数（翻页显示上衣页的行数）
	 */
	protected int preRow = 0;


	/**
	 * 总的记录数
	 */
	protected int totalRecord = 0;

	
	/**
	 * 排序的字段
	 */
	private String orderField = null;
	
	/**
	 * 排序的方向
	 */
	private String orderDirection = null;
	
	public Page() {
		super();
	}

	/**
	 * 
	 * @param pageSize
	 *            每页记录数
	 */
	public Page(final int pageSize) {
		setPageSize(pageSize);
	}

	/**
	 * 
	 * @param pageSize
	 *            每页记录数
	 * @param _curPageNo
	 *            当前记录数
	 */
	public Page( final int curPageNo,final int pageSize) {
		setPageSize(pageSize);
		this.currPage = curPageNo;
	}
	
	public List<Integer> getPageList(){
		List<Integer> list = new ArrayList<Integer>();
		if(getTotalPages() < 5){//总页数小于5页
			for(int i= 1,j= getTotalPages();i<=j;i++){
				list.add(i);
			}
		}else{
			int index = getCurrPage();
			index = index - 2;
			
			if( index + 5 > getTotalPages() ){
				index = getTotalPages() - 5;
			}
			
			if(index <= 0){
				index = 1;
			}
			
			for(int i=0;i<5 && index <= getTotalPages();i++){
				list.add(index++);
			}
			
			if(list.size() < 5){
				
			}
		}
		
		return list;
	}

	/**
	 * 获得当前页的页号
	 */
	public int getCurrPage() {
		return currPage;
	}

	/**
	 * 设置当前页的页号,低于1时自动调整为1.
	 * 
	 * @param curPageNo
	 */
	public void setCurrPage(final int curPageNo) {
		this.currPage = curPageNo;

		if (curPageNo < 1) {
			this.currPage = 1;
		}
	}

	/**
	 * 获得每页的记录数
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 设置每页的记录数
	 * 
	 * @param pageSize
	 */
	public void setPageSize(final int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 根据curPageNo和pageSize（每页显示记录数）计算当前页第一条记录在总结果集中的位置
	 */
	public int getStartRowIndex() {
		int startRowIndex = 0;
		if (currPage > 1) {
			startRowIndex = ((currPage - 1) * pageSize) - preRow;
		} else {
			startRowIndex = ((currPage - 1) * pageSize);
		}
		if (startRowIndex < 0) {
			startRowIndex = 0;
		}
		return startRowIndex;
	}


	/**
	 * 取得总记录数
	 */
	public Integer getTotalRecord() {
		return totalRecord;
	}

	/**
	 * 设置总记录数
	 * 
	 * @param totalCount
	 */
	public void setTotalRecord(final int totalCount) {
		this.totalRecord = totalCount;
	}

	/**
	 * 根据pageSize与totalCount计算总页
	 */
	public Integer getTotalPages() {
		if (totalRecord < 0)
			return 0;

		int count = totalRecord / pageSize;
		if (totalRecord % pageSize > 0) {
			count++;
		}
		return count;
	}

	/**
	 * 是否还有下一页
	 */
	public boolean isHasNext() {
		return (currPage + 1 <= getTotalPages());
	}

	public int getNextPage() {
		if (isHasNext())
			return currPage + 1;
		else
			return currPage;
	}

	/**
	 * 是否还有上一页
	 */
	public boolean isHasPre() {
		return (currPage - 1 >= 1);
	}

	/**
	 * 取得上页
	 */
	public int getPrePage() {
		if (isHasPre())
			return currPage - 1;
		else
			return currPage;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderDirection() {
		return orderDirection;
	}

	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}
	
	
}
