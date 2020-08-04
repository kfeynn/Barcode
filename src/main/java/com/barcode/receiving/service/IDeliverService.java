package com.barcode.receiving.service;

import java.util.List;

import com.barcode.app.model.BM;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;
import com.barcode.app.model.TableResult;

public interface IDeliverService {
	
	/** 获取送货单号 */
	String getDnnumByBoxnum(String boxnum);
	
	/** 获取送货单号 */
	String getDnnumByMaterId(String materId);
	
	/** 获取送货单头 */
	PN findPNByDnnum(String dnnum);
	
	/** 获取送货单项 */
	List<PNSub> findPNSubByDnnum(String dnnum);
	
	/** 获取包装票和内标签 */
	List<BM> findBMByDnnum(String dnnum);
	
	TableResult queryDeliverByPN(String index, String content);

	/** 更新内标签 */
	void updatePN(BM[] bmList) throws Exception;
	
	/** 删除内标签 */
	void deletePN(BM[] bmList) throws Exception;
}
